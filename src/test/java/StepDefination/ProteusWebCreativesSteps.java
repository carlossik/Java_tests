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
        mouseClick(getElements("/html/body/div/div/div[2]/section/div[2]/form/div[1]/div/ul").get(0));
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
        List<String> expectedHeaders = Arrays.asList ("Platform", "Creative Name","External ID",
                "AD Server Placement","Classification","DSP Status","DSP Audit Status");
        Assert.assertTrue("All the expected columns not shown",
                creativesPage.checkForCreativeColumns(expectedHeaders));
    }

    @When("^I change the advertiser \"([^\"]*)\" and save$")
    public void iChangeTheAdvertiserAndSave(String strAdvertiserName)   {
       creativesPage.changeAdvertiserOnCreativeTab(strAdvertiserName);
    }

    @Then("^The following column for advertiser without ad server mapped$")
    public void theFollowingColumnForAdvertiserWithoutAdServerMapped()  {
        List<String> expectedHeaders = Arrays.asList ("Platform" ,"Creative Name","External ID",
                "Classification","DSP Status","DSP Audit Status");
        Assert.assertTrue("All the expected columns not shown",
                creativesPage.checkForCreativeColumns(expectedHeaders));
    }

    @And("^Creatives bulk edit button shown on Creatives tab$")
    public void creativesBulkEditButtonShownOnCreativesTab()  {
        Assert.assertTrue("Creatives bulk edit button not shown on pixel tab",
                creativesPage.btnCreativesBulkEdit.isDisplayed() &&  creativesPage.btnCreativesBulkEdit.isEnabled());
    }

    @When("^Click on Creatives bulk edit$")
    public void clickOnCreativesBulkEdit()  {
        mouseClick( creativesPage.btnCreativesBulkEdit);
    }

    @Then("^Creatives grid changed to editable state$")
    public void creativesGridChangedToEditableState()  {
        GeneralUtilites.wait(1);
        Assert.assertTrue("Creatives grid not changed to editable state",
                creativesPage.btnCreativesBulkEdit.isDisplayed() && !creativesPage.btnCreativesBulkEdit.isEnabled());
    }

    @And("^Editable columns shown on Creatives grid$")
    public void editableColumnsShownOnPixelGrid() {
        Assert.assertTrue("AD Server Placement or Classification columns are not editable",
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[4]/div/div/div//input") > 0
                        && getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[5]/div/div[1]/div//input") > 0
                        && getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[5]/div/div[2]/div//input") > 0);
    }

    @And("^ReadOnly columns shown on Creatives grid$")
    public void readonlyColumnsShownOnPixelGrid() {
        Assert.assertTrue("ReadOnly columns not shown on Creatives grid",
                   getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[3]") > 0
                        && getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[2]") > 0
                        && getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[1]") > 0
                        && getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[6]") > 0
                        && getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[7]") > 0);
    }

    @And("^Tooltips shown on mouseover on Creative Bulk edit button$")
    public void tooltipsShownOnMouseoverOnBulkEditButton() {
        Assert.assertEquals("Tooltips not shown on mouseover on Creative Bulk edit button",
                getToolTip(creativesPage.btnCreativesBulkEdit).toLowerCase(),"Edit creative mappings and classification".toLowerCase());
    }

    @When("^I click on the creatives add icon$")
    public void iClickOnTheCreativesAddIcon()     {
        if (getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div/div/span") > 0)
            mouseClick(getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div/div/span").get(0));
        else {
            System.out.println("No add icon shown");
            mouseClick(creativesPage.btnCreativesBulkEdit);
        }
    }

    @Then("^Dropdown list with AD Server Placements for each Creative$")
    public void dropdownListWithADServerPlacementsForEachCreative()   {
        Assert.assertTrue("Dropdown list with AD Server Placements for each Creative not shown",
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div /div/div[2]/div/div/div/div/div/div/ul/li") >= 8);
    }


    @And("^Dropdown lists for Classification and Classification Type exist for each Creative$")
    public void dropdownListsForClassificationAndClassificationTypeExistForEachCreative() {
        Assert.assertTrue("Dropdown lists for Classification and Classification Type exist for each Creative not shown",
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div[1]/div[5]/div/div[1]/div/div/ul/li") == 2
                     && getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div[1]/div[5]/div/div[2]/div/div/ul/li") >= 3);

    }

    @Then("^Save button Enabled on Creatives tab$")
    public void saveButtonEnabledOnCreativesTab()   {
        Assert.assertTrue("Save button not enabled on Creatives tab",
                creativesPage.btnCreativesBulkEditSave.isEnabled());
    }

    @Then("^Creatives details saved$")
    public void creativesDetailsSaved()     {
        Assert.assertEquals("Creatives details not saved",
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div//button"),1);

    }


    @When("^Bulk edit AD Server Placements and Classification$")
    public void bulkEditADServerPlacementsAndClassification()  {
      creativesPage.BulkEditCreatives();
    }

    @And("^The Creative Name is a deeplink$")
    public void theCreativeNameIsADeeplink()    {
        Assert.assertTrue("The Creative Name is a not deeplink",
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/div/a") > 0 &&
                        !getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/div/a").get(0).getAttribute("href").equals(""));

    }

    @When("^Click on the Creative Name$")
    public void clickOnTheCreativeName()     {
        mouseClick(getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/div/a").get(0));
    }
}

