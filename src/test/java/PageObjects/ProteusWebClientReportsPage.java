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

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[1]/aside/button[1]")
    @CacheLookup
    public WebElement btnDashBoard;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[1]/aside/button[2]")
    @CacheLookup
    public WebElement btnPerformance;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[1]/aside/button[3]")
    @CacheLookup
    public WebElement btnDSP;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[1]/aside/button[4]")
    @CacheLookup
    public WebElement btnTactics;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[2]/div/div/div/div[1]/div/div[2]/div[1]")
    @CacheLookup
    public WebElement txtRecentFligts;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div")
    @CacheLookup
    public WebElement txtPerformanceOverview;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div")
    @CacheLookup
    public WebElement txtDSPOverview;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div")
    @CacheLookup
    public WebElement txtTacticsOverview;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[3]/div/div/div[1]/button")
    @CacheLookup
    public WebElement btnExpand;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[3]/div/div/div[2]/ul/li[2]")
    @CacheLookup
    public WebElement btnLogOut;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/section/div[2]/form/div[1]/div[1]/div/input")
    @CacheLookup
    public WebElement txtAdvertiser;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/section/div[2]/form/div[1]/div[1]/ul/li[2]")
    @CacheLookup
    public WebElement lstAdvertiser;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/section/div[2]/form/div[2]/button")
    @CacheLookup
    public WebElement btnOK;




   public void SelectAdvertiser()
   {
       Actions action = new Actions(browserFactory.getDriver());
       action.moveToElement(txtAdvertiser).build().perform();
       action.click(txtAdvertiser).perform();
       GeneralUtilites.wait(1);
       action.moveToElement(lstAdvertiser).build().perform();
       action.click(lstAdvertiser).perform();

     //  String tAdvertiser = lstAdvertiser.getText();
      // System.out.println("tAdvertiser : " + tAdvertiser);

     //  ElementExtensions.enterText(txtAdvertiser,tAdvertiser);
       GeneralUtilites.wait(1);
       ElementExtensions.mouseClick(btnOK,browserFactory.getDriver());
       GeneralUtilites.wait(1);
   }

    public void NavigateClientReportDashborad()
    {
        GeneralUtilites.wait(1);
        ElementExtensions.mouseClick(btnDashBoard,browserFactory.getDriver());
    }

    public void NavigateClientReportPerformance()
    {
        GeneralUtilites.wait(1);
        ElementExtensions.mouseClick(btnPerformance,browserFactory.getDriver());
    }

    public void NavigateClientReportDSP()
    {
        GeneralUtilites.wait(1);
        ElementExtensions.mouseClick(btnDSP,browserFactory.getDriver());
    }

    public void NavigateClientReportTactics()
    {
        GeneralUtilites.wait(1);
        ElementExtensions.mouseClick(btnTactics,browserFactory.getDriver());
    }

    public boolean CheckLogOutExist()
    {
        GeneralUtilites.wait(0.5);
        ElementExtensions.mouseClick(btnExpand,browserFactory.getDriver());
        GeneralUtilites.wait(0.5);
        boolean boolLogOut = btnLogOut.isDisplayed();
        ElementExtensions.mouseClick(btnExpand,browserFactory.getDriver());
        return boolLogOut;
    }

    public void Logout()
    {
        ElementExtensions.mouseClick(btnExpand,browserFactory.getDriver());
        GeneralUtilites.wait(0.5);
        ElementExtensions.mouseClick(btnLogOut,browserFactory.getDriver());
    }
}
