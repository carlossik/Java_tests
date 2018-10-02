package PageObjects;

import SupportingUtilites.ElementExtensions;
import SupportingUtilites.GeneralUtilites;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import SupportingUtilites.BrowserFactory;
import org.openqa.selenium.support.PageFactory;

public class ProteusWebClientReportsPage extends BrowserFactory
{
    private BrowserFactory browserFactory;

    public ProteusWebClientReportsPage(BrowserFactory browserFactory)
    {
        this.browserFactory = browserFactory;
        PageFactory.initElements(browserFactory.getDriver(),this );
    }

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[1]/aside/div[1]//button")
    @CacheLookup
    public WebElement btnDashBoard;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[1]/aside/div[2]//button")
    @CacheLookup
    public WebElement btnPerformance;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[1]/aside/div[3]//button")
    @CacheLookup
    public WebElement btnDSP;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[1]/aside/div[4]//button")
    @CacheLookup
    public WebElement btnTactics;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[2]/div/div/div/div[1]/div/h4")
    @CacheLookup
    public WebElement txtRecentFligts;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[2]/div/div/div/div[1]/div/div[1]/h4")
    @CacheLookup
    public WebElement txtPerformanceOverview;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[2]/div/div/div/div[1]/div/div[1]/h4")
    @CacheLookup
    public WebElement txtDSPOverview;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[2]/div/div/div/div[1]/div/div[1]/h4")
    @CacheLookup
    public WebElement txtTacticsOverview;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header//button")
    @CacheLookup
    private WebElement btnExpand;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[3]/div/div/div[2]/ul/li[2]")
    @CacheLookup
    private WebElement btnLogOut;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[1]/div[1]/div/input")
    @CacheLookup
    public WebElement txtAdvertiser;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[1]/div[1]/ul/li[2]")
    @CacheLookup
    private WebElement lstAdvertiser;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[2]/button")
    @CacheLookup
    private WebElement btnOK;

   public void SelectAdvertiser()
   {
       GeneralUtilites.wait(1);
       Actions action = new Actions(browserFactory.getDriver());
       action.moveToElement(txtAdvertiser).build().perform();
       action.click(txtAdvertiser).perform();
       action.sendKeys("tr").perform();
       GeneralUtilites.wait(1);
       action.moveToElement(lstAdvertiser).build().perform();
       action.click(lstAdvertiser).perform();
       GeneralUtilites.wait(1);
       mouseClick(btnOK );
       GeneralUtilites.wait(1);
   }


    public void NavigateClientReportDashborad()
    {
        GeneralUtilites.wait(1);
         mouseClick(btnDashBoard );
    }

    public void NavigateClientReportPerformance()
    {
        GeneralUtilites.wait(1);
         mouseClick(btnPerformance );
    }

    public void NavigateClientReportDSP()
    {
        GeneralUtilites.wait(1);
         mouseClick(btnDSP );
    }

    public void NavigateClientReportTactics()
    {
        GeneralUtilites.wait(1);
         mouseClick(btnTactics );
    }

    public boolean CheckLogOutExist()
    {
        GeneralUtilites.wait(0.5);
        mouseClick(btnExpand );
        GeneralUtilites.wait(0.5);
        boolean boolLogOut = btnLogOut.isDisplayed();
        mouseClick(btnExpand );
        return boolLogOut;
    }

    public void Logout()
    {
        mouseClick(btnExpand );
        GeneralUtilites.wait(0.5);
        mouseClick(btnLogOut );
    }
}
