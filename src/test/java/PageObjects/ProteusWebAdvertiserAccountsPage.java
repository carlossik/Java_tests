package PageObjects;
import SupportingUtilites.ElementExtensions;
import SupportingUtilites.GeneralUtilites;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import SupportingUtilites.BrowserFactory;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


public class ProteusWebAdvertiserAccountsPage extends BrowserFactory {
    private BrowserFactory browserFactory;
    public ProteusWebAdvertiserAccountsPage(BrowserFactory browserFactory)
    {
        this.browserFactory = browserFactory;
        PageFactory.initElements(browserFactory.getDriver(),this );
    }

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/h4")
    @CacheLookup
    public WebElement lblAdvertiserAccounts;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/form/div[1]/div/input")
    @CacheLookup
    public WebElement txtSearch;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/form/div[2]/div/div/input")
    @CacheLookup
    public WebElement cmbAdvertiser;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/form/div[3]/div/div/input")
    @CacheLookup
    public WebElement cmbAgency;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/form/div[3]/div/div/input")
    @CacheLookup
    public WebElement chbxRequiresAction;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/form/div[5]/button[1]")
    @CacheLookup
    private WebElement btnApplyFilters;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/form/div[5]/button[2]")
    @CacheLookup
    public WebElement btnClearFilters;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[3]/div[1]/div/div[1]/div[1]/span[1]")
    @CacheLookup
    public WebElement hdrAdvertiserName;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[3]/div[1]/div/div[1]/div[2]/span[1]")
    @CacheLookup
    public WebElement hdrAgencyName;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[3]/div[1]/div/div[2]/div/div")
    @CacheLookup
    private WebElement rowAdvertiser;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div/form/div[1]/div[2]/button[1]")
    @CacheLookup
    public WebElement btnEditAdvertiserDetails;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div/form/div[2]/div[1]/div/input")
    public WebElement txtAdvertiserName;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div/form/div[2]/div[2]/div[1]/div/div/input")
    @CacheLookup
    private WebElement cmbAgencyName;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div/form/div[2]/div[3]/div/input")
    @CacheLookup
    private WebElement cmbOperationalUnit;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div/form/div[1]/div[2]/div/button[2]")
    @CacheLookup
    private WebElement btnSave;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div/form/div[1]/div[2]/div/button[1]")
    @CacheLookup
    public WebElement btnCancel;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div[1]")
    @CacheLookup
    public WebElement lblAdvertiserPlatformDetails;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/button")
    @CacheLookup
    public WebElement btnBack;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div/form/div[1]/div[2]/button[2]")
    @CacheLookup
    public WebElement btnMergeAdvertiser;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/section/div[2]/form/div[1]/div/div/input")
    @CacheLookup
    private WebElement cmbMergeAdvertiser;


    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/section/div[2]/form/div[2]/div/div/label/div")
    @CacheLookup
    private WebElement chbxConfirmMergeAdvertiser;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/section/div[2]/form/div[3]/button[1]")
    @CacheLookup
    private WebElement btnMergeCancel;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/section/div[2]/form/div[3]/button[2]")
    @CacheLookup
    private WebElement btnMergeSave;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/span/span")
    private WebElement txtTooltip;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/section/div[2]/form/div[1]/div/ul/li[1]")
    private WebElement txtMergeAdvertiserAccount;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div")
    private WebElement txtNoAdvertiserAccountMatched;

    public void SearchForOnAdvertiserPage(String strSearchKey){
        enterText( txtSearch, strSearchKey);
        mouseClick( btnApplyFilters);
        GeneralUtilites.wait(1);
    }

    public void EditAdvertiserName(String strAdvertiserName)
    {
        enterText(txtAdvertiserName,strAdvertiserName);
        mouseClick(btnSave);
        mouseClick(btnBack);
    }

    public void SelectFirstAdvertiserRow(){
        mouseClick(rowAdvertiser);
    }

