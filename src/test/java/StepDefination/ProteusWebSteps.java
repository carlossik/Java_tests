package StepDefination;

import DataModels.ReportingAPIResponse;
import PageObjects.*;
import SupportingUtilites.BrowserFactory;
import java.util.Properties;
import java.io.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.Assert;
import SupportingUtilites.*;
import java.util.*;

public class ProteusWebSteps extends BrowserFactory
{
    private BrowserFactory browserFactory;
    private ProteusWebLoginPage loginPage;
    private ProteusWebHomePage  homePage;
    private ProteusWebCampaignsPage campaignsPage;
    private ProteusWebAdminPage adminPage;
    private ProteusWebReportsPage reportsPage;
    private ProteusWebClientReportsPage clientReportsPage;
    private ProteusWebAdvertiserAccountsPage adverAcctPage;
    private ProteusWebPlatformSeat platformSeatPage;
    private ProteusWebCreativesPage creativesPage;
    private ReportingAPIResponse objResponse;
    private Properties prop = new Properties();
    private InputStream input = null;
    private static String currentPath = System.getProperty("user.dir");

    public ProteusWebSteps(){}

    public ProteusWebSteps(BrowserFactory browserFactory) {
       this.browserFactory = browserFactory;
       try
       {
           InputStream input = new FileInputStream(currentPath + "/src/test/java/Resources/config.properties");
           prop.load(input);
       }
       catch(Exception e)
       {
           e.printStackTrace();
           System.exit(0);
       }
       loginPage = new ProteusWebLoginPage(this.browserFactory);
       campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
    }


    @Given("I am a Proteus User")
    public void GivenIAmAProteusUser()    {
        System.out.println("I am a Proteus User step");
    }


    @Given("I have the role: Pro Web Campaigns")
    public void GivenIHaveTheRoleProWebCampaigns()    {
        System.out.println("I have the role: Pro Web Campaigns");
    }

    @Given("I have the role: Pro Web Advertiser_Manager_Editor")
    public void GivenIHaveTheRoleProWebAdvertiserManagerEditor()    {
        System.out.println("I have the role: Pro Web Advertiser_Manager_Editor");
    }

    @Given("I go to the Proteus Home URL in my browser")
    public void GivenIGoToTheProteusHomeURLInMyBrowser()    {
        SupportingUtilites.BrowserFactory.initBrowser(prop.getProperty("Browser"));
        SupportingUtilites.BrowserFactory.loadApplication(prop.getProperty("ProteusWebURL").replace("{Environment}",prop.getProperty("Environment")));
        System.out.println("I go to the Proteus Home URL in my browser");
    }

    @When("^Login as \"([^\"]*)\"$")
    public void loginAs(String strRole)    {
        String strUserName;
        String strPassword;
        switch (strRole)
        {
            case "ADMINISTRATOR" :
                strUserName = prop.getProperty("AdminUserName");
                strPassword = prop.getProperty("AdminPassword");
                break;
            case "CAMPAIGN MANAGEMENT WEB" :
                strUserName = prop.getProperty("CampaignWebUserName");
                strPassword = prop.getProperty("CampaignWebPassword");
                break;
            case "INVALID" :
                strUserName = prop.getProperty("InvalidUserName");
                strPassword = prop.getProperty("InvalidPassword");
                break;
            case "ADVERTISERMANAGEREDITOR":
                strUserName = prop.getProperty("AdvertiserMangerUserName");
                strPassword = prop.getProperty("AdvertiserMangerPassword");
                break;
            case "VENDORMANAGERROLE":
                strUserName = prop.getProperty("VendorMangerUserName");
                strPassword = prop.getProperty("VendorMangerPassword");
                break;
            case "DASHBOARDROLE":
                strUserName = prop.getProperty("DashboardRoleUserName");
                strPassword = prop.getProperty("DashboardRolePassword");
                break;

            default:
                strUserName = prop.getProperty("AdminUserName");
                strPassword = prop.getProperty("AdminPassword");
        }

        loginPage = new ProteusWebLoginPage(this.browserFactory);
        loginPage.loginToApplication(strUserName, strPassword);
        GeneralUtilites.wait(1);
        System.out.println(" I go to the Proteus Home URL in my browser");
    }

    @Then("An error message displayed advising to try again")
    public void ThenAnErrorMessageDisplayedAdvisingToTryAgain()    {
        loginPage = new ProteusWebLoginPage(this.browserFactory);
        org.testng.Assert.assertTrue(loginPage.CheckInvalidUsernamePassword(),"Error message not displayed for incorrect username/password");
        Assert.assertTrue("Error message not displayed for incorrect username/password",loginPage.CheckInvalidUsernamePassword());
        System.out.println(" An error message displayed advising to try again");
    }


    @Then("The main homepage loads successfully")
    public void ThenTheMainHomepageLoadsSuccessfully()    {
        homePage = new ProteusWebHomePage(this.browserFactory);
        Assert.assertTrue("The main homepage not shown", homePage.CheckHomePage());
    }

    @Then("The Campaigns page loads successfully")
    public void ThenTheCampaignsPageLoadsSuccessfully()    {
      campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
      Assert.assertTrue("The Campaigns page not loaded",campaignsPage.CheckCampaignsPageLoad());

    }

