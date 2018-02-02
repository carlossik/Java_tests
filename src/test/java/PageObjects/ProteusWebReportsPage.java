package PageObjects;

import SupportingUtilites.ElementExtensions;
import SupportingUtilites.GeneralUtilites;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import SupportingUtilites.BrowserFactory;
import org.openqa.selenium.support.PageFactory;

public class ProteusWebReportsPage extends BrowserFactory
{
    private BrowserFactory browserFactory;

    public ProteusWebReportsPage(BrowserFactory browserFactory)
    {
        this.browserFactory = browserFactory;
        PageFactory.initElements(browserFactory.getDriver(),this );
    }

    @FindBy(how = How.XPATH, using = " //*[@id='root']/div/section/div/div/div[1]/aside/button[1]")
    @CacheLookup
    public WebElement btnPlatform;

    @FindBy(how = How.XPATH, using = " //*[@id='root']/div/section/div/div/div[1]/aside/button[2]")
    @CacheLookup
    public WebElement btnClient;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[3]/div/div/div[1]/button")
    @CacheLookup
    public WebElement btnExpand;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[3]/div/div/div[2]/ul/li[2]")
    @CacheLookup
    public WebElement btnLogOut;


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
        mouseClick(btnExpand);
        GeneralUtilites.wait(0.5);
        mouseClick(btnLogOut);
    }
}
