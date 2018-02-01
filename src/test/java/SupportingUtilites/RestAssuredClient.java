package SupportingUtilites;

import DataModels.CampaignFlightSearchInput;
import DataModels.CampaignFlightSearchOutPut;
import DataModels.Login;
import DataModels.Oauth;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.parsing.Parser;
import io.restassured.response.ResponseBody;
import org.apache.maven.doxia.site.decoration.Body;

import java.util.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;

import static io.restassured.RestAssured.given;

public class RestAssuredClient
{
    static String currentPath = System.getProperty("user.dir");
    static Properties prop = new Properties();
    InputStream input = null;

    static String Client_id= "";
    static String Client_secret= "";
    static String Access_token = "";

    static
    {
        try
        {
            InputStream input = new FileInputStream(currentPath + "/src/test/java/Resources/config.properties");
            prop.load(input);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public RestAssuredClient()
    {
        try
        {
            InputStream input = new FileInputStream(currentPath + "/src/test/java/Resources/config.properties");
            prop.load(input);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void setup()
    {
        try
        {
            InputStream input = new FileInputStream(currentPath + "/src/test/java/Resources/config.properties");
            prop.load(input);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.exit(0);
        }

        String port = prop.getProperty("port");
        if (port == null) {
            RestAssured.port =  8080;
        }
        else{
            RestAssured.port = Integer.valueOf(port);
        }
        String baseHost = System.getProperty("baseURI");
        if(baseHost==null){
            baseHost = "http://proteus.c3podev.tel-dev.io:8081/api/v1";
        }
        RestAssured.baseURI = baseHost;
    }


    public static Response RestRequestExecute(Method method,String endpoint, Object objInput)
    {
        RestAssured.defaultParser = Parser.JSON;
       // RestAssured.baseURI = prop.getProperty("baseURI").replace("{Environment}",prop.getProperty("Environment"));
        if (method.equals(Method.GET)) {
            return given().contentType("application/json").header("Authorization","Bearer "+Access_token).body(objInput).when().get(prop.getProperty("baseURI").replace("{Environment}",prop.getProperty("Environment"))+endpoint).then().contentType(ContentType.JSON).extract().response();
        } else if (method.equals(Method.POST)) {
               return given().contentType("application/json").header("Authorization","Bearer "+Access_token).body(objInput).when().post(prop.getProperty("baseURI").replace("{Environment}",prop.getProperty("Environment"))+endpoint).then().extract().response();
        } else if (method.equals(Method.PUT)) {
              return given().contentType("application/json").header("Authorization","Bearer "+Access_token).body(objInput).when().put(prop.getProperty("baseURI").replace("{Environment}",prop.getProperty("Environment"))+endpoint).then().extract().response();
        }
        return  null;
    }

    public static void GetMetalabAccess()
    {
        try
        {
         //   RestAssured.baseURI = "http://metalab."+prop.getProperty("Environment")+".tel-dev.io/db_api.php?table=metalab.oauth_client";
            RestAssured.defaultParser = Parser.JSON;
            Response objResponse =  given().contentType("application/json")
                    .when()
                    .get("http://metalab."+prop.getProperty("Environment")+".tel-dev.io/db_api.php?table=metalab.oauth_client")
                    .then()
                    .extract()
                    .response() ;


            List<Oauth> objOauths = Arrays.asList(objResponse.getBody().as(Oauth[].class));
            Oauth proteusHome  = getOauthObject(objOauths, "proteus_home");
            Client_secret   = proteusHome.getSecret();
            Client_id = proteusHome.getOauth_client_id() + "_"+proteusHome.getRandom_id();

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.exit(0);
        }
    }

    public static void ProteusHomeLogin()
    {
        try
        {
            if (Client_id.equals(""))
                GetMetalabAccess();

            String Url = "http://metalab." +
                    prop.getProperty("Environment")+
                    ".tel-dev.io/oauth/v2/token?grant_type=password&client_id="+
                    Client_id+"&client_secret="+Client_secret+"&username="+
                    prop.getProperty("AdminUserName")+"&password="+
                    prop.getProperty("AdminPassword");
            RestAssured.defaultParser = Parser.JSON;

            Response objResponse =   given().contentType("application/json").
                    when().get(Url).then().contentType(ContentType.JSON).extract().response();
            Login objLogin = objResponse.as(Login.class);
            Access_token = objLogin.getAccess_token();

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.exit(0);
        }
    }


    public static Oauth getOauthObject(List<Oauth> objOauths, String searchText)
    {
       for(int i =0 ; i< objOauths.size();i++)
       {
           if(objOauths.get(i).getName().equals("proteus_home") && objOauths.get(i).getRedirect_uris().contains(prop.getProperty("Environment")))
               return objOauths.get(i);
       }
       return null;
    }
    public static int GetFlightCount(String endPoint, String searchText, String Advertiser, String Agency)
    {
        if(Access_token.equals(""))
            ProteusHomeLogin();

        CampaignFlightSearchInput objInput = new CampaignFlightSearchInput();
        if (!searchText.equals(""))
            objInput.setSearchText(searchText);
        if (!Advertiser.equals(""))
            objInput.setAdvertiserId(Advertiser);
        if (!Agency.equals(""))
            objInput.setAgencyId(Agency);
        //Response objResponse =  RestRequestExecute(Method.POST,"/campaign-flight/search?order-by=START_DATE_DESC&page-number=0&page-size=20",objInput);
        Response objResponse =  RestRequestExecute(Method.POST,endPoint,objInput);
        CampaignFlightSearchOutPut objCampaignFlightSearchOutPut = objResponse.as(CampaignFlightSearchOutPut.class);
        return Integer.parseInt( objCampaignFlightSearchOutPut.getCount());
    }
}
