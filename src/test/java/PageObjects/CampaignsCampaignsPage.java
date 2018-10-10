
package PageObjects;

        import SupportingUtilites.GeneralUtilites;
        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Action;
        import org.openqa.selenium.interactions.Actions;
        import org.openqa.selenium.support.*;
        import SupportingUtilites.BrowserFactory;
        import org.openqa.selenium.support.PageFactory;
        import java.util.ArrayList;
        import java.util.List;

public class CampaignsCampaignsPage extends BrowserFactory {

    private BrowserFactory browserFactory;

    public CampaignsCampaignsPage(BrowserFactory browserFactory)    {
        this.browserFactory = browserFactory;
        PageFactory.initElements(browserFactory.getDriver(),this );
    }

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section//button/div[text()='Flights']/..")
    @CacheLookup
    public WebElement btnFLIGHTS;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section//button/div[text()='Campaigns']/..")
    @CacheLookup
    public WebElement btnCAMPAIGNS;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section//button/div[text()='Creatives']/..")
    @CacheLookup
    public WebElement btnCREATIVES;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section//button/div[text()='Pixels']/..")
    @CacheLookup
    public WebElement btnPIXELS;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//h5")
    @CacheLookup
    public WebElement lblCampaignsCount;

    @FindBy(how=How.XPATH, using = "//*[@id='root']/div/section//label[@data-react-toolbox='radio-button']/span[text()='Current']")
    @CacheLookup
    public WebElement rdbtnCurrent;

    @FindBy(how=How.XPATH, using = "//*[@id='root']/div/section//label[@data-react-toolbox='radio-button']/span[text()='Ended']")
    @CacheLookup
    public WebElement rdbtnEnded;

    @FindBy(how=How.XPATH, using = "//*[@id='root']/div/section//label[@data-react-toolbox='checkbox']/span")
    @CacheLookup
    public WebElement chbtnShowDecimalPlaces;

    //  Header
    // "//*[@id='root']/div/section//div[@role='columnheader']/div[text()='"+TableHeader+"']"

    //Expand
    //  //*[@id='root']/div/section//i[contains(@class,'expandedIconCollapsed')]

    // Collaspe
    //*[@id='root']/div/section//i[contains(@class,'expandIconExpanded')]


    @FindBy(how=How.XPATH, using = " //*[@id='root']//div[@class='local_menuButton_oXknz automation_operationalLevelReportsIcon']/button")
    @CacheLookup
    public WebElement btnOperationalLevelReport;

}