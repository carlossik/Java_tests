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

    @FindBy(how = How.ID, using = "administration")
    @CacheLookup
    public WebElement tabAdministration;

    @FindBy(how = How.ID, using = "reporting")
    @CacheLookup
    public WebElement tabReporting;

    @FindBy(how = How.ID, using = "clientReporting")
    @CacheLookup
    public WebElement tabClientReporting;

    @FindBy(how = How.ID, using = "campaigns")
    @CacheLookup
    public WebElement tabCampaign ;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[2]/img")
    @CacheLookup
    public WebElement imgHomeProtues ;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[3]/div/div/div[1]/button")
    @CacheLookup
    public WebElement btnExpand  ;


    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[3]/div/div/div[2]/ul/li[2]")
    @CacheLookup
    public WebElement btnLogOut;


    public void NavigateProteusAdministration()
    {
        GeneralUtilites.wait(1);
        ElementExtensions.mouseClick(tabAdministration,browserFactory.getDriver());
    }

    public void NavigateProteusCampaign()
    {
        GeneralUtilites.wait(1);
        ElementExtensions.mouseClick(tabCampaign,browserFactory.getDriver());
    }

    public void NavigateProteusReports()
    {
        GeneralUtilites.wait(1);
        ElementExtensions.mouseClick(tabReporting,browserFactory.getDriver());
    }

    public void NavigateProteusClientReports()
    {
        GeneralUtilites.wait(1);
        ElementExtensions.mouseClick(tabClientReporting,browserFactory.getDriver());
    }

    public boolean CheckCampaignTabExist()
    {
        return tabCampaign.isDisplayed();
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
        return imgHomeProtues.isDisplayed();
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
