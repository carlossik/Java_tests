package PageObjects;

import java.util.List;

import SupportingUtilites.ElementExtensions;
import SupportingUtilites.GeneralUtilites;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import SupportingUtilites.BrowserFactory;
import org.openqa.selenium.support.PageFactory;

public class ProteusWebHomePage extends BrowserFactory
{

    private BrowserFactory browserFactory;

    public ProteusWebHomePage(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
        PageFactory.initElements(browserFactory.getDriver(),this );
    }

    //@FindBy(how = How.XPATH, using = "//*[@id='administration']")
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div/div/div/div/nav/label[contains(text(), 'Organisations')]")
    @CacheLookup
    private WebElement tabOrganisations;

    //@FindBy(how = How.XPATH, using = "//*[@id='administration']")
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div/div/div/div/nav/label[contains(text(), 'Home')]")
    @CacheLookup
    private WebElement tabHome;

    //@FindBy(how = How.XPATH, using = "//*[@id='administration']")
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div/div/div/div/nav/label[contains(text(), 'Users')]")
    @CacheLookup
    private WebElement tabUsers;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div/div/div/div/nav/label[contains(text(), 'Vendors')]")
    @CacheLookup
    private WebElement tabVendors;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div/div/div/div/nav/label[contains(text(), 'Reports')]")
    //@FindBy(how = How.ID, using = "reporting")
    @CacheLookup
    private WebElement tabReports;

    //@FindBy(how = How.XPATH, using = "//*[@id='clientReporting'")
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div/div/div/div/nav/label[contains(text(), 'Client Reports')]")
    @CacheLookup
    private WebElement tabClientReporting;


   // @FindBy(how = How.XPATH, using = "//*[@id='campaigns']")
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div/div/div/div/nav/label[contains(text(), 'Campaigns')]")
    @CacheLookup
    private WebElement tabCampaign ;

    // @FindBy(how = How.XPATH, using = "//*[@id='campaigns']")
    @CacheLookup
    private WebElement boxCampaign ;



    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[2]/img")
    @CacheLookup
    private WebElement imgHomeProtues ;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header//button")
    @CacheLookup
    private WebElement btnShowUserOptions  ;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[3]/div/div/div[2]/ul/li[2]")
    @CacheLookup
    private WebElement btnLogOut;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div[2]/div[1]/div/div/input")
    @CacheLookup
    private WebElement dpdwnOperationalUnit;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div[2]/div[1]/div/ul/li[1]")
    @CacheLookup
    private WebElement dpdwnOperationalUnitItems;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div[2]/div/ul/li[1]")
    @CacheLookup
    private WebElement dpdwnGroupAdvertisersItems;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div[4]//ul/li[1]")
    @CacheLookup
    private WebElement dpdwnAgenciesItems;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div[5]//ul/li[1]")
    @CacheLookup
    private WebElement dpdwnDSPsItems;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div[3]//ul/li[1]")
    @CacheLookup
    private WebElement dpdwnAdvertisersItems;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div[2]/div/div/div/div[2]/div")
    @CacheLookup
    private WebElement dpdwnDateRange;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div[1]/div[1]/div/ul/li[1]")
    @CacheLookup
    private WebElement dpdwnDateRangeItems;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div[2]/div/div/input")
    @CacheLookup
    private WebElement dpdwnGroupAdvertisers;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div[3]/div/div/input")
    @CacheLookup
    private WebElement dpdwnAdvertisers;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div[4]/div/div/input")
    @CacheLookup
    private WebElement dpdwnAgencies;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div[5]/div/div/input")
    @CacheLookup
    private WebElement dpdwnDSPs;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//button[text()='apply']")
    @CacheLookup
    private WebElement btnApply;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//button[text()='clear']")
    @CacheLookup
    public WebElement btnClear;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div[2]/div[1]/div/div/div/div[2]/div[1]/div/div[1]")
    @CacheLookup
    public WebElement tblhdData;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//button/span[text()='refresh']/..")
    @CacheLookup
    public WebElement btnRefresh;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//label/span[text()='Cost']")
    @CacheLookup
    public WebElement rdbtnCost;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//label/span[text()='Impressions']")
    @CacheLookup
    public WebElement rdbtnImpressions;

    public void NavigateProteusOrganisations()     {
       GeneralUtilites.wait(1);
       mouseClick(tabOrganisations );
    }

    public void NavigateProteusUsers()    {
        GeneralUtilites.wait(1);
        mouseClick(tabUsers );
    }

    public void NavigateProteusVendors()    {
        GeneralUtilites.wait(1);
        mouseClick(tabVendors );
    }

    public void NavigateProteusCampaign()    {
        GeneralUtilites.wait(1);
        if(tabCampaign.isDisplayed())
            mouseClick(tabCampaign);
        else if(boxCampaign.isDisplayed())
            mouseClick(boxCampaign);
    }

    public void NavigateProteusHome()    {
        GeneralUtilites.wait(1);
        mouseClick(tabHome );
    }

    public void NavigateProteusReports()    {
        GeneralUtilites.wait(1);
         mouseClick(tabReports );
    }

    public void NavigateProteusClientReports()    {
        GeneralUtilites.wait(1);
         mouseClick(tabClientReporting );
    }

    public boolean CheckCampaignTabExist()    {
        if(tabCampaign.isDisplayed())
            return true;
        else
          return boxCampaign.isDisplayed();
    }

    public boolean CheckReportsTabExist()    {
        return tabReports.isDisplayed();
    }

    public boolean CheckClientReportsTabExist()    {
        return tabClientReporting.isDisplayed();
    }
    public boolean CheckOrganisationsTabExist()    {
        return tabOrganisations.isDisplayed();
    }

    public boolean  CheckVendorsTabExist()    {
        return tabVendors.isDisplayed();
    }

    public boolean CheckUsersTabExist()    {
        return tabUsers.isDisplayed();
    }

    public boolean CheckHomeTabExist()    {
        return tabHome.isDisplayed();
    }

    public boolean CheckHomePage()    {
       // return getElementCount("//*[@id='root']/div/section/div/div[1]/div[2]/div[2]/div/div/div/div//h5") > 1;
        return true;
    }

    public boolean checkForFilterOptions()    {
       GeneralUtilites.wait(1);
       return dpdwnDateRange.isDisplayed() &&
              dpdwnOperationalUnit.isDisplayed() &&
              dpdwnGroupAdvertisers.isDisplayed() &&
              dpdwnAdvertisers.isDisplayed() &&
              dpdwnAgencies.isDisplayed() &&
              dpdwnDSPs.isDisplayed();
    }

    public boolean checkForDatagrid(){
        GeneralUtilites.wait(1);
        return tblhdData.isDisplayed();
    }

    public boolean checkForGraphFilter(){
        GeneralUtilites.wait(1);
        return rdbtnCost.isDisplayed() && rdbtnImpressions.isDisplayed();
    }

    public void changeFilterOptions(){
       mouseClick( dpdwnDateRange);
       GeneralUtilites.wait(1);
       mouseClick(dpdwnDateRangeItems);
       mouseClick(btnApply);
    }

    public boolean CheckLogOutExist()    {
        GeneralUtilites.wait(0.5);
        mouseClick(btnShowUserOptions);
        GeneralUtilites.wait(0.5);
        boolean boolLogOut = btnLogOut.isDisplayed();
        mouseClick(btnShowUserOptions );
        return boolLogOut;
    }

    public void Logout()    {
         mouseClick( btnShowUserOptions);
         GeneralUtilites.wait(0.5);
         mouseClick(btnLogOut );
    }
}
