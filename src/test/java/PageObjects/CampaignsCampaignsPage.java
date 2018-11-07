
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

    @FindBy(how=How.XPATH, using = "//*[@id='root']/div/section//label[@data-react-toolbox='checkbox']/div")
    public WebElement chbtnShowDecimalPlaces;

    @FindBy(how = How.XPATH, using = "/html/body/div/span[contains(@class,'theme_tooltip')]/span[contains(@class,'theme_tooltipInner')]")
    public WebElement txtTooltip;

    @FindBy(how=How.XPATH,using = "//*[@id='root']/div/section//i[contains(@class,'expandedIconCollapsed')]")
    public WebElement btnExpand;

    @FindBy(how=How.XPATH,using = "//*[@id='root']/div/section//i[contains(@class,'expandIconExpanded')]")
    public WebElement btnCollaspe;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[7]/div")
    private WebElement txtBudget;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[8]/div")
    private WebElement txtCost;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/div/div[1]/button")
    public  WebElement btnCampaignCreatives;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/div/div[2]/button")
    public  WebElement btnCampaignPixels;

    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/section//div/input")
    public WebElement txtSearch;

    @FindBy(how=How.XPATH,using = "//*[@id='root']/div/section//div[2]/div[2]/button")
    public   WebElement btnFilter;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//*[@class='automation_campaignsFilterSort']//button")
    private WebElement btnSort;

    @FindBy(how = How.XPATH, using = "/html/body//section//div[@class='automation_campaignsFilterAdvertiser local_filter_1dfE4']//input")
    public WebElement txtAdvertiser;

    @FindBy(how = How.XPATH, using = "/html/body//section//div[@class='automation_campaignsFilterAgency local_filter_1dfE4']//input")
    public WebElement txtAgency;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//*[@class='automation_campaignsFilterRequiresAction']//input[@name='onlyWithEmptyGoalOrUnknownTrader']/../div")
    public WebElement chbxRequiresAction;

    @FindBy(how = How.XPATH, using = "//*[@id='root']//*[contains(@class,'automation_campaignsFilterApply')]")
    public WebElement btnApplyFilters;

    @FindBy(how = How.XPATH, using = "//html/body//button[@title='Clear Filters']")
    public WebElement btnClearFilters;

    @FindBy(how = How.XPATH, using = "//html/body//section/div[2]//button[1]")
    public WebElement btnOkFilters;

    @FindBy(how = How.XPATH, using = "//html/body//section/div[2]//button[2]")
    public WebElement btnCancelFilters;

    //html/body//button[@title='Clear Filters']
    // "//*[@id='root']/div/section//div[@role='columnheader']/div[text()='"+TableHeader+"']"
    //*[@id='root']/div/section//i[contains(@class,'expandedIconCollapsed')]
    //*[@id='root']/div/section//i[contains(@class,'expandIconExpanded')]

    @FindBy(how=How.XPATH, using = " //*[@id='root']//div[@class='local_menuButton_oXknz automation_operationalLevelReportsIcon']/button")
    @CacheLookup
    public WebElement btnOperationalLevelReport;

    public int GetCampaignRowsCount() {
        return getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div");
    }

    public boolean CheckForNoCampaignMatchingForSearch(){
        By Message = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div");
        WebElement webElement = browserFactory.getDriver().findElement(Message);
        return webElement.getText().toLowerCase().contains("Sorry, there are no campaigns matching your search. Please try again.".toLowerCase());
    }

    public boolean CheckForCampaignNameForCampaign(String CampaignName){
        boolean returnType = true;
        By CampaignDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[6]");
        List<WebElement> webElements = browserFactory.getDriver().findElements(CampaignDetails);
        for (WebElement camp:webElements) {
            returnType = returnType &&  camp.getText().toLowerCase().contains(CampaignName.toLowerCase());
        }
        return returnType;
    }

    public boolean CheckForMRCViewabilityDetails(){
        boolean  returnType;
        returnType =   getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div[1]/div/div")
                .getText().toLowerCase().contains("MRC VIEWABILITY".toLowerCase());
        List<WebElement> webElements = getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div[2]/div");
        returnType = returnType && webElements.get(0).getText().toLowerCase().contains("Trackable".toLowerCase());
        returnType = returnType && webElements.get(1).getText().toLowerCase().contains("Measurable".toLowerCase());
        returnType = returnType && webElements.get(2).getText().toLowerCase().contains("Viewable".toLowerCase());
        webElements =getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div[2]/div/div[2]");
        for (WebElement element:webElements) {
            if(!element.getText().toLowerCase().contains("-".toLowerCase()))
                returnType = returnType && element.getText().toLowerCase().matches(".*\\d+.*");
        }
        return returnType;
    }

    public boolean  CheckForCostBreakdownDetails(){
        boolean  returnType;
        returnType =   getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]").getText().toLowerCase().contains("COST BREAKDOWN".toLowerCase());
        By DiscrepancyDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div");
        List<WebElement> webElements = browserFactory.getDriver().findElements(DiscrepancyDetails);
        returnType = returnType && webElements.get(0).getText().toLowerCase().contains("Platform cost".toLowerCase());
        returnType = returnType && webElements.get(1).getText().toLowerCase().contains("Tech cost".toLowerCase());
        returnType = returnType && webElements.get(2).getText().toLowerCase().contains("Data fees".toLowerCase());
        returnType = returnType && webElements.get(3).getText().toLowerCase().contains("Other cost".toLowerCase());
        returnType = returnType && webElements.get(4).getText().toLowerCase().contains("Cost".toLowerCase());
        webElements =getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div/div[2]");
        for (WebElement element:webElements) {
            if(!element.getText().toLowerCase().contains("-".toLowerCase()))
                returnType = returnType && element.getText().toLowerCase().matches(".*\\d+.*");
        }
        return returnType;
    }

    public boolean CheckForDSPDeliveryDetails(){
        boolean  returnType;
        returnType =   getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[1]/div/div[1]").getText().toLowerCase().contains("DSP Delivery".toLowerCase());
        By DiscrepancyDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[2]/div");
        List<WebElement> webElements = browserFactory.getDriver().findElements(DiscrepancyDetails);
        returnType = returnType && webElements.get(0).getText().toLowerCase().contains("Impressions".toLowerCase());
        returnType = returnType && webElements.get(1).getText().toLowerCase().contains("Clicks".toLowerCase());
        returnType = returnType && webElements.get(2).getText().toLowerCase().contains("Conversions".toLowerCase());

        webElements =getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[3]/div[2]/div/div[2]");
        for (WebElement element:webElements) {
            if(!element.getText().toLowerCase().contains("-".toLowerCase()))
                returnType = returnType && element.getText().toLowerCase().matches(".*\\d+.*");
        }

        return returnType;
    }

    public boolean CheckForAdServerDeliveryDetails(){
        boolean  returnType;
        returnType =   getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/div/div/div[4]/div[1]/div/div").getText().toLowerCase().contains("AD SERVER DELIVERY".toLowerCase());
        By DiscrepancyDetails = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/div/div/div[4]/div[2]/div");
        List<WebElement> webElements = browserFactory.getDriver().findElements(DiscrepancyDetails);
        returnType = returnType && webElements.get(0).getText().toLowerCase().contains("Impressions".toLowerCase());
        returnType = returnType && webElements.get(1).getText().toLowerCase().contains("Imp. discrepancy vs DSP".toLowerCase());
        returnType = returnType && webElements.get(2).getText().toLowerCase().contains("Clicks".toLowerCase());
        returnType = returnType && webElements.get(3).getText().toLowerCase().contains("Conversions".toLowerCase());
        return returnType;
    }

    public boolean CheckForDSPDeliveryDetailsToolTip(){
        WebElement webElement = getElement("//*[@id='root']/div/section//div[3]/div[1]/div/div[2]");
        Actions toolAct = new Actions(browserFactory.getDriver());
        toolAct.moveToElement(webElement).build().perform();
        GeneralUtilites.wait(2);
        return txtTooltip.getText().toLowerCase().contains("Delivery across all mirrored DSPs".toLowerCase());
    }

    public void ExpandCampaignDetails() {
        GeneralUtilites.wait(1);
        mouseClick(btnExpand);
        GeneralUtilites.wait(1);
    }

    public void CollaspeCampaignDetails() {
        GeneralUtilites.wait(1);
        mouseClick(btnCollaspe);
        GeneralUtilites.wait(1);
    }

    public boolean checkForDecimalPlaces()    {
        return txtBudget.getText().contains(".") && txtCost.getText().contains(".");
    }

    public void showDecimalPlaces()    {
        if(!chbtnShowDecimalPlaces.getAttribute("class").contains("checked"))
            mouseClick(chbtnShowDecimalPlaces);
    }
    public void hideDecimalPlaces()    {
        GeneralUtilites.wait(1);
        if(chbtnShowDecimalPlaces.getAttribute("class").contains("checked"))
            mouseClick(chbtnShowDecimalPlaces);
        GeneralUtilites.wait(1);
    }

    public boolean CheckIfCampaignSortedOn(String HeaderName)
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
            case "Campaign" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[6]";
                break;
            case "Budget" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[7]";
                break;
            case "Cost" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[8]";
                break;
            case "Start Date" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[9]";
                break;
            case "End Date" :
                columnXpath = "//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[10]";
                break;
        }
        List<WebElement> columnHeaders = getElements(columnXpath);
        List<String> actualColumn = new ArrayList<>();
        for (WebElement objHeader :columnHeaders) actualColumn.add(objHeader.getText().toLowerCase());
        return  GeneralUtilites.isCollectionSorted(actualColumn);
    }

    public void EnterSearchFilter(String Search, String Advertiser, String Agency) {
        if (!Search.equals(""))
            enterText(txtSearch, Search);
        if (!Advertiser.equals(""))
            enterText(txtAdvertiser, Advertiser);
        if (!Agency.equals(""))
            enterText(txtAgency, Agency);
        GeneralUtilites.wait(1);
        //  mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div/div[1]/div/div//div[6]/label/input[@value='ALL']"));
    }


    public boolean CheckSearchByCampaigns() {
        try {
            enterText(txtSearch, "Campaign");
            enterText(txtSearch, "Generic");
            return txtSearch.isDisplayed();
        } catch (Exception ex) {
            System.out.println("Exception : " + ex.getMessage());
            return false;
        }
    }

    public boolean CheckFilterExist() {
        GeneralUtilites.wait(1);
        mouseClick( getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/div[2]/button"));
        GeneralUtilites.wait(1);
        boolean  returnType =  txtAdvertiser.isDisplayed() && txtAgency.isDisplayed();
        return  returnType;
    }

}