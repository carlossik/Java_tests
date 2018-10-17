package PageObjects;

import SupportingUtilites.GeneralUtilites;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import SupportingUtilites.BrowserFactory;
import org.openqa.selenium.support.PageFactory;

public class AdminSecurityGroupsPage extends BrowserFactory {

    private BrowserFactory browserFactory;

    public AdminSecurityGroupsPage(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
        PageFactory.initElements(browserFactory.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[1]/div/h4[contains(text(),'Security Groups')]")
    @CacheLookup
    public WebElement lblSecurityGroups;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div/div[1]//div[2]/div/div/button")
    @CacheLookup
    public WebElement btnAddSecurityGroups;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]//form/div[1]//input")
    @CacheLookup
    public WebElement txtSearchSecurityGroups;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]//form/div[2]//input")
    @CacheLookup
    public WebElement lstAdvertiserAccountSecurityGroups;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]//form/div[3]//input")
    @CacheLookup
    public WebElement lstUserSecurityGroups;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/section/div/div[2]//form/div[4]/button[1]")
    @CacheLookup
    public WebElement btnApply;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/section/div/div[2]//form/div[4]/button[2]")
    @CacheLookup
    public WebElement btnClear;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]//form/div[1]//input")
    @CacheLookup
    public WebElement txtSecurityGroupsName;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div/form//button[2]")
    @CacheLookup
    public WebElement btnCancel;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div/form//button[1]")
    @CacheLookup
    public WebElement btnSave;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div/div[2]/div/div/button")
    @CacheLookup
    public WebElement btnBack;


    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/section/div[1]/div[2]/div/div/input")
    @CacheLookup
    public WebElement txtUserSearch;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/section/div[2]/div[2]/button")
    @CacheLookup
    public WebElement btnUserCancel;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]//div[2]/div/div[2]//h5")
    public WebElement lblAssignedAdvetiser;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div/div[1]//div/div/div/div/input")
    public WebElement txtAssignedAdvSearch;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div/div[1]//div/div/div/div/input")
    public WebElement txtUnAssignedAdvSearch;



}