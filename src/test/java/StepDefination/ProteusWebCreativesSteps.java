package StepDefination;

import DataModels.ReportingAPIResponse;
import PageObjects.*;
import SupportingUtilites.BrowserFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.io.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.Assert;
import SupportingUtilites.*;

public class ProteusWebCreativesSteps extends BrowserFactory {
    private BrowserFactory browserFactory;
    private ProteusWebLoginPage loginPage;
    private ProteusWebHomePage homePage;
    private ProteusWebCampaignsPage campaignsPage;
    private ProteusWebAdminPage adminPage;
    private ProteusWebReportsPage reportsPage;
    private ProteusWebClientReportsPage clientReportsPage;
    private ProteusWebAdvertiserAccountsPage advertiserAccountsPage;
    private ProteusWebCreativesPage creativesPage;
    private ReportingAPIResponse objResponse;
    private Properties prop = new Properties();
    private InputStream input = null;
    private String AdvertiserMerger;
    private String MergedAdvertiser;
    private String AdvertiserNameBeforeEdit;
    private String AdvertiserNameAfterEdit;
    private static String currentPath = System.getProperty("user.dir");

    public ProteusWebCreativesSteps() {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        creativesPage = new ProteusWebCreativesPage(this.browserFactory);
    }

    public ProteusWebCreativesSteps(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
        try {
            InputStream input = new FileInputStream(currentPath + "/src/test/java/Resources/config.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        creativesPage = new ProteusWebCreativesPage(this.browserFactory);
    }

    @Then("^Creatives screen opened$")
    public void creativesScreenOpened()  {
        Assert.assertTrue("Creatives screen not opened",creativesPage.lblCreatives.isDisplayed());
    }

    @And("^Creatives are listed for the Advertiser Account of the Flight selected$")
    public void creativesAreListedForTheAdvertiserAccountOfTheFlightSelected()  {
        Assert.assertTrue("Creatives are not listed for the Advertiser Account of the Flight selected",creativesPage.creativesForAdvertiserListed());
    }

    @And("^Flights Advertiser Account is automatically applied on the Advertiser Account Name$")
    public void flightsAdvertiserAccountShown()  {
        Assert.assertTrue("Flights Advertiser Account is not automatically applied on the Advertiser Account Name",
                creativesPage.lblAdvertiserCreatives.getText().toLowerCase().
                        contains("Travel - Luxury".toLowerCase()));
    }

    @And("^Change button shown on the creative page$")
    public void changeButtonShownOnTheCreativePage() {
        Assert.assertTrue("Change button not shown on the creative page",
                creativesPage.btnChange.isDisplayed());
    }

    @When("^Click on Change button$")
    public void clickOnChangeButton() {
        mouseClick(creativesPage.btnChange);
    }

    @Then("^Option to change advertiser account exist$")
    public void optionToChangeAdvertiserAccountExist() {
        GeneralUtilites.wait(2);
        Assert.assertTrue("Option to change advertiser account not exist",
                creativesPage.txtAdvertiserAccount.isDisplayed() &&
                        creativesPage.btnOK.isDisplayed());
    }

    @When("^I change the advertiser and save$")
    public void iChangeTheAdvertiserAndSave(){
        creativesPage.txtAdvertiserAccount.click();
        mouseClick(getElements("/html/body/div[2]/div/div[2]/section/div[2]/form/div[1]/div/ul").get(0));
        creativesPage.btnOK.click();
    }

    @Then("^New advertiser details shown on the creatives page$")
    public void newAdvertiserDetailsShownOnTheCreativesPage()  {
        Assert.assertTrue("New advertiser details not shown on the creatives page",
                !creativesPage.lblAdvertiserCreatives.getText().toLowerCase().
                        contains("Travel - Luxury".toLowerCase()));
    }

    @And("^There is a tag icon on the right hand side of the creative row$")
    public void thereIsATagIconOnTheRightHandSideOfTheCreativeRow() {
        Assert.assertTrue("There are no tag icon on the right hand side of the creative row",
                creativesPage.checkForTagIconsOnCreativeList());
    }

    @And("^Tooltips shown on mouseover on tag icon 'View creative tag and image'$")
    public void tooltipsShownOnMouseoverOnTagIconViewCreativeTagAndImage()  {
        Assert.assertTrue("Tooltips not shown on mouseover on tag icon 'View creative tag and image'",
                creativesPage.checkForToolTipOnTagIcon());
    }

    @When("^Click on the tag icon$")
    public void clickOnTheTagIcon() {
        creativesPage.clickOnTagIcon();
    }

    @Then("^Pop up shown with the creative name and options$")
    public void popUpShownWithTheCreativeNameAndOptions()   {
       Assert.assertTrue("Pop up not shown with the creative name and options",
               creativesPage.checkForCreativePopup());
    }

    @And("^Able to copy the creative tag script$")
    public void ableToCopyTheCreativeTagScript()   {
        Assert.assertTrue("Unable to copy the creative tag script",
                creativesPage.btnCopyCreativeDetails.isEnabled());
    }

    @And("^Unable to edit the creative tag script$")
    public void unableToEditTheCreativeTagScript() {
        Assert.assertTrue("Able to edit the creative tag script",
                creativesPage.txtCreativeText.isEnabled());
    }

    @And("^The following column for advertiser with ad server mapped$")
    public void theFollowingColumnInformationIsAvailable()   {
        List<String> expectedHeaders = Arrays.asList ("Platform","arrow_upward","Creative Name","External ID","AD Server Placement","Classification","DSP Status","DSP Audit Status");
        Assert.assertTrue("All the expected columns not shown",
                creativesPage.checkForCreativeColumns(expectedHeaders));
    }

    @When("^I change the advertiser \"([^\"]*)\" and save$")
    public void iChangeTheAdvertiserAndSave(String strAdvertiserName)   {
       creativesPage.changeAdvertiserOnCreativeTab(strAdvertiserName);
    }

    @Then("^The following column for advertiser without ad server mapped$")
    public void theFollowingColumnForAdvertiserWithoutAdServerMapped()  {
        List<String> expectedHeaders = Arrays.asList ("Platform","arrow_upward","Creative Name","External ID", "Classification","DSP Status","DSP Audit Status");
        Assert.assertTrue("All the expected columns not shown",
                creativesPage.checkForCreativeColumns(expectedHeaders));
    }
}

