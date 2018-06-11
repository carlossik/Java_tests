package PageObjects;

import SupportingUtilites.GeneralUtilites;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import SupportingUtilites.BrowserFactory;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ProteusWebCreativesPage extends BrowserFactory {
    private BrowserFactory browserFactory;
    public ProteusWebCreativesPage(BrowserFactory browserFactory)
    {
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

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[2]/form/div[5]/button[1]")
    @CacheLookup
    public WebElement btnCreativesApplyFilters;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[2]/form/div[5]/button[2]")
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

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div/button[1]")
    @CacheLookup
    public WebElement btnCreativesBulkEditSave;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div/button[2]")
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

    private String strCreativeAdvertiserIconXpath=  "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]";
    private String strTagIconXpath =  "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[8]/span" ;
    private String strColumnHeaders = "//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[1]/div/div";

    public boolean creativesForAdvertiserListed()
    {
        return getElementCount(strCreativeAdvertiserIconXpath) > 0;
    }

    public boolean checkForToolTipOnTagIcon()
    {
       return getToolTip(getElements(strTagIconXpath).get(0))
               .toLowerCase().equals("View creative tag and image".toLowerCase());
    }

    public boolean checkForTagIconsOnCreativeList()
    {
        return getElementCount(strTagIconXpath) > 0;
    }

    public void clickOnTagIcon()
    {
        mouseClick(getElements(strTagIconXpath).get(0));
        GeneralUtilites.wait(1);
    }

    public boolean checkForCreativePopup()
    {
        return txtCreativeText.isDisplayed() && btnClosePopup.isDisplayed() && btnCopyCreativeDetails.isDisplayed();
    }

    public boolean checkForCreativeColumns(List<String> expectedHeaders)
    {
        List<WebElement> columnHeaders = getElements(strColumnHeaders);
        List<String> actualHeaders = new ArrayList<>();
        for (WebElement objHeader :columnHeaders) actualHeaders.add(objHeader.getText());
        return GeneralUtilites.listEqualsIgnoreOrder(expectedHeaders,actualHeaders);
    }

    public void changeAdvertiserOnCreativeTab(String strAdvertiserName)
    {
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
}
