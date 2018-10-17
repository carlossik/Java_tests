package PageObjects;

import DBDataModel.JDBCTemplate;
import DBDataModel.campaign_flight;
import SupportingUtilites.BrowserFactory;
import SupportingUtilites.GeneralUtilites;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;


public class ProteusWebCampaignsPage extends BrowserFactory {
    private BrowserFactory browserFactory;
    private Properties prop = new Properties();
    private InputStream input = null;
    private static String currentPath = System.getProperty("user.dir");

    public ProteusWebCampaignsPage(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
        PageFactory.initElements(browserFactory.getDriver(), this);

        try {
            InputStream input = new FileInputStream(currentPath + "/src/test/java/Resources/config.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    @FindBy(how = How.XPATH, using = "//*[@id='0']")
    @CacheLookup
    private WebElement tabHome;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[2]/div/div/div/nav/label[contains(text(), 'Campaigns')]")
    @CacheLookup
    private WebElement tabCampaigns;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/i")
    @CacheLookup
    private WebElement btnExpand;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header//button")
    @CacheLookup
    private WebElement btnShowUserOptions;

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

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[3]/div/div/div[2]/ul/li[2]")
    @CacheLookup
    private WebElement btnLogOut;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//input[@type='text']")
    private WebElement txtSearch;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//*[@class='automation_flightsFilterSort']//button")
    private WebElement btnSort;

    @FindBy(how = How.XPATH, using = "/html/body//section//div[@class='automation_campaignsFilterAdvertiser local_filter_27trk']//input")
    private WebElement txtAdvertiser;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//*[@class='automation_flightsFilterRequiresAction']//input[@name='onlyWithEmptyGoalOrUnknownTrader']/../div")
    public WebElement chbxRequiresAction;

    @FindBy(how = How.XPATH, using = "/html/body//section//div[@class='automation_campaignsFilterAgency local_filter_27trk']//input ")
    private WebElement txtAgency;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//*[contains(@class,'automation_flightsFilterApply')]")
    public WebElement btnApplyFilters;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//*[contains(@class,'automation_flightsFilterCancel')]")
    public WebElement btnClearFilters;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section/div/div[2]/div/div/div/div[2]/div")
    public WebElement rowFlights;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div//div[1]/div/div[2]/span/div/div/ul/li[1]/span")
    private WebElement lstSortByStartDateDescending;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div//div[1]/div/div[2]/span/div/div/ul/li[1]")
    private WebElement lstSortByStartDateDescendingBackground;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div//div[1]/div/div[2]/span/div/div/ul/li[2]/span")
    private WebElement lstSortByFlightCreatedDescending;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div//div[1]/div/div[2]/span/div/div/ul/li[2]")
    private WebElement lstSortByFlightCreatedDescendingBackground;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div//div[1]/div/div[2]/span/div/div/ul/li[3]/span")
    private WebElement lstSortByFlightUpdatedDescending;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div//div[1]/div/div[2]/span/div/div/ul/li[3]")
    private WebElement lstSortByFlightUpdatedDescendingBackground;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//h5")
    public WebElement txtFlightsCount;

    @FindBy(how = How.XPATH, using = "/html/body/div/span[contains(@class,'theme_tooltip')]/span[contains(@class,'theme_tooltipInner')]")
    private WebElement txtTooltip;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div//div[2]/div/span[2]")
    private WebElement lblSortBy;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[4]/div[2]/span/div/div/ul/li[1]")
    private WebElement lstAdvertiserAnalysis;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[4]/div[2]/span/div/div/ul/li[2]")
    private WebElement lstOperationsBreakdown;

    @FindBy(how = How.XPATH, using =  "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/i")
    private WebElement btnAddEditGoalDetails;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div//div[2]/form/div[1]/div[1]//input")
    private WebElement drpdwnGoalType;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div//div[2]/form/div[1]/div[2]//input")
    private WebElement txtGoalTarget;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div//div[2]/div//div[2]//form//button[1]")
    private WebElement btnSave;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/div[2]")
    private WebElement txtOptimisationManager;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div//div[2]/div//div[2]/div/div/div[2]/i")
    private WebElement btnEditOptimisationManager;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div//div[2]/div//form/div[2]/div[1]/div/div/input")
    private WebElement txtEditOptimisationManager;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section//i[text()='play_arrow']")
    private WebElement btnExpandFlightDetails;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[5]/div[2]/div[1]/div[2]")
    private WebElement txtImpressions;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[5]/div[2]/div[2]/div[2]")
    private WebElement txtClicks;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[10]/div")
    private WebElement txtBudget;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[9]/div")
    private WebElement txtCost;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/div/div[1]/button")
    public  WebElement btnFlightCreatives;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/div/div[2]/button")
    public  WebElement btnFlightPixels;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section//label/input[@name='showDecimalPlaces']/../div")
    public  WebElement chbxShowDecimalPlaces;

    public boolean CheckForCreativeTab()    {
        By asideButtons = By.xpath("//*[@id='root']/div/section/div/div[1]/aside//button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(asideButtons);
        System.out.println("asideButtons count : " + elementTypes.size());
        return elementTypes.size() > 2 && elementTypes.get(2).getText().toUpperCase().contains("CREATIVES".toUpperCase());
    }

    public void showDecimalPlaces()    {
        if(!chbxShowDecimalPlaces.getAttribute("class").contains("checked"))
            mouseClick(chbxShowDecimalPlaces);
    }
    public void hideDecimalPlaces()    {
        GeneralUtilites.wait(1);
        if(chbxShowDecimalPlaces.getAttribute("class").contains("checked"))
            mouseClick(chbxShowDecimalPlaces);
    }

    public boolean checkForDecimalPlaces()    {
        return txtBudget.getText().contains(".") && txtCost.getText().contains(".");
    }

    public boolean checkForDateFilter(){
       return getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div/div[1]/label/div") >= 3;
    }


    public boolean CheckForPixelsTab()
    {
        By asideButtons = By.xpath("//*[@id='root']/div/section/div/div[1]/aside//button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(asideButtons);
        System.out.println("asideButtons count : " + elementTypes.size());
        return elementTypes.size() >= 4 && elementTypes.get(3).getText().toUpperCase().contains("PIXELS".toUpperCase());
    }

    public boolean CheckForAdvertiserCreativeIcon()
    {
        return getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/button") > 0;
    }

    public boolean CheckForAdvertiserPixelIcon()    {
        By btnCreatives = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div[2]/button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(btnCreatives);
        System.out.println("btnPixel count : " + elementTypes.size());
        return elementTypes.size() > 0;
    }

    public boolean CheckForAdvertiserCreativeToolTip()
    {
        By AdvertiserCreativeIcon = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/button");
        WebElement webElement = browserFactory.getDriver().findElement(AdvertiserCreativeIcon);
       // System.out.println("Toop tip : " + getToolTip(webElement).toLowerCase());
        return getToolTip(webElement).toLowerCase().contains("View Creatives at Advertiser Level".toLowerCase());

    }

    public boolean  CheckForAdvertiserPixelToolTip()    {
        By AdvertiserPixelIcon = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div[2]/button");
        WebElement webElement = browserFactory.getDriver().findElement(AdvertiserPixelIcon);
        return getToolTip(webElement).toLowerCase().contains("View pixels at Advertiser Level".toLowerCase());
    }

    public boolean CheckCampaignsPageLoad() {
        return tabCampaigns.isDisplayed();
    }

    public boolean CheckForNavigateToHome() {
        return tabHome.isDisplayed();
    }

    public int GetFlightRowsCount() {

        return getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div");
    }

    public boolean CheckFLIGHTSExist() {
        return txtFlightsCount.isDisplayed();
    }

    public boolean CheckLogOutExist() {
        mouseClick(btnShowUserOptions);
        GeneralUtilites.wait(0.5);
        boolean boolLogOut = btnLogOut.isDisplayed();
        mouseClick(btnShowUserOptions);
        return boolLogOut;
    }

    public void Logout() {
        mouseClick(btnShowUserOptions);
        GeneralUtilites.wait(0.5);
        mouseClick(btnLogOut);
    }

    public boolean CheckSearchByFlightNameOrBookingCodeExist() {
        try {
            enterText(txtSearch, "FINANCE");
            enterText(txtSearch, "IO-6466");
            return txtSearch.isDisplayed();
        } catch (Exception ex) {
            System.out.println("Exception : " + ex.getMessage());
            return false;
        }
    }




    public void EnterSearchFilter(String Search, String Advertiser, String Agency) {
        GeneralUtilites.wait(1);
        if (!Search.equals(""))
            enterText(txtSearch, Search);
        GeneralUtilites.wait(1);
        if (!Advertiser.equals("") || !Agency.equals("")) {
            mouseClick(getElement("//*[@id='root']//section/div/div[2]/div/div/div[2]/div/div[1]//div[1]/button"));
            GeneralUtilites.wait(2);
            typeText(txtAdvertiser, Advertiser);
          //  enterText(txtAgency, Agency);
            GeneralUtilites.wait(2);
            mouseClick(getElement("/html/body//section//div/button[text()='OK']"));
        }

        GeneralUtilites.wait(1);

    }

    public boolean CheckFilterExist() {
        GeneralUtilites.wait(1);
        mouseClick( getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/button"));
        GeneralUtilites.wait(1);
        boolean  returnType =  txtAdvertiser.isDisplayed() && txtAgency.isDisplayed();
        mouseClick(getElement("/html/body//section//button[text()='OK']"));
        return  returnType;
    }

    public void SelectRequiredAction() {
        if (!chbxRequiresAction.getAttribute("class").equals("theme_check_2B20W theme_checked_2NQ9n")) {
            Actions action = new Actions(browserFactory.getDriver());
            action.moveToElement(chbxRequiresAction).build().perform();
            action.click(chbxRequiresAction).perform();
            GeneralUtilites.wait(1);
        }
    }

    public void SelectSortBy(String sortType) {
        GeneralUtilites.wait(1);
        Actions action = new Actions(browserFactory.getDriver());
        action.moveToElement(btnSort).build().perform();
        action.click(btnSort).perform();
        WebElement obj;
        switch (sortType) {
            case "SortByFlightCreatedDescending":
                obj = lstSortByFlightCreatedDescending;
                break;
            case "SortByFlightUpdatedDescending":
                obj = lstSortByFlightUpdatedDescending;
                break;
            default:
                obj = lstSortByStartDateDescending;
                break;
        }
        action.moveToElement(obj).build().perform();
        action.click(obj).perform();
        GeneralUtilites.wait(1);
    }

    public void ClickOnSortBy() {
        GeneralUtilites.wait(1);
        Actions action = new Actions(browserFactory.getDriver());
        action.moveToElement(btnSort).build().perform();
        action.click(btnSort).perform();
    }

    public void UnClickOnSortBy() {
        GeneralUtilites.wait(1);
        Actions action = new Actions(browserFactory.getDriver());
        action.moveToElement(txtFlightsCount).build().perform();
        action.click(txtFlightsCount).perform();
    }

    public boolean checkForSortOptions() {
        boolean returnValue = btnSort.isDisplayed();
        Actions action = new Actions(browserFactory.getDriver());
        action.moveToElement(btnSort).build().perform();
        action.click(btnSort).perform();
        GeneralUtilites.wait(1);
        returnValue = returnValue && lstSortByFlightCreatedDescending.isDisplayed();
        returnValue = returnValue && lstSortByFlightUpdatedDescending.isDisplayed();
        action.moveToElement(lstSortByStartDateDescending).build().perform();
        action.click(lstSortByStartDateDescending).perform();
        return returnValue;
    }

    public boolean IsSelected(String sortType) {
        GeneralUtilites.wait(3);
        WebElement obj;
        switch (sortType) {
            case "SortByFlightCreatedDescending":
                obj = lstSortByFlightCreatedDescendingBackground;
                break;
            case "SortByFlightUpdatedDescending":
                obj = lstSortByFlightUpdatedDescendingBackground;
                break;
            default:
                obj = lstSortByStartDateDescendingBackground;
                break;
        }
        GeneralUtilites.wait(3);
        return obj.getAttribute("class").contains("activeMenuItem");
    }

    public boolean CheckFlightDetailsShown() {
        By FlightRows = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(FlightRows);
        System.out.println("Flight Count : " + elementTypes.size());
        boolean returnType = true;
        if (elementTypes.size() <= 0)
            return false;
        else {
            if (getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[8]") <= 0)
               return false;
            else
               returnType = returnType && true;

            if (getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[7]") <= 0)
                return false;
            else
                returnType = returnType && true;

            if (getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[6]") <= 0)
                return false;
            else
                returnType = returnType && true;

            if (getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[2]") <= 0)
                return false;
            else
                returnType = returnType && true;
        }
        return returnType;
    }


    public boolean CheckFlightGoalDetailsShown() {
        By FlightRows = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(FlightRows);
        System.out.println("Flight Count : " + elementTypes.size());
        boolean returnType = true;
        if (elementTypes.size() <= 0)
            return false;
        else {
            if (getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[9]") <= 0)
                return false;
            else
                returnType = returnType && true;

            if (getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[10]") <= 0)
                return false;
            else
                returnType = returnType && true;

            if (getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[11]") <= 0)
                return false;
            else
                returnType = returnType && true;

            if (getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[12]") <= 0)
                return false;
            else
                returnType = returnType && true;
           }
            return returnType;

    }

    public boolean CheckFlightBudgetCurrencyCodeShown() {
        By FlightRows = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div//div[2]/div/div[2]/div");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(FlightRows);
        System.out.println("\nFlight Count : " + elementTypes.size());
        boolean returnType = true;
        if (elementTypes.size() <= 0)
            return false;
        else {
            for (WebElement objFlightRow : elementTypes) {
                List<WebElement> elementFlightDetails = objFlightRow.findElements(By.xpath("./div/div[3]/div/div[1]/div[3]"));
                if (elementFlightDetails.size() <= 0)
                    return false;
                else {
                    String strCCY = elementFlightDetails.get(0).getText().split(":")[1].split(" ")[1];
                    System.out.println("\nstrCCY : " + strCCY + " ");
                    returnType = returnType && !Character.isDigit(strCCY.charAt(0));
                }
            }
            return returnType;
        }

    }

    public boolean CheckGoalDetailsEditable() {
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/i"));
        return getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/div/div/div[1]/div[2]/div[2]/i") >= 1;
    }

    public boolean CheckForProgressBar() {
        By ProgressBar = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[4]/div/div[2]/div/div");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(ProgressBar);
        System.out.println("\nFlight Count : " + elementTypes.size());
        return elementTypes.size() >= 1;
    }

    public boolean CheckForStartDate() {
        return getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[11]/div") >=1;
    }

    public boolean CheckForEndDate() {
        return getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[12]/div") >=1;
    }

    public boolean CheckForInfiniteBudgetIcon() {
        By EndDate = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[12]/div/span/i");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(EndDate);

        boolean returnType;
        if (elementTypes.size() >= 1) {
            returnType = elementTypes.get(0).getAttribute("class").contains("infinite");
            //System.out.println(" tool tip1 :  " + elementTypes.get(0).getAttribute("class"));
            Actions toolAct = new Actions(browserFactory.getDriver());
            toolAct.clickAndHold(elementTypes.get(0)).build().perform();
            GeneralUtilites.wait(2);
            returnType = returnType && txtTooltip.getText().toLowerCase().contains("Indefinite".toLowerCase());
            //System.out.println(" tool tip :  " + txtTooltip.getText().toLowerCase());
            return returnType;
        } else
            return false;
    }

    public boolean RecordsSortedBy(String strQuery) {
        By flights = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div//div[2]//div/div[1]/div[1]/span[2]");
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        JDBCTemplate objJDBCTemp = (JDBCTemplate) context.getBean("JDBCTemplate");
        List<campaign_flight> objCamFlgt = objJDBCTemp.GetCampaignFlightDetails(strQuery);
        List<String> lstFlightsUI = new ArrayList<>();
        List<String> lstFlightsDB = new ArrayList<>();
        for (campaign_flight objCamF : objCamFlgt)
            lstFlightsDB.add(objCamF.getcampaign_flight_name());
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(flights);
        for (WebElement elementType : elementTypes)
            lstFlightsUI.add(elementType.getText());
        return compareList(lstFlightsUI, lstFlightsDB);
    }

    private static boolean compareList(List ls1, List ls2) {
        boolean returnType;
        returnType = ls1.size() == ls2.size();
        for (int i = 0; i < ls1.size(); i++) {
            returnType = returnType && ls1.get(i).toString().toUpperCase().equals(ls2.get(i).toString().toUpperCase());
        }
        return returnType;
    }

    public String getSortByLabel() {
        return lblSortBy.getText();
    }

    public int getReportButtonCount() {
        return getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[13]/div/div[4]/div/button");
    }

    public int getOperationUnitReportButtonCount(){

        return getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/div[3]/button");
    }

    public boolean  ReportToolTipShown(String strReportType) {
        String btnReports;
        String ToolTipText;
        if(strReportType.toUpperCase().equals("OperationUnit".toUpperCase())) {
           btnReports = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/div[3]/button";
            ToolTipText= "Go to high level reports in Tableau";
        }
        else {
            btnReports = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div/div[4]/div/button";
            ToolTipText= "Go to flight reports in Tableau";
        }
        List<WebElement> elementTypes = getElements(btnReports);

        boolean returnType;
        if (elementTypes.size() >= 1) {
            returnType = getToolTip(elementTypes.get(0)).toLowerCase().contains(ToolTipText.toLowerCase());
            return returnType;
        }
        else
            return false;
    }

    public boolean ReportingOptions() {

        List<WebElement> elementTypes = getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div/div[4]/div/button");
        mouseClick(elementTypes.get(0));
        mouseClick(elementTypes.get(0));
        GeneralUtilites.wait(1);
        By ReportOptions = By.xpath("/html/body/div//div[@class='theme_menu_2bOZL theme_topRight_tGYgQ theme_active_3owm6']/ul/li");
        List<WebElement> elementReportOptions = browserFactory.getDriver().findElements(ReportOptions);
        return elementReportOptions.size() == 2
                && elementReportOptions.get(1).getText().toUpperCase().contains("Data explorer".toUpperCase())
                && elementReportOptions.get(0).getText().toUpperCase().contains("Operations breakdown".toUpperCase());
    }

    public boolean OperationalUnitReportingOptions(){
        By ReportButtons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/div[3]/button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(ReportButtons);
        mouseClick(elementTypes.get(0));
        By ReportOptions = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/div[3]/div/ul/li/span");
        List<WebElement> elementReportOptions = browserFactory.getDriver().findElements(ReportOptions);
        return elementReportOptions.size() == 2
                && elementReportOptions.get(1).getText().toUpperCase().contains("Performance Overview".toUpperCase())
                && elementReportOptions.get(0).getText().toUpperCase().contains("Management Report".toUpperCase());
    }

    public void SelectTableauReporting(String ReportType) {
        By ReportButtons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div/div[4]/div/button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(ReportButtons);
        mouseClick(elementTypes.get(0));
        GeneralUtilites.wait(2);
        By ReportOptions = By.xpath("/html/body/div/div/div[@class='theme_menu_2bOZL theme_topRight_tGYgQ theme_active_3owm6']/ul/li/span");
        List<WebElement> elementReportOptions = browserFactory.getDriver().findElements(ReportOptions);

        if (ReportType.equals("Data explorer"))
            mouseClick(elementReportOptions.get(1));
        else if (ReportType.equals("Operations breakdown"))
            mouseClick(elementReportOptions.get(0));
        GeneralUtilites.wait(2);

    }

    public void SelectTableauOperationalUnitReporting(String ReportType) {
        By ReportButtons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/div[3]/button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(ReportButtons);
        mouseClick(elementTypes.get(0));
        GeneralUtilites.wait(2);
        By ReportOptions = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/div[3]/div/ul/li");
        List<WebElement> elementReportOptions = browserFactory.getDriver().findElements(ReportOptions);

        if (ReportType.equals("Management Report"))
            mouseClick(elementReportOptions.get(0));
        else if (ReportType.equals("Performance Overview"))
            mouseClick(elementReportOptions.get(1));
    }

    public boolean AddGoalDetailsButtonExist() {
        GeneralUtilites.wait(5);
       mouseClick(getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/i").get(0));
       GeneralUtilites.wait(1);
       return btnAddEditGoalDetails.isDisplayed();
    }

    public boolean  EditGoalDetailsButtonExist() {
        return btnAddEditGoalDetails.getAttribute("class").contains("edit");
    }

    public boolean GoalInfoAndTargetExist(){
        List<WebElement> elementTypes = getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/div[1]");
        return elementTypes.get(0).getText().toLowerCase().equals("Goal info and target".toLowerCase());
    }

    public void ClickOnAddGoalDetails(){
        mouseClick( btnAddEditGoalDetails);
    }

    public boolean OptionsToAddGoalDetails(){
        return  drpdwnGoalType.isDisplayed() && txtGoalTarget.isDisplayed();
    }

    public void SaveGoalDetails(String GoalType, String GoalTarget){
        mouseClick(drpdwnGoalType);
        enterText(drpdwnGoalType, GoalType);
        mouseClick(txtGoalTarget);
        enterText(txtGoalTarget, GoalTarget);
        typeText(txtEditOptimisationManager,"Amelia Lee");
        GeneralUtilites.wait(1);
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div[2]/form/div[2]/div[1]/div/ul/li[1]"));
        GeneralUtilites.wait(1);
        mouseClick(btnSave);
    }

    public boolean CheckGoalDetailsSaved(String GoalType, String GoalTarget)    {
        String flightName = txtSearch.getAttribute("value");
     //   mouseClick(btnClearFilters);
       // GeneralUtilites.wait(2);
      //  EnterSearchFilter(flightName,"","");
       // mouseClick(btnApplyFilters);
        GeneralUtilites.wait(2);
        String txtGoalType   = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/div[1]/div[1]";
        String txtGoalTarget = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/div[1]/div[2]";
        WebElement  elementGoalType = getElement(txtGoalType);
        WebElement  elementGoalTarget = getElement(txtGoalTarget);
        return elementGoalType.getText().toLowerCase().contains(GoalType.toLowerCase())
               && elementGoalTarget.getText().toLowerCase().contains(GoalTarget.toLowerCase());
    }

    public boolean CheckForUnknownUser() {
        return  txtOptimisationManager.getText().toLowerCase().equals("Optimisation Manager".toLowerCase());
    }

    public boolean CheckForEditOptimisationManager(){
        return  btnEditOptimisationManager.isDisplayed();
    }

    public void SaveOptimisationManagerDetails(String OptManager){
        mouseClick( btnAddEditGoalDetails);
        mouseClick(txtEditOptimisationManager);
        enterText(txtEditOptimisationManager, OptManager);
        mouseClick(btnSave);
    }

    public boolean CheckOptimisationManagerDetailsSaved(String OptManager ){
        String flightName = txtSearch.getAttribute("value");
      //  mouseClick(btnClearFilters);
        GeneralUtilites.wait(2);
   //     EnterSearchFilter(flightName,"","");
    //    mouseClick(btnApplyFilters);
     //   GeneralUtilites.wait(2);
        return  txtOptimisationManager.getText().toLowerCase().equals(OptManager.toLowerCase());
    }

    public boolean CheckForPlatformIcons(){
        By PlatformIcons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div/div[3]/div/button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(PlatformIcons);
        return elementTypes.size() >= 1 ;
    }

    public boolean  CheckForPlatformIconsTooltips(){
        boolean returnType = true;
        By PlatformIcons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div/div[3]/div/button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(PlatformIcons);
        for (WebElement elementType :elementTypes){
            Actions toolAct = new Actions(browserFactory.getDriver());
            toolAct.moveToElement(elementType).build().perform();
            GeneralUtilites.wait(1);
            returnType = returnType && !txtTooltip.getText().equals("");
        }
        return returnType;
    }

    public String GetNumbersFromFlightDetails(){
        //  GeneralUtilites.wait(1);
        // mouseClick(btnExpandFlightDetails);
        GeneralUtilites.wait(1);
        return txtImpressions.getText() +";"+txtClicks.getText();
    }

    public void ExpandFlightDetails() {
        GeneralUtilites.wait(1);
        mouseClick(btnExpandFlightDetails);
        GeneralUtilites.wait(1);
    }

    public boolean CheckForDiscrepancyDetails(){

       /* By DiscrepancyDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div//div[2]/div/div[2]/div/div/div[5]/div[1]");
        WebElement webElement = browserFactory.getDriver().findElement(DiscrepancyDetails);

        By ImpressionPercentage = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div//div[2]/div/div[2]/div/div/div[5]/div[2]/span[2]");
        WebElement objImpressionPercentage = browserFactory.getDriver().findElement(ImpressionPercentage);
        System.out.println("objImpressionPercentage : " + objImpressionPercentage.getText());
        return webElement.getText().toLowerCase().contains("Discrepancy (DSP vs Ad Server)".toLowerCase());*/

        return getElement("//*[@id='root']/div/section//div[5]/div[1]/div/div[1]").getText().toLowerCase().contains("DSP DELIVERY".toLowerCase());
    }

    public boolean CheckForPerformanceDetails(){
       boolean  returnType;
        returnType =   getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]").getText().toLowerCase().contains("PERFORMANCE".toLowerCase());
        List<WebElement> webElements =getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div");
        returnType = returnType && webElements.get(0).getText().toLowerCase().contains("Total".toLowerCase());
        returnType = returnType && webElements.get(1).getText().toLowerCase().contains("7 day".toLowerCase());
        returnType = returnType && webElements.get(2).getText().toLowerCase().contains("Pacing".toLowerCase());

        webElements =getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div/div[2]");
        for (WebElement element:webElements) {
            if(!element.getText().toLowerCase().contains("-".toLowerCase()))
                returnType = returnType && element.getText().toLowerCase().matches(".*\\d+.*");
        }
        return returnType;
    }

    public boolean  CheckForCostBreakdownDetails(){
        boolean  returnType;
        returnType =   getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[1]/div/div[1]").getText().toLowerCase().contains("COST BREAKDOWN".toLowerCase());
        By DiscrepancyDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[2]/div");
        List<WebElement> webElements = browserFactory.getDriver().findElements(DiscrepancyDetails);
        returnType = returnType && webElements.get(0).getText().toLowerCase().contains("Platform cost".toLowerCase());
        returnType = returnType && webElements.get(1).getText().toLowerCase().contains("Tech cost".toLowerCase());
        returnType = returnType && webElements.get(2).getText().toLowerCase().contains("Data fees".toLowerCase());
        returnType = returnType && webElements.get(3).getText().toLowerCase().contains("Other cost".toLowerCase());
        returnType = returnType && webElements.get(4).getText().toLowerCase().contains("Cost".toLowerCase());

        webElements =getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[2]/div/div[2]");
        for (WebElement element:webElements) {
            if(!element.getText().toLowerCase().contains("-".toLowerCase()))
                returnType = returnType && element.getText().toLowerCase().matches(".*\\d+.*");
        }
        return returnType;
    }

    public boolean CheckForMRCViewabilityDetails(){
        boolean  returnType;
        returnType =   getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[1]/div/div")
                .getText().toLowerCase().contains("MRC VIEWABILITY".toLowerCase());
        List<WebElement> webElements = getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[2]/div");
        returnType = returnType && webElements.get(0).getText().toLowerCase().contains("Trackable".toLowerCase());
        returnType = returnType && webElements.get(1).getText().toLowerCase().contains("Measurable".toLowerCase());
        returnType = returnType && webElements.get(2).getText().toLowerCase().contains("Viewable".toLowerCase());
        webElements =getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[2]/div/div[2]");
        for (WebElement element:webElements) {
            if(!element.getText().toLowerCase().contains("-".toLowerCase()))
                returnType = returnType && element.getText().toLowerCase().matches(".*\\d+.*");
        }
        return returnType;
    }

   public boolean CheckForLightDetailsCollapsed(){
        GeneralUtilites.wait(1);
       return btnExpand.getAttribute("class").contains("Collapsed");
   }

    public boolean CheckForDSPDeliveryDetailsToolTip(){
        WebElement webElement = getElement("//*[@id='root']/div/section//div[5]/div[1]/div/div[2]");
        Actions toolAct = new Actions(browserFactory.getDriver());
        toolAct.moveToElement(webElement).build().perform();
        GeneralUtilites.wait(2);
        return txtTooltip.getText().toLowerCase().contains("Delivery across all mirrored DSPs".toLowerCase());
    }

    public boolean CheckForPerformanceDetailsToolTip(){
        WebElement webElement = getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[2]/div/span");
        Actions toolAct = new Actions(browserFactory.getDriver());
        toolAct.moveToElement(webElement).build().perform();
        GeneralUtilites.wait(2);
        return txtTooltip.getText().toLowerCase().contains("Performance against the flight primary goal".toLowerCase());
    }
    public boolean CheckForActualGoalDetailsToolTip(){
        By ActualGoalDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div//div[2]/div/div[2]/div/div/div[1]/div[1]/span");
        WebElement webElement = browserFactory.getDriver().findElement(ActualGoalDetails);
        Actions toolAct = new Actions(browserFactory.getDriver());
        toolAct.moveToElement(webElement).build().perform();
        GeneralUtilites.wait(2);
        return txtTooltip.getText().toLowerCase().contains("Actual Goal".toLowerCase());
    }
    public boolean CheckForViewabilityDetailsToolTip(){
        By ActualGoalDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div//div[2]/div/div[2]/div/div/div[2]/div[1]/span");
        WebElement webElement = browserFactory.getDriver().findElement(ActualGoalDetails);
        Actions toolAct = new Actions(browserFactory.getDriver());
        toolAct.moveToElement(webElement).build().perform();
        GeneralUtilites.wait(2);
        return txtTooltip.getText().toLowerCase().contains("Viewability".toLowerCase());
    }

    public boolean CheckForAdServerDetailsToolTip(){
        By ActualGoalDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div//div[2]/div/div[2]/div/div/div[4]/div[1]/span");
        WebElement webElement = browserFactory.getDriver().findElement(ActualGoalDetails);
        Actions toolAct = new Actions(browserFactory.getDriver());
        toolAct.moveToElement(webElement).build().perform();
        GeneralUtilites.wait(2);
        return txtTooltip.getText().toLowerCase().contains("Ad server data at flight level".toLowerCase());
    }

    public boolean CheckForNoFlightsMatchingForSearch(){
        By Message = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div");
        WebElement webElement = browserFactory.getDriver().findElement(Message);
        return webElement.getText().toLowerCase().contains("Sorry, there are no flights matching your search. Please try again.".toLowerCase());
    }

    public boolean CheckForPrimaryGoalDetails(){
        boolean returnType;
        By DiscrepancyDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div");
        List<WebElement> webElements = browserFactory.getDriver().findElements(DiscrepancyDetails);
        returnType = webElements.get(0).getText().toLowerCase().contains("Total".toLowerCase());
        returnType = returnType && webElements.get(1).getText().toLowerCase().contains("7 day".toLowerCase());
        returnType = returnType && webElements.get(2).getText().toLowerCase().contains("Pacing".toLowerCase());
        return returnType;
    }



    public boolean CheckForCampaignDetailsForFlight(){
        By CampaignDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[7]");
        List<WebElement> webElements = browserFactory.getDriver().findElements(CampaignDetails);
        return webElements.get(0).getText().toLowerCase().contains("CAMPAIGN:".toLowerCase());
    }

    public boolean CheckForCampaignNameForFlight(String CampaignName){
        boolean returnType = true;
        By CampaignDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[7]");
        List<WebElement> webElements = browserFactory.getDriver().findElements(CampaignDetails);
        for (WebElement camp:webElements) {
            returnType = returnType &&  camp.getText().toLowerCase().contains(CampaignName.toLowerCase());
        }
        return returnType;
    }

    public boolean CheckForDSPDeliveryDetails(){
        boolean  returnType;
        returnType =   getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[5]/div[1]/div/div[1]").getText().toLowerCase().contains("DSP Delivery".toLowerCase());
        By DiscrepancyDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[5]/div[2]/div");
        List<WebElement> webElements = browserFactory.getDriver().findElements(DiscrepancyDetails);
        returnType = returnType && webElements.get(0).getText().toLowerCase().contains("Impressions".toLowerCase());
        returnType = returnType && webElements.get(1).getText().toLowerCase().contains("Clicks".toLowerCase());
        returnType = returnType && webElements.get(2).getText().toLowerCase().contains("Conversions".toLowerCase());

        webElements =getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[5]/div[2]/div/div[2]");
        for (WebElement element:webElements) {
            if(!element.getText().toLowerCase().contains("-".toLowerCase()))
                returnType = returnType && element.getText().toLowerCase().matches(".*\\d+.*");
        }

        return returnType;
    }

    public boolean CheckForAdServerDeliveryDetails(){
        boolean  returnType;
        returnType =   getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/div/div/div[6]/div[1]/div/div").getText().toLowerCase().contains("AD SERVER DELIVERY".toLowerCase());
        By DiscrepancyDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/div/div/div[6]/div[2]/div");
        List<WebElement> webElements = browserFactory.getDriver().findElements(DiscrepancyDetails);
        returnType = returnType && webElements.get(0).getText().toLowerCase().contains("Impressions".toLowerCase());
        returnType = returnType && webElements.get(1).getText().toLowerCase().contains("Imp. discrepancy vs DSP".toLowerCase());
        returnType = returnType && webElements.get(2).getText().toLowerCase().contains("Clicks".toLowerCase());
        returnType = returnType && webElements.get(3).getText().toLowerCase().contains("Conversions".toLowerCase());
        return returnType;
    }

    public boolean  CheckForAdvertiserPlatformTab(){
        boolean returnType = true;
        By SeatIcons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div/div[3]/div/button");
        WebElement SeatIconsObj = browserFactory.getDriver().findElement(SeatIcons);
        mouseClick(SeatIconsObj);
        GeneralUtilites.wait(1);
        By PlatformIcons = By.xpath("/html/body/div/div/div[contains(@class,'theme_menu_2bOZL theme_topRight_tGYgQ theme_active_3owm6')]/ul/li");
        int count = getElementCount("/html/body/div/div/div[contains(@class,'theme_menu_2bOZL theme_topRight_tGYgQ theme_active_3owm6')]/ul/li");
        for(int i=0; i<count;i++ )
        {
            mouseClick(getElements("/html/body/div/div/div[contains(@class,'theme_menu_2bOZL theme_topRight_tGYgQ theme_active_3owm6')]/ul/li").get(i));
            GeneralUtilites.wait(2);
            List<String> browserTabs = new ArrayList<>(this.browserFactory.getDriver().getWindowHandles());
            returnType = browserTabs.size() >= 2 && returnType;
            this.browserFactory.getDriver().switchTo().window(browserTabs.get(1));
            this.browserFactory.getDriver().close();
            this.browserFactory.getDriver().switchTo().window(browserTabs.get(0));
            GeneralUtilites.wait(1);
            Actions toolAct = new Actions(browserFactory.getDriver());
            toolAct.moveToElement(SeatIconsObj).build().perform();
            GeneralUtilites.wait(1);
            mouseClick(SeatIconsObj);
            GeneralUtilites.wait(1);
            mouseClick(SeatIconsObj);
        }
        return returnType;
    }

    public boolean CheckIfFlightSortedOn(String HeaderName)
    {
        String columnXpath = "";
        switch (HeaderName)
        {
            case "Agency" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]";
                break;
            case "Group Advertiser" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]";
                break;
            case "Advertiser" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[4]";
                break;
            case "Market" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[5]";
                break;
            case "Booking" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[6]";
                break;
            case "Campaign" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[7]";
                break;
            case "Flight" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[8]";
                break;
            case "Budget" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[9]";
                break;
            case "Cost" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[10]";
                break;
            case "Cost Yesterday" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[11]";
                break;
            case "Start Date" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[12]";
                break;
            case "End Date" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[13]";
                break;
        }
        List<WebElement> columnHeaders = getElements(columnXpath);
        List<String> actualColumn = new ArrayList<>();
        for (WebElement objHeader :columnHeaders) actualColumn.add(objHeader.getText().toLowerCase());
        return  GeneralUtilites.isCollectionSorted(actualColumn);
    }
}