    public boolean CheckForAdvertiserRows(String strSearchKey){
        By PlatformIcons = By.xpath( "//*[@id='root']/div/section/div/div[2]/div/div/div/div[3]/div[1]/div/div[2]/div/div/div[contains(text(),'"+strSearchKey+"') ]");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(PlatformIcons);
        return elementTypes.size() > 0 ;
    }

    public boolean CheckForAdvertiserAccountDetails(){
        GeneralUtilites.wait(1);
        return  txtAdvertiserName.isDisplayed() &&
                cmbAgencyName.isDisplayed() &&
               cmbOperationalUnit.isDisplayed();
    }

    public boolean  CheckForMergeAdvertiserAccount(){
        return btnMergeAdvertiser.isDisplayed();
    }

    public boolean CheckForMergeObjectsOnDialog(){
        boolean returnType =
                cmbMergeAdvertiser.isDisplayed() &&
        chbxConfirmMergeAdvertiser.isDisplayed() &&
                    btnMergeCancel.isDisplayed() &&
                      btnMergeSave.isDisplayed() ;
        if(btnMergeCancel.isDisplayed())
            mouseClick(btnMergeCancel);
        return returnType;
    }

    public boolean CheckForAdvertiserPlatformDetails(){

        By PlatformIcons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[1]");
        List<WebElement> elementTypesPlatformIcons = browserFactory.getDriver().findElements(PlatformIcons);

        By PlatformName = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]");
        List<WebElement> elementTypesPlatformName = browserFactory.getDriver().findElements(PlatformName);

        By PlatformExternalID = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[3]");
        List<WebElement> elementTypesPlatformExternalID = browserFactory.getDriver().findElements(PlatformExternalID);

        return elementTypesPlatformIcons.size() > 0 &&
               elementTypesPlatformName.size() > 0 &&
               elementTypesPlatformExternalID.size() >0;
    }

    public boolean CheckForAdvertiserPlatformToolTip(){
        boolean returnType = true;
        By PlatformIcons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[1]");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(PlatformIcons);
        for (WebElement elementType :elementTypes){
            Actions toolAct = new Actions(browserFactory.getDriver());
            toolAct.moveToElement(elementType).build().perform();
            GeneralUtilites.wait(1);
            returnType = returnType && !txtTooltip.getText().equals("");
            System.out.println("Tool tip : " + txtTooltip.getText() );
        }
        return returnType;
    }

    public boolean CheckForAdvertiserPlatformTab(){
        boolean returnType = true;
        By PlatformIcons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[1]");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(PlatformIcons);
        for (WebElement elementType :elementTypes){
            mouseClick(elementType);
            GeneralUtilites.wait(2);
            List<String> browserTabs = new ArrayList<>(this.browserFactory.getDriver().getWindowHandles());
            returnType = browserTabs.size() >= 2 && returnType;
            this.browserFactory.getDriver().switchTo().window(browserTabs.get(1));
            this.browserFactory.getDriver().close();
            this.browserFactory.getDriver().switchTo().window(browserTabs.get(0));
        }
        return returnType;
    }

    public void SearchForAdvertiser(String AdvertiserName){
        enterText(txtSearch, AdvertiserName);
        mouseClick(btnApplyFilters);
    }

    public String SelectAdvertiserToMerge(){
        mouseClick(cmbMergeAdvertiser);
        GeneralUtilites.wait(1);
        String strMergedAdv = txtMergeAdvertiserAccount.getText();
        mouseClick(txtMergeAdvertiserAccount);
        mouseClick(chbxConfirmMergeAdvertiser);
        mouseClick(btnMergeSave);
        return strMergedAdv;
    }

    public String SelectAdvertiserToMergeAndCancel(){
        mouseClick(cmbMergeAdvertiser);
        GeneralUtilites.wait(1);
        String strMergedAdv = txtMergeAdvertiserAccount.getText();
        mouseClick(txtMergeAdvertiserAccount);
        mouseClick(chbxConfirmMergeAdvertiser);
        mouseClick(btnMergeCancel);
        return strMergedAdv;
    }

    public boolean CheckForNoAdvertiserMatched(){
        return txtNoAdvertiserAccountMatched.isDisplayed();
    }


}

