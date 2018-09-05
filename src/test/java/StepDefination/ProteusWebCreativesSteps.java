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
import org.apache.commons.lang.time.DateUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Assert;
import SupportingUtilites.*;
import org.openqa.selenium.WebElement;

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
    private String DateOnTextField;
    private static String currentPath = System.getProperty("user.dir");

    private int AdServerPlacementsCount;

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
        Assert.assertTrue("Creatives screen not opened",
                creativesPage.lblCreatives.isDisplayed());
    }

    @And("^Creatives are listed for the Advertiser Account of the Flight selected$")
    public void creativesAreListedForTheAdvertiserAccountOfTheFlightSelected()  {
        Assert.assertTrue("Creatives are not listed for the Advertiser Account of the Flight selected",
                creativesPage.creativesForAdvertiserListed());
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
        enterText(creativesPage.txtAdvertiserAccount, "");
        GeneralUtilites.wait(1);
        enterText(creativesPage.txtAdvertiserAccount, "tr");
        GeneralUtilites.wait(1);
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
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div /div/div[2]/div/div/div/div/div/div/ul/li")
                        >= 8);
    }


    @And("^Dropdown lists for Classification and Classification Type exist for each Creative$")
    public void dropdownListsForClassificationAndClassificationTypeExistForEachCreative() {
        Assert.assertTrue("Dropdown lists for Classification and Classification Type exist for each Creative not shown",
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div[1]/div[5]/div/div[1]/div/div/ul/li")
                        == 2
                     && getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div[1]/div[5]/div/div[2]/div/div/ul/li")
                        >= 3);

    }

    @Then("^Save button Enabled on Creatives tab$")
    public void saveButtonEnabledOnCreativesTab()   {
        Assert.assertTrue("Save button not enabled on Creatives tab",
                creativesPage.btnCreativesBulkEditSave.isEnabled());
    }

    @Then("^Creatives details saved$")
    public void creativesDetailsSaved()     {
        Assert.assertEquals("Creatives details not saved",
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div/button"),2);
     //   Assert.assertEquals("Creatives details not saved",
       //         getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div/div/button"),0);

    }


    @When("^Bulk edit AD Server Placements and Classification$")
    public void bulkEditADServerPlacementsAndClassification()  {
      creativesPage.BulkEditCreatives();
    }

    @And("^The Creative Name is a deeplink$")
    public void theCreativeNameIsADeeplink()    {
        Assert.assertTrue("The Creative Name is a not deeplink",
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/div/a")
                        > 0 &&
                        !getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/div/a")
                                .get(0).getAttribute("href").equals(""));

    }

    @When("^Click on the Creative Name$")
    public void clickOnTheCreativeName()     {
        mouseClick(getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/div/a").get(0));
    }


    @And("^Navigate to Manage Advanced Mappings$")
    public void navigateToManageAdvancedMappings()   {
     mouseClick(creativesPage.btnManageAdvancedMapping);
    }

    @Then("^Manage Advanced Mappings screen shown$")
    public void manageAdvancedMappingsScreenShown()   {
        GeneralUtilites.wait(2);
       Assert.assertTrue("Manage Advanced Mappings screen not shown",
               creativesPage.lblManageAdvancedMapping.isDisplayed() &&
               creativesPage.lblManageAdvancedMapping.getText().equals("Manage Advanced Mappings"));
    }

    @When("^Open \"([^\"]*)\" date pop up$")
    public void openDatePopUp(String txtField)   {
        if ("From Date".equals(txtField)) {
            this.DateOnTextField = creativesPage.txtDeliveryDataRangeFromDate.getAttribute("value");
            mouseClick(creativesPage.txtDeliveryDataRangeFromDate);
        }
        else if("To Date".equals(txtField)){
            this.DateOnTextField = creativesPage.txtDeliveryDataRangeToDate.getAttribute("value");
            mouseClick(creativesPage.txtDeliveryDataRangeToDate);
        }
    }

    @Then("^Date popup shown with the selected date$")
    public void datePopupShownWithTheSelectedDate()   {
        GeneralUtilites.wait(1);
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd MMMM yyyy");
        DateTime dateTextBoxDate = formatter.parseDateTime(this.DateOnTextField);

        String day = creativesPage.txtPopupDate.getText();
        String monthYear = creativesPage.txtPopupMonthYear.getText();
        DateTime datePopUpDate = formatter.parseDateTime(day + " " +monthYear);
        mouseClick(creativesPage.btnPopupOk);
        GeneralUtilites.wait(1);
        Assert.assertEquals("",dateTextBoxDate,datePopUpDate);
    }

    @When("^Navigate to Creatives tab$")
    public void clickOnCreatives()   {
        mouseClick(creativesPage.btnCreatives);
        if (creativesPage.txtAdvertiserAccount.isDisplayed()) {
            GeneralUtilites.wait(1);
            creativesPage.txtAdvertiserAccount.sendKeys("EasyJet UK (SMRS - TEL)");
            GeneralUtilites.wait(1);
            mouseClick(getElements("/html/body/div/div/div[2]/section/div[2]/form/div[1]/div/ul").get(0));
            GeneralUtilites.wait(1);
            creativesPage.btnOK.click();
            // creativesPage.changeAdvertiserOnCreativeTab("EasyJet UK (SMRS-TEL)");
        }
    }

    @When("^I view the Unmapped DSP Creatives Table$")
    public void iViewTheUnmappedDSPCreativesTable()   {
        mouseClick(creativesPage.txtDeliveryDataRangeFromDate);
        mouseClick(getElement("/html/body/div/div/div[2]/section/div/div/div/span/div/div[2]/div[1]/span"));
        mouseClick(creativesPage.btnPopupOk);
        GeneralUtilites.wait(1);
        mouseClick(creativesPage.btnManageAdvMappingApplyFilters);

    }

    @Then("^I am able to select a creative - click on text data$")
    public void iAmAbleToSelectACreativeClickOnTextData()  {
        GeneralUtilites.wait(1);
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[1]"));
    }

    @And("^drag the single creative to the Ad server placements list$")
    public void dragTheSingleCreativeToTheAdServerPlacementsList()  {
        GeneralUtilites.wait(10);
       //  if(creativesPage.chbxMissingMapping.getAttribute("class").contains("checked"))
       //     mouseClick(creativesPage.chbxMissingMapping);


       creativesPage.dragAndDrop();
    }

    @Then("^I am able to drop and link the creative to a placement which does not have any Creative mappings$")
    public void iAmAbleToDropAndLinkTheCreativeToAPlacementWhichDoesNotHaveAnyCreativeMappings()  {
        System.out.println("Drag and drop count : " +
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div"));
        Assert.assertTrue("I am unable to drop and link the creative to a placement which does not have any Creative mappings",
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div")
                        >= 1);
    }

    @Then("^I am able to drop and link the creative to a placement which already has DSP creatives mapped$")
    public void iAmAbleToDropAndLinkTheCreativeToAPlacementWhichAlreadyHasDSPCreativeSMapped() {
        System.out.println("Drag and drop count : " +
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div"));
    }

    @And("^Advance Mapping Save button and Cancel button displayed$")
    public void advanceMappingSaveButtonAndCancelButton()  {
         Assert.assertTrue("Advance Mapping Save button and Cancel button",
                 creativesPage.btnSaveAdvancedMapping.isDisplayed()
                      && creativesPage.btnCancelAdvancedMapping.isDisplayed());
    }

    @When("^Click on Advance Mapping Save button$")
    public void clickOnAdvanceMappingSaveButton()   {
         AdServerPlacementsCount =  getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div");
         mouseClick(creativesPage.btnSaveAdvancedMapping);
         GeneralUtilites.wait(1);
    }

    @Then("^the Ad server is removed for the 'Missing Mapping' list$")
    public void theAdServerIsRemovedForTheMissingMappingList()  {
        mouseClick(creativesPage.chbxMissingMapping);
        if(!creativesPage.chbxMissingMapping.getAttribute("class").contains("checked"))
            mouseClick(creativesPage.chbxMissingMapping);
        Assert.assertEquals("the Ad server is removed for the Missing Mapping list",
                AdServerPlacementsCount -1 ,
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div"));
    }

    @When("^Click on Advance Mapping Cancel button$")
    public void clickOnAdvanceMappingCancelButton()  {
        AdServerPlacementsCount =  getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div");
        mouseClick(creativesPage.btnCancelAdvancedMapping);
        GeneralUtilites.wait(2);
    }

    @Then("^the Ad server is not removed for the 'Missing Mapping' list$")
    public void theAdServerIsNotRemovedForTheMissingMappingList()  {
        mouseClick(creativesPage.chbxMissingMapping);
        GeneralUtilites.wait(10);
        if(!creativesPage.chbxMissingMapping.getAttribute("class").contains("checked"))
            mouseClick(creativesPage.chbxMissingMapping);
        Assert.assertEquals("the Ad server is removed for the Missing Mapping list",
                AdServerPlacementsCount ,
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div"));
    }

    @Then("^Unmapped DSP Creatives table shown on the left hand side$")
    public void unmappedDSPCreativesTableShownOnTheLeftHandSide()   {
        Assert.assertTrue("Unmapped DSP Creatives Tables not shown ",
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div") >0);

    }

    @And("^there is a counter - number of creatives in the list$")
    public void thereIsACounterNumberOfCreativesInTheList()   {
      GeneralUtilites.wait(1);
        Assert.assertTrue("no counter shown",
        Integer.parseInt( creativesPage.lblUnmappedDSPCreatives.getText()
                .split("\\(")[1].split("\\)")[0] ) >= 1);
    }

    @And("^the following column data is displayed in Unmapped DSP Creatives table$")
    public void theFollowingColumnDataIsDisplayedInUnmappedDSPCreativesTable()   {
        Assert.assertTrue("expected columns are not displayed in Unmapped DSP Creatives table",
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[1]//div") == 5
                  &&  getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[1]//label") == 3
                  && getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[1]//button") == 2);
    }

    @When("^Click on Delivery Data Range - creatives and placements icon$")
    public void clickOnDeliveryDataRangeCreativesAndPlacementsIcon()  {
         mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div[1]/span"));
    }

    @Then("^a pop is displayed showing the delivery dates in the correct format$")
    public void aPopIsDisplayedShowingTheDeliveryDatesInTheCorrectFormat()  {
        GeneralUtilites.wait(2);
        Assert.assertTrue(" popup not displayed showing the delivery dates in the correct format",
        getElementCount("/html/body/div/div/div[2]/section/div[2]/div/div/div") > 1);
        mouseClick(getElement("/html/body/div/div/div[2]/section/div[2]/div/div//button"));
    }

    @And("^Dates are defaults the last two weeks$")
    public void datesAreDefaultsTheLastTwoWeeks()   {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd MMMM yyyy");
        DateTime dateFromDate = formatter.parseDateTime(creativesPage.txtDeliveryDataRangeFromDate.getAttribute("value"));
        DateTime dateToDate = formatter.parseDateTime(creativesPage.txtDeliveryDataRangeToDate.getAttribute("value"));

        Assert.assertEquals("Dates are defaults the last two weeks",dateToDate.plusDays(1).toLocalDate(),DateTime.now().toLocalDate());
        Assert.assertEquals("Dates are defaults the last two weeks",dateFromDate.plusDays(14).toLocalDate(),DateTime.now().toLocalDate());
    }

    @And("^Tooltips shown on mouseover on Delivery Data Range$")
    public void tooltipsShownOnMouseoverOnDeliveryDataRange()   {
        Assert.assertTrue("Tooltips not shown on mouseover on tag icon 'View creative tag and image'",
                creativesPage.checkForToolTipOnDelivetyDataRange());
    }

    @And("^there is an Ad Server Placement listed$")
    public void thereIsAnAdServerPlacementListed()   {
        if(creativesPage.chbxMissingMapping.getAttribute("class").contains("checked"))
            mouseClick(creativesPage.chbxMissingMapping);
        Assert.assertTrue("No Ad Server Placement listed",
              getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div") > 0);
    }

    @And("^there is an option to expand next to the Ad Server Placement Name$")
    public void thereIsAnOptionToExpandNextToTheAdServerPlacementName()   {
        Assert.assertTrue("an option to expand next to the Ad Server Placement Name does not exist",
                creativesPage.btnExpand.isDisplayed());
    }

    @When("^I select the expand option next to the Ad Server Placement Name$")
    public void iSelectTheExpandOptionNextToTheAdServerPlacementName()   {
        mouseClick(creativesPage.btnExpand);
    }

    @Then("^a section loads to display any DSP creatives which are mapped to the Ad Server Placement$")
    public void aSectionLoadsToDisplayAnyDSPCreativesWhichAreMappedToTheAdServerPlacement()  {
        mouseClick( getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div//i").get(0));
    }

    @And("^i can see the following data next to each Creative and is in line for the Ad server Placement data$")
    public void iCanSeeTheFollowingDataNextToEachCreativeAndIsInLineForTheAdServerPlacementData()   {
    Assert.assertTrue("i can't see the following data next to each Creative and is in line for the Ad server Placement data",
            getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div") >= 4 );
    }

    @Then("^there is an option to filter mappings based on platforms$")
    public void thereIsAnOptionToFilterMappingsBasedOnPlatforms()   {
       Assert.assertTrue("option to filter mappings based on platforms does not exist",
               creativesPage.lstAdServerPlatformList.isDisplayed());
    }

    @And("^Able to select a platform from the dropdown$")
    public void ableToSelectAPlatformFromTheDropdown()  {
        Assert.assertTrue ("Unable to select a platform from the dropdown",
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/ul/li") >0);
        mouseClick(creativesPage.lstAdServerPlatformList);
        mouseClick(getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/ul/li").get(0));
        GeneralUtilites.wait(1);
        Assert.assertNotEquals("platforms dropdown not selected",
                creativesPage.lstAdServerPlatformList.getAttribute("value"),"");
    }

    @And("^platforms dropdown default to ALL platforms$")
    public void platformsDropdownDefaultToALLPlatforms()   {
        GeneralUtilites.wait(2);
        Assert.assertEquals("platforms dropdown is not default to ALL platforms",
                creativesPage.lstAdServerPlatformList.getAttribute("value"),"");
    }

    @And("^there is a back button enabled on advanced mapping screen$")
    public void thereIsABackButtonEnabledOnAdvancedMappingScreen() {
        Assert.assertTrue("there is a back button disabled on advanced mapping screen",
                creativesPage.btnBackManageAdvancedMapping.isDisplayed());
    }

    @When("^I select the back button on advanced mapping screen$")
    public void iSelectTheBackButtonOnAdvancedMappingScreen()   {
        GeneralUtilites.wait(2);
        mouseClick(creativesPage.btnBackManageAdvancedMapping);
    }

    @Then("^there is a notification for the user to discard changes or cancel going back$")
    public void thereIsANotificationForTheUserToDiscardChangesOrCancelGoingBack() {
        GeneralUtilites.wait(2);
        Assert.assertTrue("no notification for the user to discard changes or cancel going back",
                getElementCount("/html/body//div/div[2]/section/div[2]/div[2]/button") > 1);
    }

    @When("^Select the discard option$")
    public void selectTheDiscardOption()  {
         mouseClick(getElement("/html/body//div/div[2]/section/div[2]/div[2]/button[1]"));
    }

    @When("^Select the cancel option$")
    public void selectTheCancelOption()  {
        mouseClick(getElement("/html/body//div/div[2]/section/div[2]/div[2]/button[2]"));
    }

    @Then("^the user is sent back to the Advanced Mapping Screen to save changes$")
    public void theUserIsSentBackToTheAdvancedMappingScreenToSaveChanges()     {
        GeneralUtilites.wait(2);
        Assert.assertTrue("Manage Advanced Mappings screen not shown",
                creativesPage.lblManageAdvancedMapping.isDisplayed() &&
                        creativesPage.lblManageAdvancedMapping.getText().equals("Manage Advanced Mappings"));
    }


    @When("^I select to 'copy' the creative name into the ad server placement search field$")
    public void iSelectToCopyTheCreativeNameIntoTheAdServerPlacementSearchField()   {
    mouseClick( getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[1]/button[1]"));
    }

    @Then("^the 'Missing Mapping' box is unticked$")
    public void theMissingMappingBoxIsUnticked() {
     Assert.assertFalse("the 'Missing Mapping' box is not unticked",
             creativesPage.chbxMissingMapping.getAttribute("class").contains("checked"));
    }

    @When("^carry out a generic search in the Ad Server Placement search field$")
    public void carryOutAGenericSearchInTheAdServerPlacementSearchField()     {
       enterText( creativesPage.txtAdServerPlatformSearch,"aaaa");
    }

    @Then("^the 'Missing Mapping' box is ticked$")
    public void theMissingMappingBoxIsTicked()  {
        Assert.assertTrue("the 'Missing Mapping' box is not ticked",
                creativesPage.chbxMissingMapping.getAttribute("class").contains("checked"));
    }

    @Then("^highlight the Creative Card/Name$")
    public void highlightTheCreativeCardName()     {
        GeneralUtilites.wait(1);

      Assert.assertTrue("the Creative Card/Name not highlight",
      getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[1]/div[2]").
      getAttribute("class").contains("highlighted"));
    }

    @When("^clear the ad server placements search box$")
    public void clearTheAdServerPlacementsSearchBox()     {
     typeText(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/input"),"ss" );
        GeneralUtilites.wait(2);
    }

    @Then("^Unhighlight the Creative Card/Name$")
    public void unhighlightTheCreativeCardName()     {
        Assert.assertFalse("the Creative Card/Name highlight after clearing the search text",
                getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[1]/div[2]").
                        getAttribute("class").contains("highlighted"));
    }
}

