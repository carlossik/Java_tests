package StepDefination;


import PageObjects.*;
import SupportingUtilites.BrowserFactory;
import java.util.Properties;
import java.io.*;
import cucumber.api.java.en.*;
import org.junit.Assert;
import SupportingUtilites.*;

public class ProteusWebSteps extends BrowserFactory
{
    private BrowserFactory browserFactory;
    private ProteusWebLoginPage loginPage;
    private ProteusWebHomePage  homePage;
    private ProteusWebCampaignsPage campaignsPage;
    private ProteusWebAdminPage adminPage;
    private ProteusWebReportsPage reportsPage;
    private ProteusWebClientReportsPage clientReportsPage;
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
    }


    @Given("I am a Proteus User")
    public void GivenIAmAProteusUser()
    {
   //     Assert.assertTrue("I am not Proteus User", 1==1);
        System.out.println("I am a Proteus User step");
    }


    @Given("I have the role: Pro Web Campaigns")
    public void GivenIHaveTheRoleProWebCampaigns()
    {
      //  Assert.assertTrue("I don't have the role: Pro Web Campaigns",1==1);
        System.out.println("I have the role: Pro Web Campaigns");
    }

    @Given("I go to the Proteus Home URL in my browser")
    public void GivenIGoToTheProteusHomeURLInMyBrowser()
    {
       SupportingUtilites.BrowserFactory.initBrowser(prop.getProperty("Browser"));
        SupportingUtilites.BrowserFactory.loadApplication(prop.getProperty("ProteusWebURL").replace("{Environment}",prop.getProperty("Environment")));
        System.out.println("I go to the Proteus Home URL in my browser");
    }


    @When("^Login as \"([^\"]*)\"$")
    public void loginAs(String strRole)
    {
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
    public void ThenAnErrorMessageDisplayedAdvisingToTryAgain()
    {
        loginPage = new ProteusWebLoginPage(this.browserFactory);
        Assert.assertTrue("Error message not displayed for incorrect username/password",loginPage.CheckInvalidUsernamePassword());
        System.out.println(" An error message displayed advising to try again");
    }


    @Then("The main homepage loads successfully")
    public void ThenTheMainHomepageLoadsSuccessfully()
    {
        homePage = new ProteusWebHomePage(this.browserFactory);
        Assert.assertTrue("The main homepage not shown", homePage.CheckHomePage());
    }

    @Then("The Campaigns page loads successfully")
    public void ThenTheCampaignsPageLoadsSuccessfully()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("The Campaigns page not loaded",campaignsPage.CheckCampaignsPageLoad());
    }

    @Then("Log out, Back to Home, Flights icon shown on Campaign page")
    public void ThenLogOutBackToHomeFlightsIconShownOnCampaignPage()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Logout option not shown on Campaign page",campaignsPage.CheckLogOutExist());
        Assert.assertTrue("Flights icon not shown on Campaign page",campaignsPage.CheckFLIGHTSExist() );
        Assert.assertTrue( "Back to Home not shown on Campaign page",campaignsPage.CheckForNavigateToHome());
    }

    @Then("All Flights loads which I have access to")
    public void ThenAllFlightsLoadsWhichIHaveAccessTo()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        System.out.println("Need to implement this to check the list of flights");
        Assert.assertTrue("Need to implement this to check the list of flights",campaignsPage.GetFlightRowsCount()> 0);
    }

    @Then("All Flights matching search/filter combination load as results")
    public void ThenAllFlightsMatchingSearchFilterCombinationLoadAsResults()
    {
     /*   int intFlightCount = RestAssuredClient.GetFlightCount("/campaign-flight/search?order-by=START_DATE_DESC&page-number=0&page-size=20",
                 "FINANCE",
                 "2039",
                 "2793");*/
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        System.out.println("All Flights matching search/filter combination load as results");
        // Need to implement this
        Assert.assertTrue( "All Flights matching search/filter combination are not loaded as results",campaignsPage.GetFlightRowsCount()>0 );
    }


    @When("I search/filter for a particular result")
    public void WhenISearchFilterForAParticularResult()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.EnterSearchFilter("Automation 8", "", "");
        GeneralUtilites.wait(2);
    }

    @Then("Apply button is enabled")
    public void ThenApplyButtonIsEnabled()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue( "Apply button is not enabled after enter search",campaignsPage.btnApplyFilters.isEnabled());
    }

    @When("Click on Apply button")
    public void WhenClickOnApplyButton()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        //  Assert.assertTrue(Page.ProteusWebCampaigns.btnApplyFilters.Enabled, "Apply button is not enabled after enter search");
        GeneralUtilites.wait(1);
        mouseClick(campaignsPage.btnApplyFilters );
        GeneralUtilites.wait(1);
    }


    @Then("Clear Filters button is enabled")
    public void ThenClearFiltersButtonIsEnabled()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Clear Filters button is not enabled after enter search",campaignsPage.btnClearFilters.isEnabled() );
    }


    @Then("I can search by Flight Name or Booking Code")
    public void ThenICanSearchByFlightNameOrBookingCode()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("I can't search by Flight Name or Booking Code",campaignsPage.CheckSearchByFlightNameOrBookingCodeExist() );
    }

    @Then("Filter dropdown fields exist")
    public void ThenFilterDropdownFieldsExist()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue( "Filter dropdown fields does not exist",campaignsPage.CheckFilterExist());
    }

    @Then("There is a box called Campaigns")
    public void ThenThereIsABoxCalledCampaigns()
    {
        homePage = new ProteusWebHomePage(this.browserFactory);
        Assert.assertTrue( "There is a box called Campaigns does not exist",homePage.CheckCampaignTabExist());
    }

    @Then("Log Out button exist")
    public void ThenLogOutButtonExist()
    {
        homePage = new ProteusWebHomePage(this.browserFactory);
        Assert.assertTrue("Log Out button does not exist",homePage.CheckLogOutExist() );
    }

    @Then("LogOut ProteusWeb from Home Page")
    public void ThenLogoutProteusWeb()
    {
        homePage = new ProteusWebHomePage(this.browserFactory);
        homePage.Logout();
    }

    @Then("LogOut ProteusWeb from Campaigns page")
    public void ThenLogOutProteusWebFromCampaignsPage()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.Logout();
    }


    @When("^API Search for Flights$")
    public void apiSearchForFlights()
    {
        int intFlightCount = RestAssuredClient.GetFlightCount("/campaign-flight/search?order-by=START_DATE_DESC&page-number=0&page-size=20",
                "FINANCE",
                "2039",
                "2793");
        System.out.println("intFlightCount : " + intFlightCount);
        Assert.assertTrue("API Search for Flights",intFlightCount > 0);
    }



    @Then("^There is a box called \"([^\"]*)\"$")
    public void thereIsABoxCalled(String tabName)
    {
        homePage = new ProteusWebHomePage(this.browserFactory);
        if(tabName.equals("Campaigns"))
            Assert.assertTrue( "There is a box called Campaigns does not exist",homePage.CheckCampaignTabExist());
        if(tabName.equals("Reports"))
            Assert.assertTrue( "There is a box called Reports does not exist",homePage.CheckReportsTabExist());
        if(tabName.equals("Administration"))
            Assert.assertTrue( "There is a box called Administration does not exist",homePage.CheckAdministrationTabExist());
        if(tabName.equals("Client Reports"))
            Assert.assertTrue( "There is a box called Client Reports does not exist",homePage.CheckClientReportsTabExist());
    }

    @When("^I click on \"([^\"]*)\" from home page$")
    public void iClickOnFromHomePage(String tabName)
    {
        homePage = new ProteusWebHomePage(this.browserFactory);
        if(tabName.equals("Campaigns"))
            homePage.NavigateProteusCampaign();
        if(tabName.equals("Reports"))
            homePage.NavigateProteusReports();
        if(tabName.equals("Administration"))
            homePage.NavigateProteusAdministration();
        if(tabName.equals("Client Reports"))
            homePage.NavigateProteusClientReports();
        GeneralUtilites.wait(1);
    }

    @Then("^Administration page shown correctly$")
    public void administrationPageShownCorrectly()
    {
        adminPage = new ProteusWebAdminPage(this.browserFactory);
        Assert.assertTrue("Administration page not shown correctly",
                adminPage.btnSeats.isDisplayed() &&
                        adminPage.btnJobs.isDisplayed() &&
                        adminPage.btnMasterData.isDisplayed());
    }

    @And("^LogOut ProteusWeb from Admin Page$")
    public void logoutProteusWebFromAdminPage()
    {
        adminPage = new ProteusWebAdminPage(this.browserFactory);
        adminPage.Logout();
    }

    @And("^Able to filter seats by Operation Unit TEL$")
    public void ableToFilterSeatsByOperationUnitTEL()
    {
        adminPage = new ProteusWebAdminPage(this.browserFactory);
        adminPage.NavigateAdministrationSeats();
        Assert.assertTrue("Unable to filter seats by Operation Unit TEL",
                adminPage.FilterOperationalUnit());
    }

    @And("^Able to navigate to Administration Jobs$")
    public void ableToNavigateToAdministrationJobs()
    {
        adminPage = new ProteusWebAdminPage(this.browserFactory);
        adminPage.NavigateAdministrationJobs();
        GeneralUtilites.wait(1);
        Assert.assertTrue("Unable to navigate to Administration Jobs",
                adminPage.btnJobsRefresh.isDisplayed());
    }

    @And("^Able to navigate to Administration Master Data$")
    public void ableToNavigateToAdministrationMasterData()
    {
        adminPage = new ProteusWebAdminPage(this.browserFactory);
        GeneralUtilites.wait(2);
        adminPage.NavigateAdministrationMasterData();
        GeneralUtilites.wait(2);
        Assert.assertTrue("Unable to navigate to Administration Master Data",
                adminPage.btnMasterDataAddPubLocation.isDisplayed() &&
                        adminPage.btnMasterDataAddJobScdTemplates.isDisplayed());
    }

    @Then("^Reports page shown correctly$")
    public void reportsPageShownCorrectly()
    {
        reportsPage = new ProteusWebReportsPage(this.browserFactory);
        GeneralUtilites.wait(1);
        Assert.assertTrue("Reports page not shown correctly",
                reportsPage.btnClient.isDisplayed() &&
                        reportsPage.btnPlatform.isDisplayed());
    }

    @And("^LogOut ProteusWeb from Reports Page$")
    public void logoutProteusWebFromReportsPage()
    {
        reportsPage = new ProteusWebReportsPage(this.browserFactory);
        reportsPage.Logout();
    }

    @And("^LogOut ProteusWeb from Client Reports Page$")
    public void logoutProteusWebFromClientReportsPage()
    {
        clientReportsPage = new ProteusWebClientReportsPage(this.browserFactory);
        clientReportsPage.Logout();
    }

    @Then("^Client Reports page shown correctly$")
    public void clientReportsPageShownCorrectly()
    {
        clientReportsPage = new ProteusWebClientReportsPage(this.browserFactory);

        if(clientReportsPage.txtAdvertiser.isDisplayed())
            clientReportsPage.SelectAdvertiser();

        Assert.assertTrue("Client Reports page not shown correctly",
                clientReportsPage.btnDashBoard.isDisplayed() &&
                        clientReportsPage.btnPerformance.isDisplayed() &&
                        clientReportsPage.btnDSP.isDisplayed() &&
                        clientReportsPage.btnTactics.isDisplayed() );
    }

    @And("^Able to navigate to Client Reports Dashboard$")
    public void ableToNavigateToClientReportsDashboard()
    {
        clientReportsPage = new ProteusWebClientReportsPage(this.browserFactory);
        clientReportsPage.NavigateClientReportDashborad();
        Assert.assertTrue("Unable to navigate to Client Reports Dashboard",
                clientReportsPage.txtRecentFligts.isDisplayed()  );
    }

    @And("^Able to navigate to Client Reports Performance$")
    public void ableToNavigateToClientReportsPerformance()
    {
        clientReportsPage = new ProteusWebClientReportsPage(this.browserFactory);
        clientReportsPage.NavigateClientReportPerformance();
        Assert.assertTrue("Unable to navigate to Client Reports Performace",
                clientReportsPage.txtPerformanceOverview.isDisplayed());
    }

    @And("^Able to navigate to Client Reports DSP$")
    public void ableToNavigateToClientReportsDSP()
    {
        clientReportsPage = new ProteusWebClientReportsPage(this.browserFactory);
        clientReportsPage.NavigateClientReportDSP();
        Assert.assertTrue("Unable to navigate to Client Reports DSP",
                clientReportsPage.txtDSPOverview.isDisplayed());
    }

    @And("^Able to navigate to Client Reports Tactics$")
    public void ableToNavigateToClientReportsTactics()
    {
        clientReportsPage = new ProteusWebClientReportsPage(this.browserFactory);
        clientReportsPage.NavigateClientReportTactics();
        Assert.assertTrue("Unable to navigate to Client Reports Tactics",
                clientReportsPage.txtTacticsOverview.isDisplayed());
    }


    @Then("^There is an option to filter by 'Requires action'$")
    public void thereIsAnOptionToFilterByRequiresAction()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        GeneralUtilites.wait(1);
        Assert.assertTrue("Option to filter by 'Requires action' does not exist",
                campaignsPage.chbxRequiresAction.isDisplayed());
    }

    @And("^Default 'Requires action' is unselected$")
    public void defaultRequiresActionIsUnselected()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertFalse("Default 'Requires action' is selected",
                campaignsPage.chbxRequiresAction.getAttribute("class").equals("theme_check_2B20W theme_checked_2NQ9n"));

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
        Assert.assertTrue(" 'Requires action' is not selected after clicking on it ",
                campaignsPage.chbxRequiresAction.getAttribute("class").equals("theme_check_2B20W theme_checked_2NQ9n"));
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
        GeneralUtilites.wait(1);
        campaignsPage.ClickOnSortBy();
        GeneralUtilites.wait(1);
        Assert.assertTrue("Sort by Flight created not selected",
                campaignsPage.IsSelected("SortByFlightCreatedDescending"));
        campaignsPage.UnClickOnSortBy();
    }


    @Then("^Sort by Flight updated selected$")
    public void sortByFlightUpdatedSelected()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        GeneralUtilites.wait(1);
        campaignsPage.ClickOnSortBy();
        GeneralUtilites.wait(1);
        Assert.assertTrue("Sort by Flight updated not selected",
                  campaignsPage.IsSelected("SortByFlightUpdatedDescending"));
        campaignsPage.UnClickOnSortBy();
    }

    @And("^There is a section called 'Flights'$")
    public void thereIsASectionCalledFlights()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("There is a section called 'Flights' not shown",
                campaignsPage.txtFlightsCount.isDisplayed());
    }

    @And("^Each flight title includes Advertiser, Agency, Flight Names and External Booking Reference$")
    public void CheckFlightDetailsShown()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Each flight title does not includes Advertiser, Agency, Flight Names and External Booking Reference",
                campaignsPage.CheckFlightDetailsShown());
    }

    @And("^Goal Type, Goal Value, Optimisation Manager, Budget, Spend information and Flight Dates$")
    public void goalTypeGoalValueOptimisationManagerBudgetSpendInformationAndFlightDates()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Goal Type, Goal Value, Optimisation Manager, Budget, Spend information and Flight Dates not shown",
                campaignsPage.CheckFlightGoalDetailsShown());
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
        String strQuery = prop.getProperty("SQLQuerySortByCreatedTime").replace("{SearchKey}","Automation 8");
        Assert.assertTrue("All flights are not sorted based on created date",
                campaignsPage.RecordsSortedBy(strQuery));
    }

    @And("^All flights sorted based on updated date$")
    public void allFlightsSortedBasedOnUpdatedDate()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        String strQuery = prop.getProperty("SQLQuerySortByUpdatedTime").replace("{SearchKey}","Automation 8");
        Assert.assertTrue("All flights are not sorted based on updated date",
                campaignsPage.RecordsSortedBy(strQuery));
    }
}

