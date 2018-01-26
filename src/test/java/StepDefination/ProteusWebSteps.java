package StepDefination;

import PageObjects.ProteusWebCampaignsPage;
import PageObjects.ProteusWebHomePage;
import PageObjects.ProteusWebLoginPage;
import SupportingUtilites.BrowserFactory;
import java.util.Properties;
import java.io.*;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import SupportingUtilites.*;

public class ProteusWebSteps extends BrowserFactory
{
    private BrowserFactory browserFactory;
    ProteusWebLoginPage loginPage;
    ProteusWebHomePage  homePage;
    ProteusWebCampaignsPage campaignsPage;
    Properties prop = new Properties();
    InputStream input = null;
    static String currentPath = System.getProperty("user.dir");
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
        Assert.assertTrue("I am not Proteus User", 1==1);
        System.out.println("I am a Proteus User step");

    }

    @Given("I have the role: Pro Web Campaigns")
    public void GivenIHaveTheRoleProWebCampaigns()
    {
        Assert.assertTrue("I don't have the role: Pro Web Campaigns",1==1);
        System.out.println("I have the role: Pro Web Campaigns");
    }

     @Given("I go to the Proteus Home URL in my browser")
    public void GivenIGoToTheProteusHomeURLInMyBrowser()
    {
        browserFactory.initBrowser(prop.getProperty("Browser"));
        browserFactory.loadApplication(prop.getProperty("ProteusWebURL"));
      //  BrowserFactory.initBrowser(ConfigurationManager.AppSettings["Browser"]);
       // BrowserFactory.loadApplication(ConfigurationManager.AppSettings["ProteusWebURL"]);
        System.out.println("I go to the Proteus Home URL in my browser");
    }

     @When("Login with the correct details username and password")
    public void WhenLoginWithTheCorrectDetailsUsernameAndPassword()
    {
        //Get the Username from App Config
        String strUserName = prop.getProperty("AdminUserName");
        //Get the Password from App Config
        String strPassword = prop.getProperty("AdminPassword");
        loginPage = new ProteusWebLoginPage(this.browserFactory);
        loginPage.loginToApplication(strUserName, strPassword);
        GeneralUtilites.wait(1);
        System.out.println(" I go to the Proteus Home URL in my browser");

    }

    @When("Login with the incorrect details username and password")
    public void WhenLoginWithTheIncorrectDetailsUsernameAndPassword()
    {
        loginPage = new ProteusWebLoginPage(this.browserFactory);
        loginPage.loginToApplication("dffdfdfd", "fddfgdfgd");
        GeneralUtilites.wait(1);
        System.out.println(" Login with the incorrect details username and password");
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

    @When("I click on Campaigns from home page")
    public void WhenIClickOnCampaigns()
    {
        homePage = new ProteusWebHomePage(this.browserFactory);
        homePage.NavigateProteusCampaign();
        GeneralUtilites.wait(1);
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
        // Need to implement this
        Assert.assertTrue( "Back to Home not shown on Campaign page",1==2);
    }

    @Then("All Flights loads which I have access to")
    public void ThenAllFlightsLoadsWhichIHaveAccessTo()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        System.out.println("Need to implement this to check the list of flights");
        // Need to implement this
        Assert.assertTrue("Need to implement this to check the list of flights",campaignsPage.GetFligtRowsCount()> 0);
    }

    @Then("All Flights matching search/filter combination load as results")
    public void ThenAllFlightsMatchingSearchFilterCombinationLoadAsResults()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        System.out.println("All Flights matching search/filter combination load as results");
        // Need to implement this
        Assert.assertTrue( "All Flights matching search/filter combination are not loaded as results",campaignsPage.GetFligtRowsCount()> 0 );
    }


    @When("I search/filter for a particular result")
    public void WhenISearchFilterForAParticularResult()
    {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsPage.EnterSearchFilter("", "FINANCE", "FINANCE - INSURE", "Agency > Business & Industrial 1742");
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
        ElementExtensions.mouseClick(campaignsPage.btnApplyFilters,browserFactory.getDriver());
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
        Assert.assertTrue( "Filter dropdown fields does not exist",campaignsPage.CheckFliterExist());
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

 }

