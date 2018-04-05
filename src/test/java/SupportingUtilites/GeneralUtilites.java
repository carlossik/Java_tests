package SupportingUtilites;
import DBDataModel.JDBCTemplate;
import DBDataModel.campaign_flight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.SecureRandom;
import java.util.*;
import java.io.*;


public class GeneralUtilites
{
    private static Properties  prop = new Properties();
    private static String currentPath = System.getProperty("user.dir");
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

    public static String randomStringGenerator(int intSize)    {
      return  new RandomString(intSize).nextString();
    }

    public static int RandomNumber(int Low, int High)    {
        return  new Random().nextInt((High - Low) + 1) + Low;
    }

    public static void wait(int seconds)    {
        try
        {
            Thread.sleep(seconds * 1000);
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }

    public static void wait(double seconds)    {
        try
        {
        Thread.sleep((int)seconds * 1000);
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }

    private static boolean isProcessRunning(String serviceName) throws Exception    {
        Process p = Runtime.getRuntime().exec( "tasklist");
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(p.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null)
        {
           // System.out.println(line);
            if (line.contains(serviceName))
                return true;
        }
        return false;
    }

    public static void KillProcesses()    {
        try
        {
            switch (prop.getProperty("Browser"))
            {
                case "Firefox" :
                    if (isProcessRunning("geckodriver.exe"))
                        Runtime.getRuntime().exec("taskkill /F /IM " + "geckodriver.exe");
                    if (isProcessRunning("firefox.exe"))
                        Runtime.getRuntime().exec("taskkill /F /IM " + "firefox.exe");
                    break;
                case "IE" :
                    if (isProcessRunning("IEDriverServer.exe"))
                        Runtime.getRuntime().exec("taskkill /F /IM " + "IEDriverServer.exe");
                    if (isProcessRunning("iexplore.exe"))
                        Runtime.getRuntime().exec("taskkill /F /IM " + "iexplore.exe");
                    break;
               default:
                   if (isProcessRunning("chromedriver.exe"))
                       Runtime.getRuntime().exec("taskkill /F /IM " + "chromedriver.exe");
                   if (isProcessRunning("chrome.exe"))
                       Runtime.getRuntime().exec("taskkill /F /IM " + "chrome.exe");
                   break;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static String getFlightNameDB(String strCondition){
        String strQuery;
        switch (strCondition)
        {
            case "NoGoalDetails" :
                strQuery = prop.getProperty("SQLQueryFlightNameWithNoGoalDetails");
                break;
            case "NoTrader" :
                strQuery = prop.getProperty("SQLQueryFlightNameWithNoTrader");
                break;
            default:
                strQuery = prop.getProperty("SQLQueryFlightNameForFlightId") + strCondition ;
        }
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        JDBCTemplate objJDBCTemp = (JDBCTemplate) context.getBean("JDBCTemplate");
        List<campaign_flight> objCamFlgt = objJDBCTemp.GetCampaignFlightDetails(strQuery);
        return objCamFlgt.get(0).getcampaign_flight_name();
    }
}
