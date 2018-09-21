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

public class ProteusWebCreativesPage extends BrowserFactory {

    private BrowserFactory browserFactory;

    public ProteusWebCreativesPage(BrowserFactory browserFactory)    {
        this.browserFactory = browserFactory;
        PageFactory.initElements(browserFactory.getDriver(),this );
    }

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[2]/h4")
    @CacheLookup
    public WebElement lblCreatives;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[1]/aside/button[2]")
    @CacheLookup
    public WebElement btnCreatives;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[2]/form/div[1]/div/input")
    @CacheLookup
    public WebElement txtCreativesSearch;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[2]/form/div[2]/div/div/input")
    @CacheLookup
    public WebElement cmbCreativesPlatform;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[2]/form/div[3]/label/input")
    @CacheLookup
    public WebElement chbxCreativesUnmapped;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[2]/form/div[4]/label/input")
    @CacheLookup
    public WebElement chbxCreativesUnclassified;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[2]/form/div/button[1]")
    @CacheLookup
    public WebElement btnCreativesApplyFilters;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[2]/form/div/button[2]")
    @CacheLookup
    public WebElement btnCreativesClearFilters;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[1]/div")
    @CacheLookup
    public WebElement lblAdvertiserCreatives;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[1]/button")
    @CacheLookup
    public WebElement btnChange;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]//button[1]")
    public WebElement btnCreativesBulkEdit;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/button[1]")
    @CacheLookup
    public WebElement btnCreativesBulkEditSave;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/button[2]")
    @CacheLookup
    public WebElement btnCreativesBulkEditCancel;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[4]/div/div/div/input")
    @CacheLookup
    public WebElement lstAdServerPlacementName;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[4]/div/div/ul/li[1]")
    @CacheLookup
    public WebElement lsitmAdServerPlacementName;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[5]/div/div/div/input")
    @CacheLookup
    public WebElement lstAdServerPlacementID;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[5]/div/div/ul/li[1]")
    @CacheLookup
    public WebElement lsitmAdServerPlacementID;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[7]/div/div[1]/div/div/input")
    @CacheLookup
    public WebElement lstClassification;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[7]/div/div[1]/div/ul/li[1]")
    @CacheLookup
    public WebElement lsitmClassification;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[7]/div/div[2]/div/div/input")
    @CacheLookup
    public WebElement lstClassification2;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[7]/div/div[2]/div/ul/li[1]")
    @CacheLookup
    public WebElement lsitmClassification2;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[4]/div/span")
    @CacheLookup
    public WebElement btnAddPlacementName;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[5]/div/span")
    @CacheLookup
    public WebElement btnAddPlacementID;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[7]/div/span")
    @CacheLookup
    public WebElement btnClassification;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[1]/div/div/input")
    @CacheLookup
    public WebElement txtAdvertiserAccount;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[2]/button")
    @CacheLookup
    public WebElement btnOK;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[1]")
    @CacheLookup
    public WebElement txtTagIcon;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/div[2]")
    @CacheLookup
    public WebElement txtCreativeText;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/div[1]/div[1]/span")
    @CacheLookup
    public WebElement btnCopyCreativeDetails;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/div[1]/div[2]/span")
    @CacheLookup
    public WebElement btnSwitchToCreative;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/div[1]/div[3]/span")
    @CacheLookup
    private WebElement btnClosePopup;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/button[2]")
    @CacheLookup
    public WebElement btnManageAdvancedMapping;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[2]/div[3]/button[1]")
    @CacheLookup
    public WebElement btnManageAdvMappingApplyFilters;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[2]/h4")
    @CacheLookup
    public WebElement lblManageAdvancedMapping;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[2]/div[1]/button")

    public WebElement btnBackManageAdvancedMapping;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div/div/div/div[1]//input")
    public WebElement txtDeliveryDataRangeFromDate;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div/div/div/div[2]//input")
    public WebElement txtDeliveryDataRangeToDate;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/header")
    public WebElement lblPopupDate;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/nav/button[2]")
    public WebElement btnPopupOk;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div/div/div/span/div//div[@class='theme_day_3cb3g theme_active_2k63V']/span")
    public WebElement txtPopupDate;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div/div/div/span/div/span")
    public WebElement txtPopupMonthYear;


    @FindBy(how = How.XPATH, using = " //*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[3]/div/label/div")
    public WebElement chbxMissingMapping;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section//button[contains(text(), 'Cancel')]")
    public WebElement btnCancelAdvancedMapping;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section//button[contains(text(), 'Save')]")
    public WebElement btnSaveAdvancedMapping;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div[1]/span[text()='fullscreen']")
    public WebElement btnExpand;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div[1]/span[text()='fullscreen_exit']")
    public WebElement btnExpandExit;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/section/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div[1]/h5")
    public WebElement lblUnmappedDSPCreatives;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div/input")
    public WebElement lstAdServerPlatformList;


    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/input")
    public WebElement txtAdServerPlatformSearch;



    private String strCreativeAdvertiserIconXpath=  "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]";
    private String strTagIconXpath =  "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[8]/span" ;
    private String strColumnHeaders = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[1]/div/div[text() != '']";

    public boolean creativesForAdvertiserListed() {
        return getElementCount(strCreativeAdvertiserIconXpath) > 0;
    }

    public boolean checkForToolTipOnTagIcon() {
       return getToolTip(getElements(strTagIconXpath).get(0))
               .toLowerCase().equals("View creative tag and image".toLowerCase());
    }

    public boolean checkForToolTipOnDelivetyDataRange() {
        return getToolTip(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div[1]/span"))
                .toLowerCase().equals("View latest delivery dates".toLowerCase());
    }

    public boolean checkForTagIconsOnCreativeList() {
        return getElementCount(strTagIconXpath) > 0;
    }

    public void clickOnTagIcon() {
        mouseClick(getElements(strTagIconXpath).get(0));
        GeneralUtilites.wait(1);
    }

    public boolean checkForCreativePopup()    {
        return txtCreativeText.isDisplayed() && btnClosePopup.isDisplayed() && btnCopyCreativeDetails.isDisplayed();
    }

    public boolean checkForCreativeColumns(List<String> expectedHeaders)    {
        List<WebElement> columnHeaders = getElements(strColumnHeaders);
        List<String> actualHeaders = new ArrayList<>();
        for (WebElement objHeader :columnHeaders) actualHeaders.add(objHeader.getText());
        return GeneralUtilites.listEqualsIgnoreOrder(expectedHeaders,actualHeaders);
    }

    public void changeAdvertiserOnCreativeTab(String strAdvertiserName)    {
        mouseClick(btnChange);
        txtAdvertiserAccount.clear();
        txtAdvertiserAccount.sendKeys(strAdvertiserName);
        GeneralUtilites.wait(1);
        mouseClick(getElements("/html/body/div/div/div[2]/section/div[2]/form/div[1]/div/ul").get(0));
        GeneralUtilites.wait(1);
        btnOK.click();
    }

    public void BulkEditCreatives(){
        List<WebElement> elementTypes = getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[4]/div/div/div/div/input");
        int maxLimit = 6;
        if(elementTypes.size() < maxLimit)
            maxLimit = elementTypes.size();
        int indexOne =   GeneralUtilites.RandomNumber(1,maxLimit);
        int indexTwo =  GeneralUtilites.RandomNumber(1,maxLimit);
        if(indexOne == indexTwo) {indexTwo++;}
        if(indexTwo > maxLimit) { indexTwo = 1;}

        // Editing AD Server Placements
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div["+indexOne+"]/div[4]/div/div/div/div/input"));
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div["+indexOne+"]/div[4]/div/div//ul/li[1]"));
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div["+indexTwo+"]/div[4]/div/div/div/div/input"));
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div["+indexTwo+"]/div[4]/div/div//ul/li[1]"));

        // Editing Classification Type
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div["+indexOne+"]/div[5]/div/div[1]/div/div/div/input"));
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div["+indexOne+"]/div[5]/div/div[1]/div/div/ul/li[1]"));
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div["+indexTwo+"]/div[5]/div/div[1]/div/div/div/input"));
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div["+indexTwo+"]/div[5]/div/div[1]/div/div/ul/li[2]"));

        // Editing Classification
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div["+indexOne+"]/div[5]/div/div[2]/div/div/div/input"));
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div["+indexOne+"]/div[5]/div/div[2]/div/div/ul/li[1]"));
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div["+indexTwo+"]/div[5]/div/div[2]/div/div/div/input"));
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div["+indexTwo+"]/div[5]/div/div[2]/div/div/ul/li[2]"));
        GeneralUtilites.wait(1);
    }

    public void dragAndDrop(){
        WebElement fromObj = getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[1]");
        WebElement   toObj = getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]");
        Actions builder = new Actions(browserFactory.getDriver());
        /*  builder.keyDown(Keys.CONTROL)
             //   .click(fromObj)
                .dragAndDrop(fromObj, toObj)
                .keyUp(Keys.CONTROL);
        Action selected = builder.build();
        selected.perform();*/
        builder.clickAndHold(fromObj).build().perform();
        GeneralUtilites.wait(4);
        builder.clickAndHold(toObj).moveToElement(toObj)
                .release(toObj)
                .build().perform();
        GeneralUtilites.wait(4);
        //  dragAndDrop.perform();
        System.out.println("Drag and drop done");
    }

    public void SortCreativeGridOn(String HeaderName) {
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[1]//*[text() = '"+HeaderName+"']"));
        if(HeaderName.equals("Platform")) {
            GeneralUtilites.wait(2);
            mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[1]//*[text() = '"+HeaderName+"']"));
        }
        GeneralUtilites.wait(2);
    }

    public boolean CheckIfCreativessSortedOn(String HeaderName)
    {
        String columnXpath = "";
        switch (HeaderName)
        {
            case "Platform" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]";
                break;
            case "Creative Name" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]";
                break;
            case "External ID" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[3]";
                break;
            case "Classification" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[4]";
                break;
            case "DSP Status" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[5]";
                break;
        }
        List<WebElement> columnHeaders = getElements(columnXpath);
        List<String> actualColumn = new ArrayList<>();
        for (WebElement objHeader :columnHeaders) actualColumn.add(objHeader.getText().toLowerCase());
        return  GeneralUtilites.isCollectionSorted(actualColumn);
    }
}