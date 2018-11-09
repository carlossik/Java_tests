package PageObjects;

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

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div[1]/h4")
    @CacheLookup
    public WebElement lblAdvertiserAccounts;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div[2]/div/div/form/div[1]/div/input")
    public WebElement txtSearch;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/form/div[2]/div/div/input")
    @CacheLookup
    public WebElement cmbAdvertiser;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/form/div[3]/div/div/input")
    @CacheLookup
    public WebElement cmbAgency;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//input[@name='emptyAgency']")
    @CacheLookup
    private WebElement chbxRequiresAction;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div[2]/div/div/form/div[6]/button[1]")
    //@CacheLookup
    private WebElement btnApplyFilters;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div[2]/div/div/form/div[6]/button[2]")
    @CacheLookup
    public WebElement btnClearFilters;

    @FindBy(how = How.XPATH, using = " //*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[1]//div[2]/div/div/div/div/button")
    @CacheLookup
    public WebElement btnBulkEdit;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]//div[1]/button[1]")
    @CacheLookup
    private WebElement btnBulkSave;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]//div[2]/button[1]")
    @CacheLookup
    public WebElement btnBulkCancel;


    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[3]/div[1]/div/div[1]/div[1]/span[1]")
    @CacheLookup
    public WebElement hdrAdvertiserName;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[3]/div[1]/div/div[1]/div[2]/span[1]")
    @CacheLookup
    public WebElement hdrAgencyName;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]")
    @CacheLookup
    private WebElement rowAdvertiser;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//form//div[1]/button")
    @CacheLookup
    public WebElement btnEditAdvertiserDetails;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div/form/div[2]/div[1]/div/input")
    public WebElement txtAdvertiserName;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div/form/div[2]/div[2]/div[1]/div/div/input")
    @CacheLookup
    private WebElement cmbAgencyName;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div/form/div[2]/div[3]/div/div/div/input")
    @CacheLookup
    private WebElement cmbGroupAdvertiser;


    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div/form/div[2]/div[3]//div/input")
    @CacheLookup
    private WebElement cmbOperationalUnit;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//form//div[1]/button")
    @CacheLookup
    private WebElement btnSave;

    @FindBy(how = How.XPATH, using = " //*[@id='root']//section//form//div[2]/button")
    @CacheLookup
    public WebElement btnCancel;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div[1]")
    @CacheLookup
    public WebElement lblAdvertiserPlatformDetails;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//div[1]/div[1]/div/button")
    public WebElement btnBack;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section//form//div[2]/button")
    @CacheLookup
    public WebElement btnMergeAdvertiser;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[1]/div/div/input")
    @CacheLookup
    private WebElement cmbMergeAdvertiser;


    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[2]/div/div/label/div")
    @CacheLookup
    private WebElement chbxConfirmMergeAdvertiser;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[3]/button[2]")
    @CacheLookup
    private WebElement btnMergeCancel;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[3]/button[1]")
    @CacheLookup
    private WebElement btnMergeSave;

    @FindBy(how = How.XPATH, using = "/html/body/div/span[contains(@class,'theme_tooltip')]/span[contains(@class,'theme_tooltipInner')]")
    private WebElement txtTooltip;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[1]/div/ul/li[1]")
    private WebElement txtMergeAdvertiserAccount;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div/form/div[2]/div[2]/div/div/ul/li[1]")
    private WebElement listitemAgency;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div/form/div[2]/div[3]/div/div/ul/li[1]")
    private WebElement listitemGroupAdvertiser;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div")
    private WebElement txtNoAdvertiserAccountMatched;

    public void SearchForOnAdvertiserPage(String strSearchKey){
        enterText( txtSearch, strSearchKey);
        mouseClick( btnApplyFilters);
        GeneralUtilites.wait(1);
    }

    public void EditAdvertiserName(String strAdvertiserName)
    {
        GeneralUtilites.wait(1);
        enterText(txtAdvertiserName,strAdvertiserName);
        mouseClick(cmbAgencyName);
        GeneralUtilites.wait(1);
        mouseClick(listitemAgency);
        GeneralUtilites.wait(1);
        mouseClick(cmbGroupAdvertiser);
        GeneralUtilites.wait(1);
        mouseClick(listitemGroupAdvertiser);
        GeneralUtilites.wait(1);
        mouseClick(btnSave);
        GeneralUtilites.wait(1);
        mouseClick(btnBack);
    }

    public void SelectFirstAdvertiserRow(){
        mouseClick(rowAdvertiser);
    }

    public boolean CheckForAdvertiserRows(String strSearchKey){
        By PlatformIcons = By.xpath( " //*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[contains(text(),'"+strSearchKey.trim()+"') ]");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(PlatformIcons);
        return elementTypes.size() > 0 ;
    }

    public boolean CheckForAdvertiserAccountDetails(){
        GeneralUtilites.wait(1);
        return txtAdvertiserName.isDisplayed() &&
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

        By PlatformIcons = By.xpath("//*[@id='root']//section//div[2]/div/div[2]//div[2]/div/div/div/div");
        List<WebElement> elementTypesPlatformIcons = browserFactory.getDriver().findElements(PlatformIcons);

        By PlatformName = By.xpath("//*[@id='root']//section//div[2]/div/div[2]/div/div[2]/div/div/div[2]");
        List<WebElement> elementTypesPlatformName = browserFactory.getDriver().findElements(PlatformName);

        By PlatformExternalID = By.xpath("//*[@id='root']//section//div[2]/div/div[2]/div/div[2]/div/div/div[5]");
        List<WebElement> elementTypesPlatformExternalID = browserFactory.getDriver().findElements(PlatformExternalID);

        return elementTypesPlatformIcons.size() > 0 &&
               elementTypesPlatformName.size() > 0 &&
               elementTypesPlatformExternalID.size() >0;
    }

    public boolean CheckForAdvertiserPlatformToolTip(){
        boolean returnType = true;
        By PlatformIcons = By.xpath("//*[@id='root']//section//div[2]/div/div[2]//div[2]/div/div/div/div");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(PlatformIcons);
        for (WebElement elementType :elementTypes){
               returnType = returnType && !getToolTip(elementType).equals("");
            System.out.println("Tool tip : " +  getToolTip(elementType) );
        }
        return returnType;
    }

    public boolean CheckForAdvertiserPlatformTab(){
        boolean returnType = true;
        By PlatformIcons = By.xpath("//*[@id='root']//section//div[2]/div/div[2]//div[2]/div/div/div/div");
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
        GeneralUtilites.wait(1);
        enterText(txtSearch, AdvertiserName);
        mouseClick(btnApplyFilters);
    }

    public void SearchForAdvertiserByRequiresAction(){
        mouseClick(chbxRequiresAction);
        mouseClick(btnApplyFilters);
    }

    public boolean CheckForAdvertiserRequiresActions(){
        Boolean returnType = true;
        By AgencyName = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[2]/label");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(AgencyName);
        for (WebElement elementType :elementTypes){
            returnType = returnType && elementType.getText().toLowerCase().equals("Please select".toLowerCase());
        }
        return returnType;
    }

    public String SelectAdvertiserToMerge(){
        mouseClick(cmbMergeAdvertiser);
        typeText(cmbMergeAdvertiser, "tr");
        GeneralUtilites.wait(1);
        String strMergedAdv = txtMergeAdvertiserAccount.getText();
        mouseClick(txtMergeAdvertiserAccount);
        mouseClick(chbxConfirmMergeAdvertiser);
        mouseClick(btnMergeSave);
        return strMergedAdv.split("\\(")[0];
    }

    public String SelectAdvertiserToMergeAndCancel(){
        mouseClick(cmbMergeAdvertiser);
        typeText(cmbMergeAdvertiser, "tr");
        GeneralUtilites.wait(1);
        String strMergedAdv = txtMergeAdvertiserAccount.getText();
        mouseClick(txtMergeAdvertiserAccount);
        mouseClick(chbxConfirmMergeAdvertiser);
        mouseClick(btnMergeCancel);
        return strMergedAdv.split("\\(")[0];
    }

    public boolean CheckForNoAdvertiserMatched(){
        return txtNoAdvertiserAccountMatched.isDisplayed();
    }

    public void BulkEditAdvertiserAgency(){

        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/div/label/div"));
        int maxLimit = 6;
        if(getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div") < maxLimit)
            maxLimit = getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div");
        int indexOne =   GeneralUtilites.RandomNumber(1,maxLimit);
        int indexTwo =  GeneralUtilites.RandomNumber(1,maxLimit);
        if(indexOne == indexTwo) {indexTwo++;}
        if(indexTwo > maxLimit) { indexTwo = 1;}

        WebElement AdvertiserNameOne = getElement("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div["+indexOne+"]/div[2]/div/div/input");
        mouseClick(AdvertiserNameOne);
        AdvertiserNameOne.sendKeys("Edit");


        WebElement AdvertiserNameTwo = getElement("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div["+indexTwo+"]/div[2]/div/div/input");
        mouseClick(AdvertiserNameTwo);
        AdvertiserNameTwo.sendKeys("Edit");



        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div["+indexOne+"]/div[3]//input"));
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div["+indexOne+"]/div[3]//li"));

        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div["+indexTwo+"]/div[3]//input"));
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div["+indexTwo+"]/div[3]//li"));



        GeneralUtilites.wait(1);
        mouseClick(btnBulkSave);

    }
}

