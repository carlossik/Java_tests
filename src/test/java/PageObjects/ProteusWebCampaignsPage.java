package PageObjects;

import SupportingUtilites.BrowserFactory;
import SupportingUtilites.GeneralUtilites;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.*;

public class ProteusWebCampaignsPage extends BrowserFactory
{
    private BrowserFactory browserFactory;

    public ProteusWebCampaignsPage(BrowserFactory browserFactory)  {
        this.browserFactory = browserFactory;
        PageFactory.initElements(browserFactory.getDriver(),this );
    }

    @FindBy(how= How.XPATH , using = "//*[@id='0']")
    @CacheLookup
    public WebElement tabHome;

    @FindBy(how= How.XPATH , using = "//*[@id='4']")
    @CacheLookup
    public WebElement tabCampaigns;

    @FindBy(how= How.XPATH , using = "//*[@id='root']/div/header//button")
    @CacheLookup
    public WebElement btnExpand;

    @FindBy(how= How.XPATH , using = "//*[@id='root']/div/section/div/div[1]/aside/button")
    @CacheLookup
    public WebElement btnFLIGHTS;

    @FindBy(how= How.XPATH , using = "//*[@id='root']/div/header/div/div[3]/div/div/div[2]/ul/li[2]")
    @CacheLookup
    public WebElement btnLogOut ;

    @FindBy(how= How.XPATH , using = "//*[@id='root']//*[@class='automation_flightsFilterSearchText']//input")
    @CacheLookup
    public WebElement txtSearch;

    @FindBy(how= How.XPATH , using = "//*[@id='root']//*[@class='automation_flightsFilterSort']//button")
    public WebElement btnSort;

    @FindBy(how= How.XPATH , using = "//*[@id='root']//*[@class='automation_flightsFilterAdvertiser']//input")
    @CacheLookup
    public WebElement txtAdvertiser ;

    @FindBy(how= How.XPATH , using = "//*[@id='root']//*[@class='automation_flightsFilterRequiresAction']//input[@name='onlyWithEmptyGoalOrUnknownTrader']/../div")
    @CacheLookup
    public WebElement chbxRequiresAction ;

    @FindBy(how= How.XPATH , using = "//*[@id='root']//*[@class='automation_flightsFilterAgency']//input")
    @CacheLookup
    public WebElement txtAgency;

    @FindBy(how= How.XPATH , using= "//*[@id='root']//*[contains(@class,'automation_flightsFilterApply')]")
    @CacheLookup
    public WebElement btnApplyFilters;

    @FindBy(how= How.XPATH , using= "//*[@id='root']//*[contains(@class,'automation_flightsFilterCancel')]")
    @CacheLookup
    public WebElement btnClearFilters;

    @FindBy(how= How.XPATH , using = "//*[@id='root']//section/div/div[2]/div/div/div/div[2]/div")
    public WebElement rowFlights;

    @FindBy(how= How.XPATH , using = "/html/body//section//ul/li[1]/span")
    public WebElement lstSortByStartDateDescending;

    @FindBy(how= How.XPATH , using = "/html/body//section//ul/li[1]")
    public WebElement lstSortByStartDateDescendingBackground;

    @FindBy(how= How.XPATH , using = "/html/body//section//ul/li[2]/span")
    public WebElement lstSortByFlightCreatedDescending;

    @FindBy(how= How.XPATH , using = "/html/body//section//ul/li[2]")
    public WebElement lstSortByFlightCreatedDescendingBackground;

    @FindBy(how= How.XPATH , using = "/html/body//section//ul/li[3]/span")
    public WebElement lstSortByFlightUpdatedDescending;

    @FindBy(how= How.XPATH , using = "/html/body//section//ul/li[3]")
    public WebElement lstSortByFlightUpdatedDescendingBackground;

    @FindBy(how= How.XPATH , using = "//*[@id='root']//h4")
    public WebElement txtFlightsCount;

