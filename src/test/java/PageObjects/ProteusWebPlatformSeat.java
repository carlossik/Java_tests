package PageObjects;

import SupportingUtilites.BrowserFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class ProteusWebPlatformSeat extends BrowserFactory {
    private BrowserFactory browserFactory;

    public ProteusWebPlatformSeat(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
        PageFactory.initElements(browserFactory.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]//button")
    @CacheLookup
    public WebElement btnManageCredentials;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div[1]/div[2]//button")
    @CacheLookup
    public WebElement btnManageConfigurations;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div[3]/form/div/div[2]/div[7]/div[1]/div[2]/button")
    @CacheLookup
    public WebElement btnAddStorgeLocation;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[1]/div[1]/div/input")
    @CacheLookup
    public WebElement txtDataType;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[1]/div[2]/div[2]/div/div")
    @CacheLookup
    public WebElement txtDataFormat;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[1]/div[3]/div[2]/div/div")
    @CacheLookup
    public WebElement txtSchema;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[2]/input")
    @CacheLookup
    public WebElement txtBucketName;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[3]/div/input")
    @CacheLookup
    public WebElement txtFileNamePattern;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[4]/input")
    @CacheLookup
    public WebElement txtFolderNamePattern;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[5]/input")
    @CacheLookup
    public WebElement txtReadyFileNamePattern;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div[2]/p")
    @CacheLookup
    public WebElement lblCredentials;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[3]/label/div")
    @CacheLookup
    public WebElement chbxRegularExpression;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[6]/button[2]")
    @CacheLookup
    public WebElement btnCancel;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[6]/button[1]")
    @CacheLookup
    public WebElement btnSave;

}