    @Then("Log out, Back to Home, Flights icon shown on Campaign page")
    public void ThenLogOutBackToHomeFlightsIconShownOnCampaignPage()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Logout option not shown on Campaign page",campaignsPage.CheckLogOutExist());
        Assert.assertTrue("Flights icon not shown on Campaign page",campaignsPage.CheckFLIGHTSExist() );
       // Assert.assertTrue( "Back to Home not shown on Campaign page",campaignsPage.CheckForNavigateToHome());
    }

    @Then("All Flights loads which I have access to")
    public void ThenAllFlightsLoadsWhichIHaveAccessTo()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);

        Assert.assertTrue("All Flights not loads which I have access to",campaignsPage.GetFlightRowsCount()> 0);
    }

    @Then("All Flights matching search/filter combination load as results")
    public void ThenAllFlightsMatchingSearchFilterCombinationLoadAsResults()    {
     /*   int intFlightCount = RestAssuredClient.GetFlightCount("/campaign-flight/search?order-by=START_DATE_DESC&page-number=0&page-size=20",
                 "FINANCE",
                 "2039",
                 "2793");*/
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        System.out.println("\nAll Flights matching search/filter combination load as results");
        // Need to implement this
        Assert.assertTrue( "All Flights matching search/filter combination are not loaded as results",campaignsPage.GetFlightRowsCount()>0 );
    }

    @When("I search/filter for a particular result")
    public void WhenISearchFilterForAParticularResult()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.EnterSearchFilter("Automation 84", "", "");
        GeneralUtilites.wait(2);
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div/div[1]/label/input[@value='ENDED']"));
    }

    @When("^I search/filter for a particular result \"([^\"]*)\"$")
    public void iSearchFilterForAParticularResult(String strSearchKey) throws Throwable {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.EnterSearchFilter(strSearchKey, "", "");
        GeneralUtilites.wait(2);
    }

    @Then("Apply button is enabled")
    public void ThenApplyButtonIsEnabled()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue( "Apply button is not enabled after enter search",campaignsPage.btnApplyFilters.isEnabled());
    }

    @When("Click on Apply button")
    public void WhenClickOnApplyButton()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        //  Assert.assertTrue(Page.ProteusWebCampaigns.btnApplyFilters.Enabled, "Apply button is not enabled after enter search");
        GeneralUtilites.wait(1);
        mouseClick(campaignsPage.btnApplyFilters );
        GeneralUtilites.wait(1);
    }

    @Then("Clear Filters button is enabled")
    public void ThenClearFiltersButtonIsEnabled()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Clear Filters button is not enabled after enter search",campaignsPage.btnClearFilters.isEnabled() );
    }

    @Then("I can search by Flight Name or Booking Code")
    public void ThenICanSearchByFlightNameOrBookingCode()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("I can't search by Flight Name or Booking Code",campaignsPage.CheckSearchByFlightNameOrBookingCodeExist() );
    }

    @Then("Filter dropdown fields exist")
    public void ThenFilterDropdownFieldsExist()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue( "Filter dropdown fields does not exist",campaignsPage.CheckFilterExist());
    }

    @Then("There is a box called Campaigns")
    public void ThenThereIsABoxCalledCampaigns()    {
        homePage = new ProteusWebHomePage(this.browserFactory);
        Assert.assertTrue( "There is a box called Campaigns does not exist",homePage.CheckCampaignTabExist());
    }

    @Then("Log Out button exist")
    public void ThenLogOutButtonExist()    {
        homePage = new ProteusWebHomePage(this.browserFactory);
        Assert.assertTrue("Log Out button does not exist",homePage.CheckLogOutExist() );
    }

    @Then("LogOut ProteusWeb from Home Page")
    public void ThenLogoutProteusWeb()    {
        homePage = new ProteusWebHomePage(this.browserFactory);
        homePage.Logout();
    }

    @Then("LogOut ProteusWeb from Campaigns page")
    public void ThenLogOutProteusWebFromCampaignsPage()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.Logout();
    }

    @When("^API Search for Flights$")
    public void apiSearchForFlights()    {
        int intFlightCount = RestAssuredClient.GetFlightCount("/campaign-flight/search?order-by=START_DATE_DESC&page-number=0&page-size=20",
                "FINANCE",
                "2039",
                "2793");
        System.out.println("intFlightCount : " + intFlightCount);
        Assert.assertTrue("API Search for Flights",intFlightCount > 0);
    }

    @Then("^There is a box called \"([^\"]*)\"$")
    public void thereIsABoxCalled(String tabName)    {
        homePage = new ProteusWebHomePage(this.browserFactory);
        if(tabName.equals("Campaigns"))
            Assert.assertTrue( "There is a box called Campaigns does not exist",homePage.CheckCampaignTabExist());
        if(tabName.equals("Reports"))
            Assert.assertTrue( "There is a box called Client Reports does not exist",homePage.CheckReportsTabExist());
        if(tabName.equals("Vendors"))
            Assert.assertTrue( "There is a box called Vendors does not exist",homePage.CheckVendorsTabExist());
        if(tabName.equals("Organisations"))
            Assert.assertTrue( "There is a box called Organisations does not exist",homePage.CheckOrganisationsTabExist());
        if(tabName.equals("Users"))
            Assert.assertTrue( "There is a box called Users does not exist",homePage.CheckUsersTabExist());
        if(tabName.equals("Home"))
            Assert.assertTrue( "There is a box called Users does not exist",homePage.CheckHomeTabExist());
    }

    @And("^All other tabs apart from \"([^\"]*)\" are hidden$")
    public void allOtherTabsApartFromAreHidden(String tabNames) throws Throwable {
      Assert.assertEquals("All other tabs apart from " + tabNames + "are hidden",
              getElementCount("//*[@id='root']/div/header/div/div[2]/div/div/div/nav/label")
              ,tabNames.split(";").length);
        for (String tabName:tabNames.split(";")) {
            Assert.assertEquals("All other tabs apart from " + tabNames + "are hidden",
                    getElementCount("//*[@id='root']/div/header/div/div[2]/div/div/div/nav/label[contains(text(),'"+tabName+"')]")
                    ,1);

        }
    }

    @When("^I click on \"([^\"]*)\" from home page$")
    public void iClickOnFromHomePage(String tabName)    {
        homePage = new ProteusWebHomePage(this.browserFactory);
        if(tabName.equals("Campaigns"))
            homePage.NavigateProteusCampaign();
        if(tabName.equals("Home"))
            homePage.NavigateProteusHome();
        if(tabName.equals("Reports"))
            homePage.NavigateProteusReports();
        if(tabName.equals("Organisations"))
            homePage.NavigateProteusOrganisations();
        if(tabName.equals("Users"))
            homePage.NavigateProteusUsers();
        if(tabName.equals("Vendors"))
            homePage.NavigateProteusVendors();
        if(tabName.equals("Client Reports"))
            homePage.NavigateProteusClientReports();
        GeneralUtilites.wait(1);
    }

    @Then("^Administration page shown correctly$")
    public void administrationPageShownCorrectly()    {
        adminPage = new ProteusWebAdminPage(this.browserFactory);
        Assert.assertTrue("Administration page not shown correctly",
                adminPage.btnSeats.isDisplayed() &&
                        adminPage.btnJobs.isDisplayed() &&
                        adminPage.btnMasterData.isDisplayed());
    }

    @Then("^Organisations page shown correctly$")
    public void organisationsPageShownCorrectly()    {
        Assert.assertTrue("Organisations page not shown correctly",
              getElementCount("//*[@id='root']/div/section/div/div[1]/aside//button") > 0 );
    }

    @And("^LogOut ProteusWeb from Admin Page$")
    public void logoutProteusWebFromAdminPage()    {
        adminPage = new ProteusWebAdminPage(this.browserFactory);
        adminPage.Logout();
    }

    @And("^Able to filter seats by Operation Unit TEL$")
    public void ableToFilterSeatsByOperationUnitTEL()    {
        adminPage = new ProteusWebAdminPage(this.browserFactory);
        adminPage.NavigateAdministrationSeats();
        Assert.assertTrue("Unable to filter seats by Operation Unit TEL",
                adminPage.FilterOperationalUnit());
    }

    @And("^Able to navigate to Administration Jobs$")
    public void ableToNavigateToAdministrationJobs()    {
        adminPage = new ProteusWebAdminPage(this.browserFactory);
        adminPage.NavigateAdministrationJobs();
        GeneralUtilites.wait(1);
        if(getElement("/html/body/div/div/div[2]/section/div[2]/div/div[2]/button").isDisplayed()) {
            mouseClick(getElement("/html/body/div/div/div[2]/section/div[2]/div/div[1]/div/div/div/input"));
            mouseClick(getElement("/html/body/div/div/div[2]/section/div[2]/div/div[1]/div/div/ul/li[1]"));
            mouseClick(getElement("/html/body/div/div/div[2]/section/div[2]/div/div[2]/button"));
        }
        GeneralUtilites.wait(1);
        Assert.assertTrue("Unable to navigate to Administration Jobs",
                adminPage.btnJobsRefresh.isDisplayed());
    }

    @And("^Able to navigate to Administration Master Data$")
    public void ableToNavigateToAdministrationMasterData()    {
        adminPage = new ProteusWebAdminPage(this.browserFactory);
        GeneralUtilites.wait(2);
        adminPage.NavigateAdministrationMasterData();
        GeneralUtilites.wait(2);
        Assert.assertTrue("Unable to navigate to Administration Master Data",
                adminPage.btnMasterDataAddPubLocation.isDisplayed() &&
                        adminPage.btnMasterDataAddJobScdTemplates.isDisplayed());
    }

    @And("^Able to navigate to Advertiser Accounts$")
    public void ableToNavigateToAdministrationAdvertiserAccounts()   {
        adminPage = new ProteusWebAdminPage(this.browserFactory);
        GeneralUtilites.wait(2);
        adminPage.NavigateAdministrationAdvertiserAccounts();
        GeneralUtilites.wait(2);
        adverAcctPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        Assert.assertTrue("Unable to navigate to Administration Advertiser Accounts",
                adverAcctPage.lblAdvertiserAccounts.isDisplayed() &&
                        adverAcctPage.txtSearch.isDisplayed());
    }

    @Then("^Reports page shown correctly$")
    public void reportsPageShownCorrectly()    {
        reportsPage = new ProteusWebReportsPage(this.browserFactory);
        GeneralUtilites.wait(1);
        Assert.assertTrue("Reports page not shown correctly",
                reportsPage.btnClient.isDisplayed() &&
                        reportsPage.btnPlatform.isDisplayed());
    }

    @And("^LogOut ProteusWeb from Reports Page$")
    public void logoutProteusWebFromReportsPage()    {
        reportsPage = new ProteusWebReportsPage(this.browserFactory);
        reportsPage.Logout();
    }

    @And("^LogOut ProteusWeb from Client Reports Page$")
    public void logoutProteusWebFromClientReportsPage()    {
        clientReportsPage = new ProteusWebClientReportsPage(this.browserFactory);
        clientReportsPage.Logout();
    }

    @Then("^Client Reports page shown correctly$")
    public void clientReportsPageShownCorrectly()    {
        clientReportsPage = new ProteusWebClientReportsPage(this.browserFactory);
        GeneralUtilites.wait(1);
        //if(clientReportsPage.txtAdvertiser.isDisplayed())
          //  clientReportsPage.SelectAdvertiser();
        Assert.assertTrue("Client Reports page not shown correctly",
                clientReportsPage.btnDashBoard.isDisplayed() &&
                        clientReportsPage.btnPerformance.isDisplayed() &&
                        clientReportsPage.btnDSP.isDisplayed() &&
                        clientReportsPage.btnTactics.isDisplayed() );
    }

    @And("^Able to navigate to Client Reports Dashboard$")
    public void ableToNavigateToClientReportsDashboard()    {
        clientReportsPage = new ProteusWebClientReportsPage(this.browserFactory);
        clientReportsPage.NavigateClientReportDashborad();
        Assert.assertTrue("Unable to navigate to Client Reports Dashboard",
                clientReportsPage.txtRecentFligts.isDisplayed()  );
    }

    @And("^Able to navigate to Client Reports Performance$")
    public void ableToNavigateToClientReportsPerformance()    {
        clientReportsPage = new ProteusWebClientReportsPage(this.browserFactory);
        clientReportsPage.NavigateClientReportPerformance();
        Assert.assertTrue("Unable to navigate to Client Reports Performace",
                clientReportsPage.txtPerformanceOverview.isDisplayed());
    }

    @And("^Able to navigate to Client Reports DSP$")
    public void ableToNavigateToClientReportsDSP()    {
        clientReportsPage = new ProteusWebClientReportsPage(this.browserFactory);
        clientReportsPage.NavigateClientReportDSP();
        Assert.assertTrue("Unable to navigate to Client Reports DSP",
                clientReportsPage.txtDSPOverview.isDisplayed());
    }

    @And("^Able to navigate to Client Reports Tactics$")
    public void ableToNavigateToClientReportsTactics()    {
        clientReportsPage = new ProteusWebClientReportsPage(this.browserFactory);
        clientReportsPage.NavigateClientReportTactics();
        Assert.assertTrue("Unable to navigate to Client Reports Tactics",
                clientReportsPage.txtTacticsOverview.isDisplayed());
    }

    @Then("^There is an option to filter by 'Requires action'$")
    public void thereIsAnOptionToFilterByRequiresAction()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        GeneralUtilites.wait(1);
        Assert.assertTrue("Option to filter by 'Requires action' does not exist",
                campaignsPage.chbxRequiresAction.isDisplayed());
    }

    @And("^Default 'Requires action' is unselected$")
    public void defaultRequiresActionIsUnselected()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertNotEquals("Default 'Requires action' is selected",
                campaignsPage.chbxRequiresAction.getAttribute("class"),"theme_check_2B20W theme_checked_2NQ9n");

        campaignsPage.SelectRequiredAction();
        GeneralUtilites.wait(1);

    }

    @When("^Click on 'Requires action'$")
    public void clickOnRequiresAction()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.SelectRequiredAction();
        GeneralUtilites.wait(1);
    }

    @Then("^'Requires action' is selected$")
    public void requiresActionIsSelected()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertEquals(" 'Requires action' is not selected after clicking on it ",
                campaignsPage.chbxRequiresAction.getAttribute("class"),"theme_check_2B20W theme_checked_2NQ9n");
    }

    @Then("^Option to sort result by Flight Created and Updated$")
    public void optionToSortResultByFlightCreatedAndUpdated()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Option to sort result by Flight Created and Updated does not exist",
            campaignsPage.checkForSortOptions() );
    }

    @When("^Select sort by Flight created$")
    public void selectSortByFlightCreated()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.SelectSortBy("SortByFlightCreatedDescending");
    }

    @When("^Select sort by Flight Updated$")
    public void selectSortByFlightUpdated()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.SelectSortBy("SortByFlightUpdatedDescending");
    }


    @Then("^Sort by Flight created selected$")
    public void sortByFlightCreatedSelected()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        GeneralUtilites.wait(2);
        campaignsPage.ClickOnSortBy();
        GeneralUtilites.wait(2);
        Assert.assertTrue("Sort by Flight created not selected",
                campaignsPage.IsSelected("SortByFlightCreatedDescending"));
        GeneralUtilites.wait(2);
        campaignsPage.UnClickOnSortBy();
    }


    @Then("^Sort by Flight updated selected$")
    public void sortByFlightUpdatedSelected()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        GeneralUtilites.wait(1);
        campaignsPage.ClickOnSortBy();
        GeneralUtilites.wait(1);
        Assert.assertTrue("Sort by Flight updated not selected",
                  campaignsPage.IsSelected("SortByFlightUpdatedDescending"));
        campaignsPage.UnClickOnSortBy();
    }

    @And("^There is a section called 'Flights'$")
    public void thereIsASectionCalledFlights()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("There is a section called 'Flights' not shown",
                campaignsPage.txtFlightsCount.isDisplayed());
    }

    @And("^Each flight title includes Advertiser, Agency, Flight Names and External Booking Reference$")
    public void CheckFlightDetailsShown()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Each flight title does not includes Advertiser, Agency, Flight Names and External Booking Reference",
                campaignsPage.CheckFlightDetailsShown());
    }

    @And("^Budget, Spend information and Flight Dates$")
    public void goalTypeGoalValueOptimisationManagerBudgetSpendInformationAndFlightDates()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Goal Type, Goal Value, Optimisation Manager, Budget, Spend information and Flight Dates not shown",
                campaignsPage.CheckFlightGoalDetailsShown());
    }

    @And("^The Currency code for the Flight is displayed next to the Budget$")
    public void theCurrencyCodeForTheFlightIsDisplayedNextToTheBudget()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("The Currency code for the Flight is not displayed next to the Budget",
                campaignsPage.CheckFlightBudgetCurrencyCodeShown());
    }

    @And("^Goal Type, Goal Value, Optimisation Manager are editable$")
    public void goalTypeGoalValueOptimisationManagerAreEditable()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Goal Type, Goal Value, Optimisation Manager, Budget, Spend information and Flight Dates not shown",
                campaignsPage.CheckGoalDetailsEditable());

    }

    @And("^A progress bar shown$")
    public void aProgressBarShown()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("A progress bar not shown",
                campaignsPage.CheckForProgressBar());
    }

    @When("^I search/filter for result with end date$")
    public void iSearchResultWithEndDate()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.EnterSearchFilter("FINANCE", "FINANCE - INSURE", "Agency > Business & Industrial 1742");
        GeneralUtilites.wait(2);
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div/div[1]/label/input[@value='ENDED']"));
    }

    @When("^I search/filter for result without end date$")
    public void iSearchResultWithOutEndDate()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.EnterSearchFilter("Collection_io", "", "");
    }


    @Then("^Box shown with Start Date and End Date$")
    public void boxShownWithStartDateAndEndDate()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Box not shown with Start Date and End Date",
                campaignsPage.CheckForStartDate() && campaignsPage.CheckForEndDate() );
    }

    @Then("^Box shown with Start Date$")
    public void boxShownWithStartDate() {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Box not shown with Start Date",
                campaignsPage.CheckForStartDate());
    }

    @Then("^End date shown as an icon and Tooltip shown$")
    public void endDateShownAsAnIcon()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Box not shown with Start Date",
                campaignsPage.CheckForInfiniteBudgetIcon());
    }

    @And("^All flights sorted based on created date$")
    public void allFlightsSortedBasedOnCreatedDate()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        String strQuery = prop.getProperty("SQLQuerySortByCreatedTime").replace("{SearchKey}","Automation 84");
        Assert.assertTrue("All flights are not sorted based on created date",
                campaignsPage.RecordsSortedBy(strQuery));
    }

    @And("^All flights sorted based on updated date$")
    public void allFlightsSortedBasedOnUpdatedDate()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        String strQuery = prop.getProperty("SQLQuerySortByUpdatedTime").replace("{SearchKey}","Automation 84");
        Assert.assertTrue("All flights are not sorted based on updated date",
                campaignsPage.RecordsSortedBy(strQuery));
    }

    @Then("^Sort by \"([^\"]*)\" is shown$")
    public void sortByIsShown(String strSortBy)  {
        GeneralUtilites.wait(1);
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertEquals("^Sort by " + strSortBy + " is not shown$",
                campaignsPage.getSortByLabel().trim().toLowerCase(),strSortBy.trim().toLowerCase());
    }


    @And("^There is a reporting chart icon to the right hand side of the Flight$")
    public void thereIsAReportingChartIconToTheRightHandSideOfTheFlight() {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("There is a reporting chart icon not shown to the right hand side of the Flight",
                campaignsPage.getReportButtonCount() > 0);
    }

    @Then("^Tooltip 'Click to go to reports' shown on mouseover$")
    public void tooltipClickToGoToReportsShownOnMouseover()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Tooltip 'Click to go to reports' not shown on mouseover",
                campaignsPage.ReportToolTipShown("Flight Level"));
    }

    @And("^There are two links in the pop up for the following core reports:$")
    public void thereAreTwoLinksInThePopUpForTheFollowingCoreReports() {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Two links core reports does not exist in the pop up",
                campaignsPage.ReportingOptions());
    }

    @When("^Click on \"([^\"]*)\" Tableau report$")
    public void clickOnTableauReport(String strReportType)  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
                campaignsPage.SelectTableauReporting(strReportType);
    }

    @Then("^Tableau report opened for \"([^\"]*)\"$")
    public void tableauReportOpenedFor(String strReportName)  {
        List<String> browserTabs = new ArrayList<> (this.browserFactory.getDriver().getWindowHandles());
      //  System.out.println("browserTabs.size()  : " + browserTabs.size() );
        Assert.assertTrue("Tableau report not opened for " + strReportName,
                browserTabs.size() >= 2 );
        this.browserFactory.getDriver().switchTo().window(browserTabs .get(1));
        Assert.assertTrue("Tableau report not opened for " + strReportName,
                this.browserFactory.getDriver().getCurrentUrl().contains(strReportName) );
    //    System.out.println(this.browserFactory.getDriver().getCurrentUrl());
        this.browserFactory.getDriver().close();
        this.browserFactory.getDriver().switchTo().window(browserTabs.get(0));
    }

    @When("^I search/filter for a flight with No goal$")
    public void iSearchFilterForAFlightWithNoGoal()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.EnterSearchFilter(GeneralUtilites.getFlightNameDB("NoGoalDetails"), "", "");
        GeneralUtilites.wait(2);

    }

    @Then("^There is an Add icon in the box orange to inform the user action is required$")
    public void thereIsAnAddIconInTheBoxOrangeToInformTheUserActionIsRequired()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Add icon in the box orange to inform the user action is required does not exist",
                campaignsPage.AddGoalDetailsButtonExist());
    }

    @And("^The box states 'Goal Info and Target'$")
    public void theBoxStatesGoalInfoAndTarget()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("The box states 'Goal Info and Target' does not exist",
                campaignsPage.GoalInfoAndTargetExist());
    }

    @When("^Click on Add 'Goal Info and Target'$")
    public void clickOnAddGoalInfoAndTarget()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.ClickOnAddGoalDetails();
    }

    @When("^Click to edit Goal Type$")
    public void clickOnEditGoalInfoAndTarget()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.ClickOnAddGoalDetails();
    }

    @Then("^Option to select Goal Type and Goal Value exist$")
    public void optionToSelectGoalTypeAndGoalValueExist() {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Option to select Goal Type and Goal Value does not exist",
                campaignsPage.OptionsToAddGoalDetails());
    }

    @When("^Select Goal Type, Goal Value and Save$")
    public void selectGoalTypeGoalValueAndSave()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.SaveGoalDetails("CTR","10");
    }

    @When("^Edit Goal Type, Goal Value and Save$")
    public void editGoalTypeGoalValueAndSave()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.SaveGoalDetails("eCPA","12");
    }

    @Then("^Selected Goal Type and Goal Values saved$")
    public void selectedGoalTypeAndGoalValuesSaved()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.CheckGoalDetailsSaved("CTR","10");
    }

    @Then("^Edited Goal Type and Goal Values saved$")
    public void editedGoalTypeAndGoalValuesSaved()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.CheckGoalDetailsSaved("eCPA","12");
    }

    @Then("^There is an edit icon in the box$")
    public void thereIsAnEditIconInTheBox()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("An edit icon in the box does not exist",
                campaignsPage.EditGoalDetailsButtonExist());
    }

    @When("^I search/filter for a flight with no Optimisation Manager$")
    public void iSearchFilterForAFlightWithNoOptimisationManager()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.EnterSearchFilter(GeneralUtilites.getFlightNameDB("NoTrader"), "", "");
        GeneralUtilites.wait(2);
    }

    @Then("^The box states 'Unknown User'$")
    public void theBoxStatesUnknownUser()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("The box states 'Unknown User' does not exist",
                campaignsPage.CheckForUnknownUser());
    }

    @And("^Option to edit Optimisation Manager exist$")
    public void optionToEditOptimisationManagerExist() {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Option to edit Optimisation Manager not exist",
                campaignsPage.OptionsToAddGoalDetails());


    }

    @When("^Select one of Optimisation Manager and Save$")
    public void selectOneOfOptimisationManagerAndSave()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.SaveGoalDetails("CTR","10");
    }

    @Then("^Optimisation Manager saved$")
    public void optimisationManagerSaved()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Optimisation Manager not saved",
                campaignsPage.CheckOptimisationManagerDetailsSaved("Amelia Lee"));
    }

    @When("^Edit Optimisation Manager and Save$")
    public void editOptimisationManagerAndSave() {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.SaveOptimisationManagerDetails("Oliver Smith");
    }

    @Then("^Edited Optimisation Manager saved$")
    public void editedOptimisationManagerSaved()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Optimisation Manager not saved",
                campaignsPage.CheckOptimisationManagerDetailsSaved("Oliver Smith"));
    }

    @And("^There icons for platforms are displayed$")
    public void thereIconsForPlatformsAreDisplayed() {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Icons not shown for platforms are displayed",
                campaignsPage.CheckForPlatformIcons());
    }

    @And("^Tooltips shown on mouseover on each platform icon$")
    public void tooltipsShownOnMouseoverOnEachIcon()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Tooltips not shown on mouseover on each platform icon",
                campaignsPage.CheckForPlatformIconsTooltips());
    }

    @And("^Platforms tab opened for the Advertiser in the Platform on click$")
    public void platformsTabOpenedForTheAdvertiserInThePlatformOnClick() {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Platforms tab not opened for the advertiser in the platform",campaignsPage.CheckForAdvertiserPlatformTab());
    }



    @And("^I get numbers from reporting API for flight \"([^\"]*)\"$")
    public void iGetNumbersFromReportingAPIForFlight(int FlightId)  {
          objResponse =  RestAssuredClient.ReportingAPI(FlightId);
        System.out.println("Impressions : " + objResponse.FlightId.getImpressions());
        System.out.println("Clicks : " + objResponse.FlightId.getClicks());
    }

    @When("^I search/filter for a flight \"([^\"]*)\"$")
    public void iSearchFilterForAFlight(String FlightId)  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.EnterSearchFilter(GeneralUtilites.getFlightNameDB(FlightId), "", "");
        GeneralUtilites.wait(2);
    }

    @Then("^Numbers displayed match the reporting API for flight \"([^\"]*)\"$")
    public void numbersDisplayedMatchTheReportingAPIForFlight(String FlightId)  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
      String strNumbersUI =   campaignsPage.GetNumbersFromFlightDetails();

      Assert.assertEquals( "UI Impressions not matching , Reporting API numbers",
              strNumbersUI.split(";")[0].replace(",",""),objResponse.FlightId.getImpressions());

      Assert.assertEquals("UI Clicks not matching , Reporting API numbers",
                strNumbersUI.split(";")[1].replace(",",""),objResponse.FlightId.getClicks());
    }

    @When("^I search/filter for a flightName \"([^\"]*)\"$")
    public void iSearchFilterForAFlightName(String FlightName)   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.EnterSearchFilter(FlightName, "", "");
        GeneralUtilites.wait(2);
    }

    @Then("^Discrepancy Details displayed when flight is expanded$")
    public void discrepancyDetailsDisplayedWhenFlightIsExpanded()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Discrepancy Details not displayed when flight is expanded",
                campaignsPage.CheckForDiscrepancyDetails());
    }

    @Then("^Performance Details displayed when flight is expanded$")
    public void performanceDetailsDisplayedWhenFlightIsExpanded()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Performance Details not displayed when flight is expanded",
                campaignsPage.CheckForPerformanceDetails());
    }

    @Then("^Cost Breakdown Details displayed when flight is expanded$")
    public void costBreakdownDetailsDisplayedWhenFlightIsExpanded()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Cost Breakdown Details not displayed when flight is expanded",
                campaignsPage.CheckForCostBreakdownDetails());
    }



    @Then("^Primary Goal Details displayed when flight is expanded$")
    public void primaryGoalDetailsDisplayedWhenFlightIsExpanded()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Primary Goal Details not displayed when flight is expanded",
                campaignsPage.CheckForPrimaryGoalDetails());
    }

    @And("^Expand flight details$")
    public void expandFlightDetails()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.ExpandFlightDetails();
    }

    @Then("^Click on arrow flight details$")
    public void clickFlightDetails()    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.ExpandFlightDetails();
    }


    @Then("^Flight details collapsed$")
    public void flightDetailsCollasped(){
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Flight details not collapsed",
                campaignsPage.CheckForLightDetailsCollapsed());
    }

    @Then("^MRC Viewability Details displayed when flight is expanded$")
    public void viewabilityDetailsDisplayedWhenFlightIsExpanded() {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("MRC Viewability Details not displayed when flight is expanded",
                campaignsPage.CheckForMRCViewabilityDetails());

    }

    @Then("^DSP Delivery Details displayed when flight is expanded$")
    public void dspDataDetailsDisplayedWhenFlightIsExpanded()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("DSP Delivery Details not displayed when flight is expanded",
                campaignsPage.CheckForDSPDeliveryDetails());
    }

    @Then("^AdServer Delivery Details displayed when flight is expanded$")
    public void adserverDeliveryDetailsDisplayedWhenFlightIsExpanded()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Ad Server Data Details not displayed when flight is expanded",
                campaignsPage.CheckForAdServerDeliveryDetails());
    }

    @Then("^Discrepancy Details show tooltip$")
    public void discrepancyDetailsShowTooltip()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Discrepancy Details tooltip not shown",
                campaignsPage.CheckForDSPDeliveryDetailsToolTip());
    }

    @Then("^Performance Details show tooltip$")
    public void performanceDetailsShowTooltip()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Performance Details tooltip not shown",
                campaignsPage.CheckForPerformanceDetailsToolTip());
    }

    @And("^Actual Goal detials show tooltip$")
    public void actualGoalDetialsShowTooltip() {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Actual Goal detials tooltip not shown",
                campaignsPage.CheckForActualGoalDetailsToolTip());
    }

    @And("^Viewability detials show tooltip$")
    public void viewabilityDetialsShowTooltip()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Viewability detials tooltip not shown",
                campaignsPage.CheckForViewabilityDetailsToolTip());
    }

    @And("^DSP Delivery details show tooltip$")
    public void dspDeliveryDetialsShowTooltip()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("DSP Data detials tooltip not shown",
                campaignsPage.CheckForDSPDeliveryDetailsToolTip());
    }

    @And("^AdServer detials show tooltip$")
    public void adserverDetialsShowTooltip(){
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Ad Server detials tooltip not shown",
                campaignsPage.CheckForAdServerDetailsToolTip());
    }

    @Then("^There is a Operation Unit Level reporting chart icon to the right hand side of the Flight count$")
    public void thereIsAOperationUnitLevelReportingChartIconToTheRightHandSideOfTheFlight()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("There is a Operation Unit Level reporting chart icon not shown next to Flight count",
                campaignsPage.getOperationUnitReportButtonCount() > 0);
    }

    @Then("^Tooltip 'Click to go to reports at Operational Unit level' shown on mouseover at Operation Unit icon$")
    public void tooltipClickToGoToReportsOperationalUnitLevelShownOnMouseoverAtOperationUnitIcon()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Tooltip 'Click to go to reports at Operation Unit level' not shown on mouseover",
                campaignsPage.ReportToolTipShown("OperationUnit"));
    }

    @When("^Click on \"([^\"]*)\" Operation Unit Tableau report$")
    public void clickOnOperationUnitTableauReport(String strReportType)   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.SelectTableauOperationalUnitReporting(strReportType);
    }

    @And("^There are two links in the pop up for the following Operational Unit reports:$")
    public void thereAreTwoLinksInThePopUpForTheFollowingOperationalUnitReports()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Tooltip 'Click to go to reports' not shown on mouseover",
                campaignsPage.OperationalUnitReportingOptions());
    }

    @When("^I search/filter for a Campaign \"([^\"]*)\"$")
    public void iSearchFilterForACampaign(String CampaignName)   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.EnterSearchFilter(CampaignName, "", "");
        GeneralUtilites.wait(2);
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div/div[1]/label/input[@value='ENDED']"));
    }

    @Then("^Campaign details shown for each flight row$")
    public void campaignDetailsShownForEachFlightRow()  {
      campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
      Assert.assertTrue("Campaign details not shown for each flight row",
                campaignsPage.CheckForCampaignDetailsForFlight());
    }

    @And("^All Flights matching campaign \"([^\"]*)\" are filtered$")
    public void allFlightsMatchingCampaignAreFiltered(String CampaignName)  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("All flights matching Campaign are not listed",
                campaignsPage.CheckForCampaignNameForFlight(CampaignName));
    }

    @And("^Creatives option shown on the Campaigns tab$")
    public void creativesOptionShownOnTheCampaignsTab()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Creatives option not shown on the Campaigns tab", campaignsPage.CheckForCreativeTab());
    }
    @And("^Pixels option shown on the Campaigns tab$")
    public void pixelsOptionShownOnTheCampaignsTab()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Pixels option not shown on the Campaigns tab", campaignsPage.CheckForPixelsTab());
    }

    @And("^Creatives option not shown on the Campaigns tab$")
    public void creativesOptionNotShownOnTheCampaignsTab()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertFalse("Creatives option shown on the Campaigns tab", campaignsPage.CheckForCreativeTab());
    }


    @And("^Pixels option not shown on the Campaigns tab$")
    public void pixelsOptionNotShownOnTheCampaignsTab()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertFalse("Pixels option shown on the Campaigns tab", campaignsPage.CheckForPixelsTab());
    }

    @And("^There is an icons for Creatives$")
    public void thereIsAnIconsForCreatives()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Icons for Creatives not shown", campaignsPage.CheckForAdvertiserCreativeIcon());
    }

    @And("^Tooltips shown on mouseover on each Creatives icon$")
    public void tooltipsShownOnMouseoverOnEachCreativesIcon()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Tooltips not shown on mouseover on each Creatives icon", campaignsPage.CheckForAdvertiserCreativeToolTip());
    }

    @When("^I click on the creatives icon on flight row$")
    public void iClickOnTheCreativesIconOnFlightRow()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        mouseClick( campaignsPage.btnFlightCreatives);
    }

    @When("^I search/filter for \"([^\"]*)\" a particular result$")
    public void iSearchFilterForASearchKey(String searchKey)     {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.EnterSearchFilter(searchKey, "", "");
        GeneralUtilites.wait(2);
    }

    @When("^I click on \"([^\"]*)\" on Administration Tab$")
    public void iClickOnOnAdministrationTab(String strBtnName)  {
        adminPage = new ProteusWebAdminPage(this.browserFactory);
       adminPage.NavigateAdministrationSeats();
    }

    @Then("^Seats page shown correctly$")
    public void seatsPageShownCorrectly()  {
        adminPage = new ProteusWebAdminPage(this.browserFactory);
       Assert.assertTrue("Seats page not shown correctly",  adminPage.drpdwnOperationalUnit.isDisplayed());
    }

    @When("^Search and select seat \"([^\"]*)\"$")
    public void searchAndSelectSeat(String strSearchKey)   {
     typeText(adminPage.txtSearch,strSearchKey);
     GeneralUtilites.wait(2);
     if(getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div[1]/div/div//div[@aria-label='row']/div[2]") > 1)
        mouseClick(getElements("//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div[1]/div/div//div[@aria-label='row']/div[2]").get(1));
     else
         mouseClick(getElements("//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div[1]/div/div//div[@aria-label='row']/div[2]").get(0));
    }

    @Then("^Seat details page shown$")
    public void seatDetailsPageShown()   {
        platformSeatPage = new ProteusWebPlatformSeat(this.browserFactory);
        Assert.assertTrue("Seat details page not shown", platformSeatPage.btnManageCredentials.isDisplayed());
    }

    @When("^Click on MANAGE CREDENTIALS$")
    public void clickOnMANAGECREDENTIALS()   {
        platformSeatPage = new ProteusWebPlatformSeat(this.browserFactory);
        mouseClick(platformSeatPage.btnManageCredentials);
        GeneralUtilites.wait(1);
    }

    @Then("^Credentials page shown$")
    public void credentialsPageShown()   {
        platformSeatPage = new ProteusWebPlatformSeat(this.browserFactory);
        Assert.assertTrue("Credentials page not shown", platformSeatPage.lblCredentials.isDisplayed());
    }

    @When("^Select the credential \"([^\"]*)\"$")
    public void selectTheCredential(String strCredentials)   {
       mouseClick( getElement("//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div[1]/div[2]/ul/li//div[text()='"+strCredentials+"']"));
    }

    @Then("^Option to add Storage Location$")
    public void optionToAddStorageLocation() {
        platformSeatPage = new ProteusWebPlatformSeat(this.browserFactory);
         Assert.assertTrue("", platformSeatPage.btnAddStorgeLocation.isDisplayed());
    }

    @When("^I clicked on the Storage Locations Add button$")
    public void iClickedOnTheStorageLocationsButton()  {
        platformSeatPage = new ProteusWebPlatformSeat(this.browserFactory);
        mouseClick(platformSeatPage.btnAddStorgeLocation);
        GeneralUtilites.wait(1);
    }

    @Then("^Default Values selected on add storage location popup$")
    public void defaultValuesSelectedOnAddStorageLocationPopup()   {
        platformSeatPage = new ProteusWebPlatformSeat(this.browserFactory);
        Assert.assertTrue("", platformSeatPage.txtDataFormat.getText().toLowerCase().equals("DELIMITED".toLowerCase())
                                           && platformSeatPage.txtSchema.getText().toLowerCase().equals("DEFAULT".toLowerCase()));
    }

    @Then("^Mandatory options shown on the popup$")
    public void mandatoryOptionsShownOnThePopup()   {
        platformSeatPage = new ProteusWebPlatformSeat(this.browserFactory);
        Assert.assertTrue("",  platformSeatPage.txtDataType.isDisplayed()
                                            && platformSeatPage.txtBucketName.isDisplayed()
                                            && platformSeatPage.txtFileNamePattern.isDisplayed()
                                            && platformSeatPage.txtFolderNamePattern.isDisplayed()
                                            && platformSeatPage.txtReadyFileNamePattern.isDisplayed()
        );
    }

    @When("^Enter seat storage details and save$")
    public void enterSeatStorageDetailsAndSave()  {
        platformSeatPage = new ProteusWebPlatformSeat(this.browserFactory);
        mouseClick(platformSeatPage.txtDataType);
        typeText(platformSeatPage.txtDataType, "INSERTION_ORDER");
        GeneralUtilites.wait(1);
        mouseClick(getElement("/html/body/div/div/div[2]/section/div[2]/form/div[1]/div[1]/ul/li[1]"));
        mouseClick(platformSeatPage.txtDataFormat);
        mouseClick(getElement("/html/body/div/div/div[2]/section/div[2]/form/div[1]/div[2]/ul/li[1]"));
        mouseClick(platformSeatPage.txtSchema);
        mouseClick(getElement("/html/body/div/div/div[2]/section/div[2]/form/div[1]/div[3]/ul/li[1]"));
        typeText(platformSeatPage.txtBucketName, "gdbm-1501436");
        typeText(platformSeatPage.txtFileNamePattern, "{yyyyMMdd}.0.Campaign.json");
        typeText(platformSeatPage.txtFolderNamePattern, "entity");
        GeneralUtilites.wait(2);
        mouseClick(platformSeatPage.btnSave);
        GeneralUtilites.wait(1);
    }

    @Then("^New seat storage details saved$")
    public void newSeatStorageDetailsSaved()  {
       Assert.assertTrue("New seat storage details not saved",
      getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div[3]/form/div/div[2]/div[7]/div[2]/div[1]/div/div[2]/div/div/div[1]/span[text()='INSERTION_ORDER']")>0);
    }


    @Then("^Users page shown correctly$")
    public void usersPageShownCorrectly()   {
        Assert.assertTrue("Users page not shown correctly",
                getElementCount("//*[@id='root']/div/section/div/div[1]/aside//button")>0);
    }

    @Then("^Campaign Flights box shown on home page$")
    public void campaignFlightsBoxShownOnHomePage() throws Throwable {
        Assert.assertTrue("Campaign Flights box not shown on home page",
                getElementCount("//*[@id='root']/div/section/div/div[1]/div/div[2]/div[2]/div[1]/div") > 0);
    }

    @And("^Recently viewed flights are listed \"([^\"]*)\"$")
    public void recentlyViewedFlightsAreListed(String FlightName) throws Throwable {
        Assert.assertTrue("Recently viewed flights are not listed",
                getElementCount("//*[@id='root']/div/section/div/div[1]/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[contains(text(), '"+FlightName+"')]") >= 1);
    }

    @Then("^Advertiser Accounts box shown on home page$")
    public void advertiserAccountsBoxShownOnHomePage() throws Throwable {
        Assert.assertTrue("Advertiser Accounts box not shown on home page",
                getElementCount("//*[@id='root']/div/section/div/div[1]/div/div[2]/div[2]/div[2]") >= 1);
    }

    @And("^Recently viewed Advertiser Accounts are listed \"([^\"]*)\"$")
    public void recentlyViewedAdvertiserAccountsAreListed(String advertiserAccount) throws Throwable {
        Assert.assertTrue("Recently viewed flights are not listed",
                getElementCount("//*[@id='root']/div/section/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div[contains(text(), '"+advertiserAccount+"')]") >= 1);
    }

    @Then("^Ad Server Placements box shown on home page$")
    public void adServerPlacementsBoxShownOnHomePage() throws Throwable {
        Assert.assertTrue("Ad Server Placements box not shown on home page",
                getElementCount("//*[@id='root']/div/section/div/div[1]/div/div[2]/div[3]/div[1]/div[1]/div") >= 1);
    }

    @And("^Recently viewed Ad Server Placements are listed$")
    public void recentlyViewedAdServerPlacementsAreListed() throws Throwable {
        Assert.assertTrue("Recently viewed Ad Server Placements are not listed",
                getElementCount("//*[@id='root']/div/section/div/div[1]/div/div[2]/div[3]/div[1]/div[1]/div/div") >= 1);
    }

    @Then("^DSP Creatives box shown on home page$")
    public void dspCreativesBoxShownOnHomePage() throws Throwable {
        Assert.assertTrue("DSP Creatives box not shown on home page",
                getElementCount("//*[@id='root']/div/section/div/div[1]/div/div[2]/div[3]/div[2]/div") >= 1);
    }

    @And("^Recently viewed DSP Creatives are listed$")
    public void recentlyViewedDSPCreativesAreListed() throws Throwable {
        Assert.assertTrue("Recently viewed DSP Creatives are not listed",
                getElementCount("//*[@id='root']/div/section/div/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div/div") >= 1);
    }

    @Then("^Advertiser Accounts with missing hard pixel box shown on home page$")
    public void advertiserAccountsWithMissingHardPixelBoxShownOnHomePage() throws Throwable {
        Assert.assertTrue("Advertiser Accounts with missing hard pixel box not shown on home page",
                getElementCount("//*[@id='root']/div/section/div/div[1]/div/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[1]") >= 1);
    }

    @And("^Recently viewed Advertiser Accounts with missing hard pixel are listed$")
    public void recentlyViewedAdvertiserAccountsWithMissingHardPixelAreListed() throws Throwable {
        Assert.assertTrue("Recently viewed Advertiser Accounts with missing hard pixel are not listed",
                getElementCount("//*[@id='root']/div/section/div/div[1]/div/div[2]/div[3]/div[1]/div[2]/div/div[2]/div/div") >= 1);
    }

    @When("^Click on one of advertiser account$")
    public void clickOnOneOfAdvertiserAccount() throws Throwable {
        GeneralUtilites.wait(1);
        mouseClick(getElements("//*[@id='root']/div/section/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/span").get(0));
    }

    @When("^Click on one of advertiser account with missing hard pixel$")
    public void clickOnOneOfAdvertiserAccountWithMissingHardPixel() throws Throwable {
        GeneralUtilites.wait(1);
        mouseClick(getElements("//*[@id='root']/div/section/div/div[1]/div/div[2]/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/span").get(0));
    }

    @When("^Clicked on the flight header \"([^\"]*)\"$")
    public void clickedOnTheFlightHeader(String HeaderName) throws Throwable {

            mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div/*[text()='"+HeaderName+"']"));
            if(HeaderName.equals("Start Date")) {
                GeneralUtilites.wait(2);
                mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div/*[text()='"+HeaderName+"']"));
            }
            GeneralUtilites.wait(2);
    }

    @Then("^Flight rows are sorted based on \"([^\"]*)\"$")
    public void flightRowsAreSortedBasedOn(String HeaderName) throws Throwable {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Flights' rows are not sorted based on " + HeaderName,
                campaignsPage.CheckIfFlightSortedOn(HeaderName));
    }

    @And("^I Click on search for ended flights$")
    public void iClickOnSearchForEndedFlights() throws Throwable {
        GeneralUtilites.wait(1);
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div/div[1]/label/input[@value='ENDED']"));
        GeneralUtilites.wait(1);
    }

    @When("^I select show decimal places$")
    public void iSelectShowDecimalPlaces() throws Throwable {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.showDecimalPlaces();
    }

    @Then("^Decimal places shown for amounts$")
    public void decimalPlacesShownForAmounts() throws Throwable {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Decimal places not shown for amounts", campaignsPage.checkForDecimalPlaces());
    }

    @When("^I select hide decimal places$")
    public void iSelectHideDecimalPlaces() throws Throwable {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.hideDecimalPlaces();
    }

    @Then("^Decimal places not shown for amounts$")
    public void decimalPlacesNotShownForAmounts() throws Throwable {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertFalse("Decimal places shown for amounts", campaignsPage.checkForDecimalPlaces());
    }

    @And("^There are options to filter flights based on date$")
    public void thereAreOptionsToFilterFlightsBasedOnDate() throws Throwable {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertFalse("Options to filter flights based on date not shown", campaignsPage.checkForDateFilter());
    }

    @And("^Navigate to \"([^\"]*)\" Tab on Campaigns$")
    public void navigateToTabOnCampaigns(String tabName) throws Throwable {
        campaignsPage= new ProteusWebCampaignsPage(this.browserFactory);
        if(tabName.equals("Flights"))
           mouseClick( campaignsPage.btnFLIGHTS);
        GeneralUtilites.wait(1);

    }


}