    public boolean CheckCampaignsPageLoad()   {
        return tabCampaigns.isDisplayed();
    }

    public boolean CheckForNavigateToHome() {
        return tabHome.isDisplayed();
    }

    public int GetFlightRowsCount()   {
       By FlightRow = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div");
       List<WebElement> elementTypes = browserFactory.getDriver().findElements(FlightRow);
       System.out.println("Flight Count : " + elementTypes.size() );
       return elementTypes.size();
    }

    public boolean CheckFLIGHTSExist()  {
        return txtFlightsCount.isDisplayed();
    }

    public boolean CheckLogOutExist() {
        mouseClick(btnExpand );
        boolean boolLogOut = btnLogOut.isDisplayed();
        mouseClick(btnExpand );
        return boolLogOut;
    }

    public void Logout() {
        mouseClick(btnExpand);
        GeneralUtilites.wait(0.5);
        mouseClick(btnLogOut );
    }

    public boolean CheckSearchByFlightNameOrBookingCodeExist() {
        try
        {
             enterText(txtSearch,"FINANCE");
             enterText(txtSearch,"IO-6466");
             return txtSearch.isDisplayed();
        }
        catch(Exception ex)
        {
            System.out.println("Exception : " + ex.getMessage());
            return false;
        }
    }

    public void EnterSearchFilter(String Search, String Advertiser, String Agency) {
        if (!Search.equals(""))
            enterText(txtSearch,Search);
        if (!Advertiser.equals(""))
            enterText(txtAdvertiser,Advertiser);
        if (!Agency.equals(""))
            enterText(txtAgency,Agency);
    }

    public boolean CheckFilterExist() {
        return txtAdvertiser.isDisplayed() && txtAgency.isDisplayed();
    }

    public void SelectRequiredAction() {
       if(!chbxRequiresAction.getAttribute("class").equals("theme_check_2B20W theme_checked_2NQ9n")) {
           Actions action = new Actions(browserFactory.getDriver());
           action.moveToElement(chbxRequiresAction).build().perform();
           action.click(chbxRequiresAction).perform();
           GeneralUtilites.wait(1);
       }
    }

    public void SelectSortBy(String sortType)  {
        GeneralUtilites.wait(1);
        Actions action = new Actions(browserFactory.getDriver());
        action.moveToElement(btnSort).build().perform();
        action.click(btnSort).perform();
        if(sortType.equals("SortByFlightCreatedDescending")) {
            action.moveToElement(lstSortByFlightCreatedDescending).build().perform();
            action.click(lstSortByFlightCreatedDescending).perform();
        }
        else if(sortType.equals("SortByFlightUpdatedDescending")) {
            action.moveToElement(lstSortByFlightUpdatedDescending).build().perform();
            action.click(lstSortByFlightUpdatedDescending).perform();
        }
        else
        {
            action.moveToElement(lstSortByStartDateDescending).build().perform();
            action.click(lstSortByStartDateDescending).perform();
        }
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
         boolean returnValue =   btnSort.isDisplayed();
         Actions action = new Actions(browserFactory.getDriver());
         action.moveToElement(btnSort).build().perform();
         action.click(btnSort).perform();
         GeneralUtilites.wait(1);
         returnValue = returnValue &&   lstSortByFlightCreatedDescending.isDisplayed();
         returnValue = returnValue &&   lstSortByFlightUpdatedDescending.isDisplayed();
         action.moveToElement(lstSortByStartDateDescending).build().perform();
         action.click(lstSortByStartDateDescending).perform();
        return returnValue;
    }

