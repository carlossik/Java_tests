package PageObjects;

  import SupportingUtilites.GeneralUtilites;
  import org.openqa.selenium.WebElement;
  import org.openqa.selenium.interactions.Actions;
  import org.openqa.selenium.support.*;
  import SupportingUtilites.BrowserFactory;
  import org.openqa.selenium.support.PageFactory;

public class ProteusWebAdminPage extends BrowserFactory
{
    private BrowserFactory browserFactory;

    public ProteusWebAdminPage(BrowserFactory browserFactory)
    {
        this.browserFactory = browserFactory;
        PageFactory.initElements(browserFactory.getDriver(),this );
    }

    @FindBy(how = How.XPATH, using = " //*[@id='root']/div/section/div/div[1]/aside/button[1]")
    @CacheLookup
    public WebElement btnSeats;

    @FindBy(how = How.XPATH, using = " //*[@id='root']/div/section/div/div[1]/aside/button[2]")
    @CacheLookup
    public WebElement btnJobs;//*[@id="root"]/div/section/div/div[1]/aside/button/div[contains(text(),'Security Groups')]

    @FindBy(how = How.XPATH, using = " //*[@id='root']/div/section/div/div[1]/aside/button[3]")
    @CacheLookup
    public WebElement btnMasterData;

    @FindBy(how = How.XPATH, using = " //*[@id='root']/div/section/div/div[1]/aside/button[4]")
    @CacheLookup
    private WebElement btnAdvertiserAccounts;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[1]/aside/button/div[contains(text(),'Security Groups')]")
    @CacheLookup
    public WebElement btnSecurityGroups;

    @FindBy(how = How.XPATH, using = " //*[@id='root']/div/section/div/div[2]/div/div/div/div/div[1]/div[1]/button")
    @CacheLookup
    public WebElement btnAddPlatform;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]")
    @CacheLookup
    public WebElement grdSeats;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[1]//div[2]/div[1]/button")
    @CacheLookup
    public WebElement btnJobsRefresh ;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/input")
    @CacheLookup
    public WebElement drpdwnOperationalUnit ;

    @FindBy(how = How.ID, using = "TEL")
    @CacheLookup
    private WebElement lstTEL;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/button")
    @CacheLookup
    public WebElement btnMasterDataAddPubLocation ;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div/button")
    @CacheLookup
    public WebElement btnMasterDataAddJobScdTemplates ;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[2]/img")
    @CacheLookup
    public WebElement imgHomeProtues ;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header//button")
    @CacheLookup
    private WebElement btnExpand;


    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[3]/div/div/div[2]/ul/li[2]")
    @CacheLookup
    private WebElement btnLogOut;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[1]/div[2]/div[3]/div/input")
    @CacheLookup
    public WebElement txtSearch;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div[1]/div/div//div[@aria-label='row']")
    @CacheLookup
    public WebElement rowPlaformSeat;

    public void NavigateAdministrationSeats()
    {
        GeneralUtilites.wait(1);
        mouseClick(btnSeats );

    }

    public void NavigateAdministrationJobs()
    {
        GeneralUtilites.wait(1);
        mouseClick(btnJobs );
    }

    public void NavigateAdministrationMasterData()
    {
        GeneralUtilites.wait(1);
        mouseClick(btnMasterData );
    }

    public void NavigateAdministrationAdvertiserAccounts()
    {
        GeneralUtilites.wait(1);
        mouseClick(btnAdvertiserAccounts );
    }

    public boolean FilterOperationalUnit()
    {
      try
      {
          Actions action = new Actions(browserFactory.getDriver());
          action.moveToElement(drpdwnOperationalUnit).build().perform();
          action.click(drpdwnOperationalUnit).perform();
          action.moveToElement(lstTEL).build().perform();
          action.click(lstTEL).perform();
          return true;
      }
      catch (Exception ex)
      {
          System.out.println(ex.toString());
          return false;
      }
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
