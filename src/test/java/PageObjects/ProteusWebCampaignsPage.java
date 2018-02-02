package PageObjects;

import SupportingUtilites.BrowserFactory;
import SupportingUtilites.GeneralUtilites;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.*;
import SupportingUtilites.ElementExtensions;

public class ProteusWebCampaignsPage extends BrowserFactory
{
    private BrowserFactory browserFactory;

    public ProteusWebCampaignsPage(BrowserFactory browserFactory)
    {
        this.browserFactory = browserFactory;
        PageFactory.initElements(browserFactory.getDriver(),this );
    }

    @FindBy(how= How.XPATH , using = "//*[@id='3']")
    @CacheLookup
    public WebElement txtCampaigns;


    @FindBy(how= How.XPATH , using = "//*[@id='root']/div/header/div/div[3]/div/div/div[1]/button")
    @CacheLookup
    public WebElement btnExpand ;


    @FindBy(how= How.XPATH , using = "//*[@id='root']/div/section/div/div[1]/aside/button")
    @CacheLookup
    public WebElement btnFLIGHTS ;


    @FindBy(how= How.XPATH , using = "//*[@id='root']/div/header/div/div[3]/div/div/div[2]/ul/li[2]")
    @CacheLookup
    public WebElement btnLogOut ;

    @FindBy(how= How.XPATH , using = "//*[@id='root']//*[@class='flightsFilterSearchText']//input")
    @CacheLookup
    public WebElement txtSearch;

    @FindBy(how= How.XPATH , using = "//*[@id='root']//*[@class='flightsFilterSort']//button")
    @CacheLookup
    public WebElement txtSort;

    @FindBy(how= How.XPATH , using = "//*[@id='root']//*[@class='flightsFilterAdvertiser']//input")
    @CacheLookup
    public WebElement txtAdvertiser ;

    @FindBy(how= How.XPATH , using = "//*[@id='root']//input[@name='onlyWithEmptyGoalOrUnknownTrader']")
    @CacheLookup
    public WebElement chbxRequiresAction ;

    @FindBy(how= How.XPATH , using = "//*[@id='root']//*[@class='flightsFilterAgency']//input")
    @CacheLookup
    public WebElement txtAgency;

    @FindBy(how= How.XPATH , using= "//*[@id='root']//*[contains(@class,'flightsFilterApply')]")
    @CacheLookup
    public WebElement btnApplyFilters ;

    @FindBy(how= How.XPATH , using= "//*[@id='root']//*[contains(@class,'flightsFilterCancel')]")
    @CacheLookup
    public WebElement btnClearFilters ;

    @FindBy(how= How.XPATH , using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]")
    @CacheLookup
    public WebElement rowFlights ;


    public boolean CheckCampaignsPageLoad()
    {
        return txtCampaigns.isDisplayed();
    }

    public int GetFligtRowsCount()
    {
       By FlightRow = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div");
       List<WebElement> elementTypes = browserFactory.getDriver().findElements(FlightRow);
       System.out.println("Flight Count : " + elementTypes.size() );
       return elementTypes.size();
    }

    public boolean CheckFLIGHTSExist()
    {
        return btnExpand.isDisplayed();
    }

    public boolean CheckLogOutExist()
    {
      mouseClick(btnExpand );
        //btnExpand.mouseClick();
        boolean boolLogOut = btnLogOut.isDisplayed();
         mouseClick(btnExpand );
        //btnExpand.mouseClick();
        return boolLogOut;
    }

    public void Logout()
    {
         mouseClick(btnExpand );
        //btnExpand.mouseClick();
        GeneralUtilites.wait(0.5);
        mouseClick(btnLogOut );
        //btnLogOut.mouseClick();
    }


    public boolean CheckSearchByFlightNameOrBookingCodeExist()
    {
        try
        {
             enterText(txtSearch,"FINANCE");
             enterText(txtSearch,"IO-6466");
             return txtSearch.isDisplayed();
        }
        catch(Exception ex)
        {
            System.out.println("Exception : " + ex.getMessage());
            return false;
        }
    }

    public void EnterSearchFilter(String Sort, String Search , String Advertiser, String Agency)
    {
        if (!Sort.equals(""))
             enterText(txtSort,Sort);
        if (!Search.equals(""))
             enterText(txtSearch,Search);
            //txtSearch.enterText(Search);
        if (!Advertiser.equals(""))
           enterText(txtAdvertiser,Advertiser);
            //txtAdvertiser.enterText(Advertiser);
        if (!Agency.equals(""))
            enterText(txtAgency,Agency);
            //txtAgency.enterText(Agency);
    }

    public boolean CheckFliterExist()
    {
        return txtAdvertiser.isDisplayed() && txtAgency.isDisplayed();
    }

}
