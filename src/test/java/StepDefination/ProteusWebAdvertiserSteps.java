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
    private String AdvertiserMerger;
    private String MergedAdvertiser;
    private String AdvertiserNameBeforeEdit;
    private String AdvertiserNameAfterEdit;
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
        advertiserAccountsPage.SearchForOnAdvertiserPage(strSearchKey);
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

    @When("^Search for an Advertiser to Merge$")
    public void searchForAnAdvertiserToMerge()  {

        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        this.AdvertiserMerger = GeneralUtilites.getAdvertiserNameDB("NoAgency");
        advertiserAccountsPage.SearchForAdvertiser(this.AdvertiserMerger);
        GeneralUtilites.wait(2);
    }

    @And("^Select the Advertiser to be merged and Save$")
    public void selectTheAdvertiserToBeMergedAndSave(){
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
       this.MergedAdvertiser = advertiserAccountsPage.SelectAdvertiserToMerge();
        GeneralUtilites.wait(1);
    }

    @Then("^Second Advertiser details page shown$")
    public void secondAdvertiserDetailsPageShown(){
       advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
       Assert.assertTrue("Second Advertiser details page not shown", advertiserAccountsPage.txtAdvertiserName.getAttribute("value").toLowerCase().equals(this.MergedAdvertiser.toLowerCase()));
       mouseClick(advertiserAccountsPage.btnBack);
    }

    @When("^Search for Advertiser one merged$")
    public void searchForAdvertiserOneMerged() {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        advertiserAccountsPage.SearchForOnAdvertiserPage(this.AdvertiserMerger);
    }

    @Then("^No Advertisers returned$")
    public void noAdvertisersReturned()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        Assert.assertTrue("Advertiser Still exist after Merge", advertiserAccountsPage.CheckForNoAdvertiserMatched());
    }

    @When("^Search for Advertiser two merged$")
    public void searchForAdvertiserTwoMerged()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        advertiserAccountsPage.SearchForOnAdvertiserPage(this.MergedAdvertiser);
    }


    @Then("^Advertisers filtered as per search key \"([^\"]*)\"$")
    public void advertisersFilteredAsPerSearchKey(String strSearchKey)   {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        switch (strSearchKey)
        {
            case "MergedAdvertiser":
                strSearchKey = this.MergedAdvertiser.replace("_"," ");
                break;
            case "AdvertiserMerged":
                strSearchKey =this.AdvertiserMerger.replace("_"," ");
                break;
            case "AdvertiserNameAfterEdit":
                strSearchKey =this.AdvertiserNameAfterEdit.replace("_"," ");
                break;
            case "AdvertiserNameBeforeEdit":
                strSearchKey =this.AdvertiserNameBeforeEdit.replace("_"," ");
                break;
            default:
                strSearchKey = strSearchKey.replace("_"," ");
                break;

        }
        Assert.assertTrue( "Advertisers not filtered as per search key",
                advertiserAccountsPage.CheckForAdvertiserRows(strSearchKey.replace("_"," ")));
    }

    @And("^Select the Advertiser to be merged and Cancel$")
    public void selectTheAdvertiserToBeMergedAndCancel() {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        this.MergedAdvertiser = advertiserAccountsPage.SelectAdvertiserToMergeAndCancel();
        GeneralUtilites.wait(1);
    }

    @Then("^First Advertiser details page shown$")
    public void firstAdvertiserDetailsPageShown()   {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        Assert.assertTrue("First Advertiser details page not shown", advertiserAccountsPage.txtAdvertiserName.getAttribute("value").toLowerCase().contains(this.AdvertiserMerger.toLowerCase().replace("_"," ")));
        mouseClick(advertiserAccountsPage.btnBack);
    }

    @When("^Click on edit icon to change advertiser information$")
    public void clickOnEditIconToChangeAdvertiserInformation()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        mouseClick(advertiserAccountsPage.btnEditAdvertiserDetails);
    }

    @And("^Update Advertiser, Agency Name and save the details$")
    public void updateAdvertiserAgencyNameAndSaveTheDetails()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        this.AdvertiserNameAfterEdit = "EditedAdvertiser" + GeneralUtilites.RandomNumber(1000,9999);
        advertiserAccountsPage.EditAdvertiserName(this.AdvertiserNameAfterEdit);
    }

    @When("^Search for an Advertiser to EditName$")
    public void searchForAnAdvertiserToEditName()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        this.AdvertiserNameBeforeEdit = GeneralUtilites.getAdvertiserNameDB("EditName");
        advertiserAccountsPage.SearchForAdvertiser(this.AdvertiserNameBeforeEdit);
        GeneralUtilites.wait(2);
    }

    @When("^Search for Advertiser before edit name$")
    public void searchForAdvertiserBeforeEditName()   {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        advertiserAccountsPage.SearchForAdvertiser(this.AdvertiserNameBeforeEdit);
        GeneralUtilites.wait(2);
    }

    @When("^Search for Advertiser with updated name$")
    public void searchForAdvertiserWithUpdatedName()   {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        advertiserAccountsPage.SearchForAdvertiser(this.AdvertiserNameAfterEdit);
        GeneralUtilites.wait(2);
    }

    @When("^Search based on Requires action$")
    public void searchBasedOnRequiresAction()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        advertiserAccountsPage.SearchForAdvertiserByRequiresAction();
        GeneralUtilites.wait(2);
    }

    @Then("^Advertisers filtered as per Requires action$")
    public void advertisersFilteredAsPerRequiresAction()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        Assert.assertTrue("Advertisers not filtered as per Requires action", advertiserAccountsPage.CheckForAdvertiserRequiresActions());

    }

    @And("^Click on bulk edit$")
    public void clickOnBulkEdit()   {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        mouseClick(advertiserAccountsPage.btnBulkEdit);
    }

    @And("^Edit two or more Advertiser, Agency details and Save$")
    public void editTwoOrMoreAdvertiserAgencyDetailsAndSave()  {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        advertiserAccountsPage.BulkEditAdvertiserAgency();
    }

    @Then("^Bulk edit saved successfuly$")
    public void bulkEditSavedSuccessfuly()     {
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        Assert.assertTrue("Bulk edit not saved successfuly", advertiserAccountsPage.CheckForAdvertiserRequiresActions());
    }
}
