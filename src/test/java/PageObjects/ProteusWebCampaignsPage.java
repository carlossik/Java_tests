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

    @FindBy(how = How.XPATH, using = "//*[@id='4']")
    @CacheLookup
    private WebElement tabCampaigns;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header//button")
    @CacheLookup
    private WebElement btnExpand;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[1]/aside/button[1]")
    @CacheLookup
    public WebElement btnFLIGHTS;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[1]/aside/button[2]")
    @CacheLookup
    public WebElement btnCREATIVES;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[1]/aside/button[3]")
    @CacheLookup
    public WebElement btnPIXELS;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/header/div/div[3]/div/div/div[2]/ul/li[2]")
    @CacheLookup
    private WebElement btnLogOut;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//*[@class='automation_flightsFilterSearchText']//input")
    private WebElement txtSearch;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//*[@class='automation_flightsFilterSort']//button")
    private WebElement btnSort;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//*[@class='automation_flightsFilterAdvertiser']//input")
    private WebElement txtAdvertiser;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//*[@class='automation_flightsFilterRequiresAction']//input[@name='onlyWithEmptyGoalOrUnknownTrader']/../div")
    public WebElement chbxRequiresAction;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//*[@class='automation_flightsFilterAgency']//input")
    private WebElement txtAgency;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//*[contains(@class,'automation_flightsFilterApply')]")
    public WebElement btnApplyFilters;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//*[contains(@class,'automation_flightsFilterCancel')]")
    public WebElement btnClearFilters;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//section/div/div[2]/div/div/div/div[2]/div")
    public WebElement rowFlights;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/div[2]/span/div/div/ul/li[1]/span")
    private WebElement lstSortByStartDateDescending;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/div[2]/span/div/div/ul/li[1]")
    private WebElement lstSortByStartDateDescendingBackground;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/div[2]/span/div/div/ul/li[2]/span")
    private WebElement lstSortByFlightCreatedDescending;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/div[2]/span/div/div/ul/li[2]")
    private WebElement lstSortByFlightCreatedDescendingBackground;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/div[2]/span/div/div/ul/li[3]/span")
    private WebElement lstSortByFlightUpdatedDescending;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/div[2]/span/div/div/ul/li[3]")
    private WebElement lstSortByFlightUpdatedDescendingBackground;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//h4")
    public WebElement txtFlightsCount;

    @FindBy(how = How.XPATH, using = "/html/body/div/span[contains(@class,'theme_tooltip')]/span[contains(@class,'theme_tooltipInner')]")
    private WebElement txtTooltip;

    @FindBy(how = How.XPATH, using = " //*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/div[2]/div/span[2]")
    private WebElement lblSortBy;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[4]/div[2]/span/div/div/ul/li[1]")
    private WebElement lstAdvertiserAnalysis;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[4]/div[2]/span/div/div/ul/li[2]")
    private WebElement lstOperationsBreakdown;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[1]/i")
    private WebElement btnAddEditGoalDetails;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]//form/div[1]//input")
    private WebElement drpdwnGoalType;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]//form/div[2]//input")
    private WebElement txtGoalTarget;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]//form//button[1]")
    private WebElement btnSave;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]")
    private WebElement txtOptimisationManager;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/i")
    private WebElement btnEditOptimisationManager;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/form/div/div/div/input")
    private WebElement txtEditOptimisationManager;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/i")
    private WebElement btnExpandFlightDetails;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[2]/span[2]")
    private WebElement txtImpressions;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[3]/span[2]")
    private WebElement txtClicks;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/span")
    public  WebElement btnFlightCreatives;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[2]/span")
    public  WebElement btnFlightPixels;

    public boolean CheckForCreativeTab()
    {
        By asideButtons = By.xpath("//*[@id='root']/div/section/div/div[1]/aside/button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(asideButtons);
        System.out.println("asideButtons count : " + elementTypes.size());
        return elementTypes.size() > 2 && elementTypes.get(1).getText().toUpperCase().contains("CREATIVES".toUpperCase());
    }

    public boolean CheckForPixelsTab()
    {
        By asideButtons = By.xpath("//*[@id='root']/div/section/div/div[1]/aside/button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(asideButtons);
        System.out.println("asideButtons count : " + elementTypes.size());
        return elementTypes.size() >= 3 && elementTypes.get(2).getText().toUpperCase().contains("PIXELS".toUpperCase());
    }

    public boolean CheckForAdvertiserCreativeIcon()
    {
        By btnCreatives = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/span");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(btnCreatives);
        System.out.println("btnCreatives count : " + elementTypes.size());
        return elementTypes.size() > 0;
    }

    public boolean CheckForAdvertiserPixelIcon()    {
        By btnCreatives = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/span");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(btnCreatives);
        System.out.println("btnPixel count : " + elementTypes.size());
        return elementTypes.size() > 0;
    }

    public boolean CheckForAdvertiserCreativeToolTip()
    {
        By AdvertiserCreativeIcon = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/span");
        WebElement webElement = browserFactory.getDriver().findElement(AdvertiserCreativeIcon);
       // System.out.println("Toop tip : " + getToolTip(webElement).toLowerCase());
        return getToolTip(webElement).toLowerCase().contains("View Creatives at Advertiser Level".toLowerCase());

    }

    public boolean  CheckForAdvertiserPixelToolTip()    {
        By AdvertiserPixelIcon = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/span");
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
        By FlightRow = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(FlightRow);
        System.out.println("Flight Count : " + elementTypes.size());
        return elementTypes.size();
    }

    public boolean CheckFLIGHTSExist() {
        return txtFlightsCount.isDisplayed();
    }

    public boolean CheckLogOutExist() {
        mouseClick(btnExpand);
        GeneralUtilites.wait(0.5);
        boolean boolLogOut = btnLogOut.isDisplayed();
        mouseClick(btnExpand);
        return boolLogOut;
    }

    public void Logout() {
        mouseClick(btnExpand);
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
        if (!Search.equals(""))
            enterText(txtSearch, Search);
        if (!Advertiser.equals(""))
            enterText(txtAdvertiser, Advertiser);
        if (!Agency.equals(""))
            enterText(txtAgency, Agency);

        GeneralUtilites.wait(1);
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/div[1]/div/div[6]/label/input[@value='ALL']"));
    }

    public boolean CheckFilterExist() {
        return txtAdvertiser.isDisplayed() && txtAgency.isDisplayed();
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
        By FlightRows = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(FlightRows);
        System.out.println("Flight Count : " + elementTypes.size());
        boolean returnType = true;
        if (elementTypes.size() <= 0)
            return false;
        else {
            for (WebElement objFlightRow : elementTypes) {
                List<WebElement> elementFlightDetails = browserFactory.getDriver().findElements(By.xpath("//*[@id='root']//span[contains(text(),'Flight: ')]"));
                if (elementFlightDetails.size() <= 0)
                    return false;
                else
                    returnType = returnType && elementFlightDetails.get(0).getText().toLowerCase().contains("Flight:".toLowerCase());

                elementFlightDetails = browserFactory.getDriver().findElements(By.xpath("//*[@id='root']//span[contains(text(),'Advertiser: ')]"));
                if (elementFlightDetails.size() <= 0)
                    return false;
                else
                    returnType = returnType && elementFlightDetails.get(0).getText().toLowerCase().contains("Advertiser:".toLowerCase());

                elementFlightDetails = browserFactory.getDriver().findElements(By.xpath("//*[@id='root']//span[contains(text(),'Booking Code: ')]"));
                if (elementFlightDetails.size() <= 0)
                    return false;
                else
                    returnType = returnType && elementFlightDetails.get(0).getText().toLowerCase().contains("Booking Code:".toLowerCase());
                // elementFlightDetails = browserFactory.getDriver().findElements(By.xpath("//*[@id='root']//span[contains(text(),'Agency: ')]"));
                // if (elementFlightDetails.size() <= 0)
                //else
                //  returnType = returnType && elementFlightDetails.get(3).getText().contains("Agency:");
            }
        }
        return returnType;
    }


    public boolean CheckFlightGoalDetailsShown() {
        By FlightRows = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(FlightRows);
        System.out.println("Flight Count : " + elementTypes.size());
        boolean returnType = true;
        if (elementTypes.size() <= 0)
            return false;
        else {
            for (WebElement objFlightRow : elementTypes) {
                List<WebElement> elementFlightDetails = objFlightRow.findElements(By.xpath("./div[2]/div/div/div/div/div/div"));
                if (elementFlightDetails.size() <= 0)
                    return false;
                else {
                    returnType = returnType && !elementFlightDetails.get(0).getText().equals("");
                    returnType = returnType && !elementFlightDetails.get(2).getText().equals("");
                    returnType = returnType && elementFlightDetails.get(1).getText().contains("SPEND VS BUDGET");
                    returnType = returnType && elementFlightDetails.get(4).getText().contains("Start:");
                }
            }
            return returnType;
        }
    }

    public boolean CheckFlightBudgetCurrencyCodeShown() {
        By FlightRows = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div");
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
        By editableButtons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div/div/i");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(editableButtons);
        System.out.println("\nFlight Count : " + elementTypes.size());
        return elementTypes.size() >= 2;
    }

    public boolean CheckForProgressBar() {
        By ProgressBar = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div/div[4]/div/div[2]/div/div");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(ProgressBar);
        System.out.println("\nFlight Count : " + elementTypes.size());
        return elementTypes.size() >= 1;
    }


    public boolean CheckForStartDate() {
        By StartDate = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div/div[4]/div/div[1]/div[1]");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(StartDate);
        System.out.println("\nFlight Count : " + elementTypes.size());
        return elementTypes.size() >= 1;
    }


    public boolean CheckForEndDate() {
        By EndDate = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div/div[4]/div/div[1]/div[3]");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(EndDate);
        System.out.println("\nFlight Count : " + elementTypes.size());
        return elementTypes.size() >= 1;
    }

    public boolean CheckForInfiniteBudgetIcon() {
        By EndDate = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div/div[4]/div/div[1]/div[3]/div/span ");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(EndDate);
        System.out.println("\n Flight Count : " + elementTypes.size());
        boolean returnType;
        if (elementTypes.size() >= 1) {
            returnType = elementTypes.get(0).getAttribute("class").contains("infinity");
            Actions toolAct = new Actions(browserFactory.getDriver());
            toolAct.clickAndHold(elementTypes.get(0)).build().perform();
            GeneralUtilites.wait(2);
            returnType = returnType && txtTooltip.getText().toLowerCase().contains("Indefinite".toLowerCase());
            return returnType;
        } else
            return false;
    }

    public boolean RecordsSortedBy(String strQuery) {
        By flights = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/span[2]");
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
        By ReportButtons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[1]/div[6]/div[4]/span/div/button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(ReportButtons);
        System.out.println("\n ReportButtons Count : " + elementTypes.size());
        return elementTypes.size();
    }

    public int getOperationUnitReportButtonCount(){
        By ReportButtons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/div[1]/span/div/button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(ReportButtons);
        System.out.println("\n ReportButtons Count : " + elementTypes.size());
        return elementTypes.size();
    }

    public boolean ReportToolTipShown(String strReportType) {
        By btnReports;
        String ToolTipText;
        if(strReportType.toUpperCase().equals("OperationUnit".toUpperCase())) {
           btnReports = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/div[1]/span/div/button");
            ToolTipText= "Click to go to reports at Operational Unit level";
        }
        else {
           btnReports = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[1]/div[6]/div[4]/span/div/button");
            ToolTipText= "Click to go to reports at Flight level";
        }
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(btnReports);
        //   System.out.println("\n Flight Count : " + elementTypes.size());
        boolean returnType;
        if (elementTypes.size() >= 1) {
            returnType = getToolTip(elementTypes.get(0)).toLowerCase().contains(ToolTipText.toLowerCase());
            return returnType;
        }
        else
            return false;
    }

    public boolean ReportingOptions() {
        By ReportButtons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[1]/div[6]/div[4]/span/div/button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(ReportButtons);
        mouseClick(elementTypes.get(0));
        By ReportOptions = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[6]/div[4]/span/div/div/ul/li/span");
        List<WebElement> elementReportOptions = browserFactory.getDriver().findElements(ReportOptions);
        return elementReportOptions.size() == 2
                && elementReportOptions.get(1).getText().toUpperCase().contains("Data Explorer".toUpperCase())
                && elementReportOptions.get(0).getText().toUpperCase().contains("Operations Breakdown".toUpperCase());
    }

    public boolean OperationalUnitReportingOptions(){
        By ReportButtons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/div[1]/span/div/button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(ReportButtons);
        mouseClick(elementTypes.get(0));
        By ReportOptions = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/div[1]/span/div/div/ul/li/span");
        List<WebElement> elementReportOptions = browserFactory.getDriver().findElements(ReportOptions);
        return elementReportOptions.size() == 2
                && elementReportOptions.get(1).getText().toUpperCase().contains("Performance Overview".toUpperCase())
                && elementReportOptions.get(0).getText().toUpperCase().contains("Management Report".toUpperCase());
    }

    public void SelectTableauReporting(String ReportType) {
        By ReportButtons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[1]/div[6]/div[4]/span/div/button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(ReportButtons);
        mouseClick(elementTypes.get(0));
        GeneralUtilites.wait(2);
        By ReportOptions = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[6]/div[4]/span/div/div/ul/li/span");
        List<WebElement> elementReportOptions = browserFactory.getDriver().findElements(ReportOptions);

        if (ReportType.equals("Data Explorer"))
            mouseClick(elementReportOptions.get(1));
        else if (ReportType.equals("Operations Breakdown"))
            mouseClick(elementReportOptions.get(0));
    }

    public void SelectTableauOperationalUnitReporting(String ReportType) {
        By ReportButtons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/div[1]/span/div/button");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(ReportButtons);
        mouseClick(elementTypes.get(0));
        GeneralUtilites.wait(2);
        By ReportOptions = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/div[1]/span/div/div/ul/li/span");
        List<WebElement> elementReportOptions = browserFactory.getDriver().findElements(ReportOptions);

        if (ReportType.equals("Management Report"))
            mouseClick(elementReportOptions.get(0));
        else if (ReportType.equals("Performance Overview"))
            mouseClick(elementReportOptions.get(1));
    }

    public boolean AddGoalDetailsButtonExist() {
        return btnAddEditGoalDetails.isDisplayed();
    }

    public boolean  EditGoalDetailsButtonExist() {
        return btnAddEditGoalDetails.getAttribute("class").contains("edit");
    }

    public boolean GoalInfoAndTargetExist(){
        By AddGoalDetailsButton = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[1]/div[2]");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(AddGoalDetailsButton);
        return elementTypes.get(0).getText().toLowerCase().equals("Goal Info and Target".toLowerCase());
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
        mouseClick(btnSave);
    }

    public boolean CheckGoalDetailsSaved(String GoalType, String GoalTarget)
    {
        String flightName = txtSearch.getAttribute("value");
        mouseClick(btnClearFilters);
        GeneralUtilites.wait(2);
        EnterSearchFilter(flightName,"","");
        mouseClick(btnApplyFilters);
        GeneralUtilites.wait(2);
        By txtGoalType   = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[1]/div[1]");
        By txtGoalTarget = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[1]/div[2]");
        WebElement  elementGoalType = browserFactory.getDriver().findElement(txtGoalType);
        WebElement  elementGoalTarget = browserFactory.getDriver().findElement(txtGoalTarget);

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
        mouseClick(btnEditOptimisationManager);
        mouseClick(txtEditOptimisationManager);
        enterText(txtEditOptimisationManager, OptManager);
        mouseClick(btnSave);
    }

    public boolean CheckOptimisationManagerDetailsSaved(String OptManager ){
        String flightName = txtSearch.getAttribute("value");
        mouseClick(btnClearFilters);
        GeneralUtilites.wait(2);
        EnterSearchFilter(flightName,"","");
        mouseClick(btnApplyFilters);
        GeneralUtilites.wait(2);
        return  txtOptimisationManager.getText().toLowerCase().equals(OptManager.toLowerCase());
    }

    public boolean CheckForPlatformIcons(){
        By PlatformIcons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[2]/span");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(PlatformIcons);
        return elementTypes.size() >= 1 ;
    }

    public boolean  CheckForPlatformIconsTooltips(){
        boolean returnType = true;
        By PlatformIcons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[2]/span");
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
        GeneralUtilites.wait(1);
        mouseClick(btnExpandFlightDetails);
        GeneralUtilites.wait(1);
        return txtImpressions.getText() +";"+txtClicks.getText();
    }

    public void ExpandFlightDetails() {
        GeneralUtilites.wait(1);
        mouseClick(btnExpandFlightDetails);
        GeneralUtilites.wait(1);
    }

    public boolean CheckForDiscrepancyDetails(){

        By DiscrepancyDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[5]/div[1]");
        WebElement webElement = browserFactory.getDriver().findElement(DiscrepancyDetails);

        By ImpressionPercentage = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[5]/div[2]/span[2]");
        WebElement objImpressionPercentage = browserFactory.getDriver().findElement(ImpressionPercentage);
        System.out.println("objImpressionPercentage : " + objImpressionPercentage.getText());
        return webElement.getText().toLowerCase().contains("Discrepancy (DSP vs Ad Server)".toLowerCase());
    }

    public boolean CheckForDiscrepancyDetailsToolTip(){
        By DiscrepancyDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[5]/div[1]/span");
        WebElement webElement = browserFactory.getDriver().findElement(DiscrepancyDetails);
        Actions toolAct = new Actions(browserFactory.getDriver());
        toolAct.moveToElement(webElement).build().perform();
        GeneralUtilites.wait(2);
        return txtTooltip.getText().toLowerCase().contains("Discrepancy between DSP and AD Server data where DSP is the source of truth".toLowerCase());
    }
    public boolean CheckForActualGoalDetailsToolTip(){
        By ActualGoalDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div[1]/span");
        WebElement webElement = browserFactory.getDriver().findElement(ActualGoalDetails);
        Actions toolAct = new Actions(browserFactory.getDriver());
        toolAct.moveToElement(webElement).build().perform();
        GeneralUtilites.wait(2);
        return txtTooltip.getText().toLowerCase().contains("Actual Goal".toLowerCase());
    }
    public boolean CheckForViewabilityDetailsToolTip(){
        By ActualGoalDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/span");
        WebElement webElement = browserFactory.getDriver().findElement(ActualGoalDetails);
        Actions toolAct = new Actions(browserFactory.getDriver());
        toolAct.moveToElement(webElement).build().perform();
        GeneralUtilites.wait(2);
        return txtTooltip.getText().toLowerCase().contains("Viewability".toLowerCase());
    }
    public boolean CheckForDSPDataDetailsToolTip(){

        By ActualGoalDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div[1]/span");
        WebElement webElement = browserFactory.getDriver().findElement(ActualGoalDetails);
        Actions toolAct = new Actions(browserFactory.getDriver());
        toolAct.moveToElement(webElement).build().perform();
        GeneralUtilites.wait(2);
        return txtTooltip.getText().toLowerCase().contains("DSP data at flight level".toLowerCase());

    }
    public boolean CheckForAdServerDetailsToolTip(){
        By ActualGoalDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[4]/div[1]/span");
        WebElement webElement = browserFactory.getDriver().findElement(ActualGoalDetails);
        Actions toolAct = new Actions(browserFactory.getDriver());
        toolAct.moveToElement(webElement).build().perform();
        GeneralUtilites.wait(2);
        return txtTooltip.getText().toLowerCase().contains("Ad server data at flight level".toLowerCase());
    }

    public boolean CheckForNoFlightsMatchingForSearch(){
        By Message = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div");
        WebElement webElement = browserFactory.getDriver().findElement(Message);
        return webElement.getText().toLowerCase().contains("Sorry, there are no flights matching your search. Please try again.".toLowerCase());
    }

    public boolean CheckForPrimaryGoalDetails(){
        boolean returnType;
        By DiscrepancyDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div");
        List<WebElement> webElements = browserFactory.getDriver().findElements(DiscrepancyDetails);
        returnType = webElements.get(0).getText().toLowerCase().contains("Actual Goal".toLowerCase());
        returnType = returnType && webElements.get(1).getText().toLowerCase().contains("Overall Actual".toLowerCase());
        returnType = returnType && webElements.get(2).getText().toLowerCase().contains("7 day actual".toLowerCase());
        return returnType;
    }

    public boolean CheckForViewabilityDetails(){
        boolean returnType;
        By DiscrepancyDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div");
        List<WebElement> webElements = browserFactory.getDriver().findElements(DiscrepancyDetails);
        returnType = webElements.get(0).getText().toLowerCase().contains("Viewability".toLowerCase());
        returnType = returnType && webElements.get(2).getText().toLowerCase().contains("Measurable".toLowerCase());
        returnType = returnType && webElements.get(1).getText().toLowerCase().contains("Trackable".toLowerCase());
        returnType = returnType && webElements.get(3).getText().toLowerCase().contains("Viewable".toLowerCase());
        return returnType;
    }

    public boolean CheckForCampaignDetailsForFlight(){
        By CampaignDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/span[1]");
        List<WebElement> webElements = browserFactory.getDriver().findElements(CampaignDetails);
        return webElements.get(0).getText().toLowerCase().contains("CAMPAIGN:".toLowerCase());
    }

    public boolean CheckForCampaignNameForFlight(String CampaignName){
        boolean returnType = true;
        By CampaignDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/span[2]");
        List<WebElement> webElements = browserFactory.getDriver().findElements(CampaignDetails);
        for (WebElement camp:webElements) {
            returnType = returnType &&  camp.getText().toLowerCase().contains(CampaignName.toLowerCase());
        }
        return returnType;
    }

    public boolean CheckForDSPDataDetails(){
        boolean returnType;
        By DiscrepancyDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div");
        List<WebElement> webElements = browserFactory.getDriver().findElements(DiscrepancyDetails);
        returnType = webElements.get(0).getText().toLowerCase().contains("DSP Data".toLowerCase());
        returnType = returnType && webElements.get(1).getText().toLowerCase().contains("Impressions".toLowerCase());
        returnType = returnType && webElements.get(2).getText().toLowerCase().contains("Clicks".toLowerCase());
        returnType = returnType && webElements.get(3).getText().toLowerCase().contains("Conversions".toLowerCase());
        return returnType;
    }

    public boolean CheckForAdServerDataDetails(){
        boolean returnType;
        By DiscrepancyDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[4]/div");
        List<WebElement> webElements = browserFactory.getDriver().findElements(DiscrepancyDetails);
        returnType = webElements.get(0).getText().toLowerCase().contains("Ad Server Data".toLowerCase());
        returnType = returnType && webElements.get(1).getText().toLowerCase().contains("Impressions".toLowerCase());
        returnType = returnType && webElements.get(2).getText().toLowerCase().contains("Clicks".toLowerCase());
        returnType = returnType && webElements.get(3).getText().toLowerCase().contains("Conversions".toLowerCase());
        return returnType;
    }

    public boolean  CheckForAdvertiserPlatformTab(){
        boolean returnType = true;
        By SeatIcons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[2]/span");
        WebElement SeatIconsObj = browserFactory.getDriver().findElement(SeatIcons);
        mouseClick(SeatIconsObj);
        By PlatformIcons = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[6]/div[2]/span/div/div/ul/li");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(PlatformIcons);
        for (WebElement elementType :elementTypes) {
            mouseClick(elementType);
            GeneralUtilites.wait(2);
            List<String> browserTabs = new ArrayList<>(this.browserFactory.getDriver().getWindowHandles());
            returnType = browserTabs.size() >= 2 && returnType;
            this.browserFactory.getDriver().switchTo().window(browserTabs.get(1));
            this.browserFactory.getDriver().close();
            this.browserFactory.getDriver().switchTo().window(browserTabs.get(0));
            GeneralUtilites.wait(1);
            mouseClick(SeatIconsObj);
        }
        return returnType;
    }

}
