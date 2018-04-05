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

public class ProteusWebAdvertiserSteps extends BrowserFactory {
    private BrowserFactory browserFactory;
    private ProteusWebLoginPage loginPage;
    private ProteusWebHomePage homePage;
    private ProteusWebCampaignsPage campaignsPage;
    private ProteusWebAdminPage adminPage;
    private ProteusWebReportsPage reportsPage;
    private ProteusWebClientReportsPage clientReportsPage;
    private ProteusWebAdvertiserAccountsPage advertiserAccountsPage;
    private ReportingAPIResponse objResponse;
    private Properties prop = new Properties();
    private InputStream input = null;
    private static String currentPath = System.getProperty("user.dir");

    public ProteusWebAdvertiserSteps() {
    }

    public ProteusWebAdvertiserSteps(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
        try {
            InputStream input = new FileInputStream(currentPath + "/src/test/java/Resources/config.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    @Then("^No flights returned and message displayed$")
    public void noFlightsReturnedAndMessageDisplayed()  {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Flights returned and message not displayed",
                campaignsPage.CheckForNoFlightsMatchingForSearch());
    }

    @When("^I select a First Advertiser Account$")
    public void iSelectAAdvertiserAccountRow()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        advertiserAccountsPage.SelectFirstAdvertiserRow();
    }

    @Then("^Advertiser Account Overview screen shown$")
    public void advertiserAccountOverviewScreenShown()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        Assert.assertTrue("Advertiser Account Overview screen not shown",advertiserAccountsPage.txtAdvertiserName.isDisplayed());
        mouseClick(advertiserAccountsPage.btnBack);
    }

    @When("^Search for a Advertiser Name \"([^\"]*)\"$")
    public void searchForAAdvertiserName(String strSearchKey)  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        enterText(advertiserAccountsPage.txtSearch, strSearchKey);
        mouseClick(advertiserAccountsPage.btnApplyFilters);
        GeneralUtilites.wait(1);
    }

    @Then("^Advertisers filtered as per search key \"([^\"]*)\"$")
    public void advertisersFilteredAsPerSearchKey(String strSearchKey)   {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        Assert.assertTrue( "Advertisers not filtered as per search key",
                advertiserAccountsPage.CheckForAdvertiserRows(strSearchKey));
    }

    @And("^Advertiser Account details displayed on the page$")
    public void advertiserAccountDetailsDisplayedOnThePage()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        Assert.assertTrue( "Advertiser Account details not displayed on the page",
                advertiserAccountsPage.CheckForAdvertiserAccountDetails());
        if(advertiserAccountsPage.btnBack.isDisplayed())
            mouseClick(advertiserAccountsPage.btnBack);
    }

    @And("^Option to Merge advertiser account into another exist$")
    public void optionToMergeAdvertiserAccountIntoAnotherExist()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        GeneralUtilites.wait(1);
        Assert.assertTrue( "Option to Merge advertiser account into another doesn't exist",
                advertiserAccountsPage.CheckForMergeAdvertiserAccount());
        GeneralUtilites.wait(1);
        if(advertiserAccountsPage.btnBack.isDisplayed())
            mouseClick(advertiserAccountsPage.btnBack);
    }

    @When("^Click on Merge Into Another Advertiser Account$")
    public void clickOnMergeIntoAnotherAdvertiserAccount()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        GeneralUtilites.wait(1);
        mouseClick(advertiserAccountsPage.btnMergeAdvertiser);
    }

    @Then("^Option to select Advertiser and confirm merge message shown$")
    public void optionToSelectAdvertiserAndConfirmMergeMessageShown()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        GeneralUtilites.wait(2);
        Assert.assertTrue( "Option to select Advertiser and confirm merge message not shown",
                advertiserAccountsPage.CheckForMergeObjectsOnDialog());
    }

    @Then("^Advertiser Platform details shown$")
    public void advertiserPlatformDetailsShown()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        GeneralUtilites.wait(2);
        Assert.assertTrue( "Advertiser Platform details not shown",
                advertiserAccountsPage.CheckForAdvertiserPlatformDetails());
    }

    @Then("^Tooltip with Platform Name and Platform External ID shown on mouseover on icon$")
    public void tooltipWithPlatformNameAndPlatformExternalIDShownOnMouseoverOnIcon()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        GeneralUtilites.wait(2);
        Assert.assertTrue( "Tooltip with Platform Name and Platform External ID not shown on mouseover on icon",
                advertiserAccountsPage.CheckForAdvertiserPlatformToolTip());

    }

    @Then("^Advertiser Platforms tab opened on clicking Platform icon$")
    public void advertiserPlatformsTabOpenedOnClickingPlatformIcon()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        GeneralUtilites.wait(2);
        Assert.assertTrue( "Advertiser Platforms tab not opened on clicking Platform icon",
                advertiserAccountsPage.CheckForAdvertiserPlatformTab());


    }
}
