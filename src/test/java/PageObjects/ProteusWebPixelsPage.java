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

public class ProteusWebPixelsPage extends BrowserFactory {
    private BrowserFactory browserFactory;

    public ProteusWebPixelsPage(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
        PageFactory.initElements(browserFactory.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div//div[1]/h4")
    public WebElement lblPixels;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[1]/aside/button[3]")

    public WebElement btnPixels;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div//div[2]/form/div[1]/div/input")
    @CacheLookup
    public WebElement txtPixelsSearch;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div//div[2]/form/div[2]/div/div/input")
    @CacheLookup
    public WebElement cmbPixelsPlatform;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div//div[2]/form/div[3]/div/label/input")
    @CacheLookup
    public WebElement chbxMissingUnclassified;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div//div[2]/form/div[3]/div/label/input/../div")
    @CacheLookup
    public WebElement chbxMissingUnclassifiedClickable;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div//div[2]/form/div[4]/button[1]")
    @CacheLookup
    public WebElement btnPixelsApplyFilters;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div//div[2]/form/div[4]/button[2]")
    @CacheLookup
    public WebElement btnPixelClearFilters;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/span[1]")
    public WebElement lblAdvertiserPixels;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/span[2]")

    public WebElement btnChange;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div/div/button")
    public WebElement btnPixelsBulkEdit;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div/div/div[1]/button")
    @CacheLookup
    public WebElement btnPixelsBulkSave;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/button")
    @CacheLookup
    public WebElement btnPixelsBulkCancel;


    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[1]/div/div/input")
    public WebElement txtAdvertiserAccount;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[2]/button[1]")
    public WebElement btnOK;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/section/div[2]/form/div[2]/button[2]")
    public WebElement btnCancel;


    private String  strPixelAdvertiserIconXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div";
    private String strColumnHeaders = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div[1]/div/div";

    public boolean pixelsForAdvertiserListed()
    {
        return getElementCount(strPixelAdvertiserIconXpath) > 0;
    }

    public boolean checkForPixelsInGrid()
    {
        return getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div") > 0;
    }

    public void changeAdvertiserOnPixelTab(String strAdvertiserName)
    {
        mouseClick(btnChange);
        txtAdvertiserAccount.clear();
        txtAdvertiserAccount.sendKeys(strAdvertiserName);
        GeneralUtilites.wait(1);
        mouseClick(getElements("/html/body/div/div/div[2]/section/div[2]/form/div[1]/div/ul").get(0));
        GeneralUtilites.wait(1);
        btnOK.click();
    }

    public boolean checkForPixelColumns(List<String> expectedHeaders)
    {
        List<WebElement> columnHeaders = getElements(strColumnHeaders);
        List<String> actualHeaders = new ArrayList<>();
        for (WebElement objHeader :columnHeaders) actualHeaders.add(objHeader.getText());
        return GeneralUtilites.listEqualsIgnoreOrder(expectedHeaders,actualHeaders);
    }

    public void Search(String SearchKey)
    {
        enterText(txtPixelsSearch,SearchKey);
        mouseClick(btnPixelsApplyFilters);
    }

    public void SortPixelGridOn(String HeaderName)
    {
        By header = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div[1]/div/*[text() = '"+HeaderName+"']");
        WebElement webElement = browserFactory.getDriver().findElement(header);
        mouseClick(webElement);
        if(HeaderName.equals("Platform")) {
            webElement = browserFactory.getDriver().findElement(header);
            GeneralUtilites.wait(2);
            mouseClick(webElement);
        }
        GeneralUtilites.wait(2);
    }

    public boolean CheckIfPixelsSortedOn(String HeaderName)
    {
        String columnXpath = "";
        switch (HeaderName)
        {
            case "Platform" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div[1]";
                break;
            case "Pixel Name" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div[2]";
                break;
            case "External ID" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div[3]";
                break;
            case "Category" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div[4]";
                break;
            case "Type" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div[5]";
                break;
        }
        List<WebElement> columnHeaders = getElements(columnXpath);
        List<String> actualColumn = new ArrayList<>();
        for (WebElement objHeader :columnHeaders) actualColumn.add(objHeader.getText().toLowerCase());
        return  GeneralUtilites.isCollectionSorted(actualColumn);
    }


    public void BulkEditPxiels(){
        By PixelCategory = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[5]/div/div/div/input");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(PixelCategory);
        int maxLimit = 6;
        if(elementTypes.size() < maxLimit)
            maxLimit = elementTypes.size();
        int indexOne =   GeneralUtilites.RandomNumber(1,maxLimit);
        int indexTwo =  GeneralUtilites.RandomNumber(1,maxLimit);
        if(indexOne == indexTwo) {indexTwo++;}
        if(indexTwo > maxLimit) { indexTwo = 1;}

        By PixelCategoryOne = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div["+indexOne+"]/div[5]/div/div/div/input");
        browserFactory.getDriver().findElement(PixelCategoryOne).click();
        GeneralUtilites.wait(1);
        By PixelCategoryListOne = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div["+indexOne+"]/div[5]/div/div/ul/li[1]");
        browserFactory.getDriver().findElement(PixelCategoryListOne).click();
        GeneralUtilites.wait(1);
        By PixelCategoryTwo =     By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div["+indexTwo+"]/div[5]/div/div/div/input");
        browserFactory.getDriver().findElement(PixelCategoryTwo).click();
        GeneralUtilites.wait(1);
        By PixelCategoryListTwo = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div["+indexTwo+"]/div[5]/div/div/ul/li[2]");
        browserFactory.getDriver().findElement(PixelCategoryListTwo).click();
        GeneralUtilites.wait(1);
        By PixelTypeOne =     By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div["+indexOne+"]/div[6]/div/div/div/input");
        browserFactory.getDriver().findElement(PixelTypeOne).click();
        GeneralUtilites.wait(1);
        By PixelTypeListOne = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div["+indexOne+"]/div[6]/div/div/ul/li[2]");
        browserFactory.getDriver().findElement(PixelTypeListOne).click();
        GeneralUtilites.wait(1);
        By PixelTypeTwo =     By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div["+indexTwo+"]/div[6]/div/div/div/input");
        browserFactory.getDriver().findElement(PixelTypeTwo).click();
        GeneralUtilites.wait(1);
        By PixelTypeListTwo = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div["+indexTwo+"]/div[6]/div/div/ul/li[2]");
        browserFactory.getDriver().findElement(PixelTypeListTwo).click();

        GeneralUtilites.wait(1);

    }

}