    public boolean IsSelected(String sortType) {
        GeneralUtilites.wait(3);
        if(sortType.equals("SortByFlightCreatedDescending"))
        {
            if(lstSortByFlightCreatedDescendingBackground.getAttribute("class").contains("activeMenuItem"))
                return true;
            else
                return false;

        }
        else if(sortType.equals("SortByFlightUpdatedDescending")) {
            GeneralUtilites.wait(3);
            if(lstSortByFlightUpdatedDescendingBackground.getAttribute("class").contains("activeMenuItem"))
                return true;
            else
                return false;
        }
        else
        {
            if(lstSortByStartDateDescendingBackground.getAttribute("class").contains("activeMenuItem"))
                return true;
            else
                return false;
        }
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
                List<WebElement> elementFlightDetails = objFlightRow.findElements(By.xpath(".//span"));
                if (elementFlightDetails.size() <= 0)
                    return false;
                else {
                    returnType = returnType && elementFlightDetails.get(0).getText().contains("Advertiser:");
                    returnType = returnType && (elementFlightDetails.get(1).getText().contains("Agency:") ||
                            elementFlightDetails.get(1).getText().equals(""));
                    returnType = returnType && elementFlightDetails.get(2).getText().contains("Flight:");
                    returnType = returnType && elementFlightDetails.get(3).getText().contains("Booking Code:");
                }
            }
            return returnType;
        }
    }

    public boolean CheckFlightGoalDetailsShown() {
            By FlightRows = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div");
            List<WebElement> elementTypes = browserFactory.getDriver().findElements(FlightRows);
            System.out.println("Flight Count : " + elementTypes.size() );
            boolean returnType = true;
            if(elementTypes.size() <=0)
                return false;
            else
            {
                for (WebElement objFlightRow :elementTypes)
                {
                    List<WebElement> elementFlightDetails = objFlightRow.findElements(By.xpath("./div[2]/div"));
                    if(elementFlightDetails.size() <=0)
                        return false;
                    else
                    {
                        returnType = returnType && !elementFlightDetails.get(0).getText().equals("");
                        returnType = returnType && !elementFlightDetails.get(1).getText().equals("") ;
                        returnType = returnType && elementFlightDetails.get(2).getText().contains("BUDGET VS SPEND");
                        returnType = returnType && elementFlightDetails.get(3).getText().contains("Start:");
                    }
                }
                return returnType;
            }

           //*[@id="root"]/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/i

    }

    public boolean CheckGoalDetailsEditable() {
        By editableButtons = By.xpath(" //*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/i");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(editableButtons);
        System.out.println("Flight Count : " + elementTypes.size() );
        if(elementTypes.size() >=2)
            return  true;
        else
            return  false;

        }

    public boolean CheckForProgressBar()  {
        By ProgressBar = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[4]/div/div[2]/div/div");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(ProgressBar);
        System.out.println("Flight Count : " + elementTypes.size() );
        if(elementTypes.size() >=1)
            return  true;
        else
            return  false;
    }


    public boolean CheckForStartDate()  {
        By StartDate = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[4]/div/div[1]/div[1]");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(StartDate);
        System.out.println("Flight Count : " + elementTypes.size() );
        if(elementTypes.size() >=1)
            return  true;
        else
            return  false;
    }


    public boolean CheckForEndDate()  {
        By EndDate = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[4]/div/div[1]/div[3]");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(EndDate);
        System.out.println("Flight Count : " + elementTypes.size());
        if(elementTypes.size() >=1)
            return  true;
        else
            return  false;
    }


    public boolean  CheckForInfiniteBudgetIcon()
    {
        By EndDate = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div[4]/div/div[1]/div[3]/div/span ");
        List<WebElement> elementTypes = browserFactory.getDriver().findElements(EndDate);
        System.out.println("Flight Count : " + elementTypes.size());
        boolean returnType;
        if(elementTypes.size() >=1) {
            returnType = true;
            returnType = returnType && elementTypes.get(0).getAttribute("class").contains("infiniteBudgetIcon");
            Actions toolAct = new Actions(browserFactory.getDriver());
            toolAct.clickAndHold(elementTypes.get(0)).build().perform();
            //returnType = returnType && elementTypes.get(0).getAttribute("title").equals("Indefinite");
            return   returnType;
        }
        else
            return  false;
    }
}
