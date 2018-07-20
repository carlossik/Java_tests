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
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[1]/div/div/div/nav/label[contains(text(), 'Admin')]")
    @CacheLookup
    private WebElement tabAdministration;

    @FindBy(how = How.ID, using = "reporting")
    @CacheLookup
    private WebElement tabReporting;

    //@FindBy(how = How.XPATH, using = "//*[@id='clientReporting'")
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[1]/div/div/div/nav/label[contains(text(), 'Client Reports')]")
    @CacheLookup
    private WebElement tabClientReporting;


   // @FindBy(how = How.XPATH, using = "//*[@id='campaigns']")
    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[1]/div/div/div/nav/label[contains(text(), 'Campaigns')]")
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
    private WebElement btnExpand  ;


    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[3]/div/div/div[2]/ul/li[2]")
    @CacheLookup
    private WebElement btnLogOut;


    public void NavigateProteusAdministration()
    {
        GeneralUtilites.wait(1);
        mouseClick(tabAdministration );
    }

    public void NavigateProteusCampaign()
    {
        GeneralUtilites.wait(1);
        if(tabCampaign.isDisplayed())
            mouseClick(tabCampaign);
        else if(boxCampaign.isDisplayed())
            mouseClick(boxCampaign);
    }

    public void NavigateProteusReports()
    {
        GeneralUtilites.wait(1);
         mouseClick(tabReporting );
    }

    public void NavigateProteusClientReports()
    {
        GeneralUtilites.wait(1);
         mouseClick(tabClientReporting );
    }

    public boolean CheckCampaignTabExist()
    {
        if(tabCampaign.isDisplayed())
            return true;
        else
          return boxCampaign.isDisplayed();

    }

    public boolean CheckReportsTabExist()
    {
        return tabReporting.isDisplayed();
    }
    public boolean CheckClientReportsTabExist()
    {
        return tabClientReporting.isDisplayed();
    }
    public boolean CheckAdministrationTabExist()
    {
        return tabAdministration.isDisplayed();
    }

    public boolean CheckHomePage()
    {
       // return getElementCount("//*[@id='root']/div/section/div/div[1]/div[2]/div[2]/div/div/div/div//h5") > 1;
        return true;
    }

    public boolean CheckLogOutExist()
    {
        GeneralUtilites.wait(0.5);
         mouseClick(btnExpand);
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
