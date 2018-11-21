package StepDefination;

import DataModels.ReportingAPIResponse;
import PageObjects.*;
import SupportingUtilites.BrowserFactory;

import java.util.List;
import java.util.Properties;
import java.io.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.Assert;
import SupportingUtilites.*;
import org.openqa.selenium.WebElement;

public class ProteusWebAdvertiserSteps extends BrowserFactory {
    private BrowserFactory browserFactory;

    private ProteusWebCampaignsPage campaignsPage;

    private ProteusWebAdvertiserAccountsPage advertiserAccountsPage;
    private AdminSecurityGroupsPage adminSecurityGroupsPage;
    private ProteusWebAdminPage adminPage;
    private ReportingAPIResponse objResponse;
    private Properties prop = new Properties();
    private InputStream input = null;
    private String AdvertiserMerger;
    private String MergedAdvertiser;
    private String AdvertiserNameBeforeEdit;
    private String AdvertiserNameAfterEdit;
    private static String currentPath = System.getProperty("user.dir");

    public ProteusWebAdvertiserSteps() {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
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
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        advertiserAccountsPage = new ProteusWebAdvertiserAccountsPage(this.browserFactory);
        adminSecurityGroupsPage = new AdminSecurityGroupsPage(this.browserFactory);
        adminPage = new ProteusWebAdminPage(this.browserFactory);
    }

    @Then("^No flights returned and message displayed$")
    public void noFlightsReturnedAndMessageDisplayed()  {
        Assert.assertTrue("Flights returned and message not displayed",
                campaignsPage.CheckForNoFlightsMatchingForSearch());
    }

    @When("^I select a First Advertiser Account$")
    public void iSelectAAdvertiserAccountRow()  {
        advertiserAccountsPage.SelectFirstAdvertiserRow();
    }

    @Then("^Advertiser Account Overview screen shown$")
    public void advertiserAccountOverviewScreenShown()  {
        GeneralUtilites.wait(1);
        Assert.assertTrue("Advertiser Account Overview screen not shown",advertiserAccountsPage.txtAdvertiserName.isDisplayed());
        GeneralUtilites.wait(1);
        mouseClick(advertiserAccountsPage.btnBack);
    }

    @When("^Search for a Advertiser Name \"([^\"]*)\"$")
    public void searchForAAdvertiserName(String strSearchKey)  {
        advertiserAccountsPage.SearchForOnAdvertiserPage(strSearchKey);
    }

    @And("^Advertiser Account details displayed on the page$")
    public void advertiserAccountDetailsDisplayedOnThePage()  {
        Assert.assertTrue( "Advertiser Account details not displayed on the page",
                advertiserAccountsPage.CheckForAdvertiserAccountDetails());
        if(advertiserAccountsPage.btnBack.isDisplayed())
            mouseClick(advertiserAccountsPage.btnBack);
    }

    @And("^Option to Merge advertiser account into another exist$")
    public void optionToMergeAdvertiserAccountIntoAnotherExist()  {
        GeneralUtilites.wait(1);
        Assert.assertTrue( "Option to Merge advertiser account into another doesn't exist",
                advertiserAccountsPage.CheckForMergeAdvertiserAccount());
        GeneralUtilites.wait(1);
        if(advertiserAccountsPage.btnBack.isDisplayed())
            mouseClick(advertiserAccountsPage.btnBack);
    }

    @When("^Click on Merge Into Another Advertiser Account$")
    public void clickOnMergeIntoAnotherAdvertiserAccount()  {
        GeneralUtilites.wait(1);
        mouseClick(advertiserAccountsPage.btnMergeAdvertiser);
    }

    @Then("^Option to select Advertiser and confirm merge message shown$")
    public void optionToSelectAdvertiserAndConfirmMergeMessageShown()  {
        GeneralUtilites.wait(2);
        Assert.assertTrue( "Option to select Advertiser and confirm merge message not shown",
                advertiserAccountsPage.CheckForMergeObjectsOnDialog());
    }

    @Then("^Advertiser Platform details shown$")
    public void advertiserPlatformDetailsShown()  {
        GeneralUtilites.wait(2);
        Assert.assertTrue( "Advertiser Platform details not shown",
                advertiserAccountsPage.CheckForAdvertiserPlatformDetails());
    }

    @Then("^Tooltip with Platform Name and Platform External ID shown on mouseover on icon$")
    public void tooltipWithPlatformNameAndPlatformExternalIDShownOnMouseoverOnIcon()  {
        GeneralUtilites.wait(2);
        Assert.assertTrue( "Tooltip with Platform Name and Platform External ID not shown on mouseover on icon",
                advertiserAccountsPage.CheckForAdvertiserPlatformToolTip());
    }

    @Then("^Advertiser Platforms tab opened on clicking Platform icon$")
    public void advertiserPlatformsTabOpenedOnClickingPlatformIcon()  {
        GeneralUtilites.wait(2);
        Assert.assertTrue( "Advertiser Platforms tab not opened on clicking Platform icon",
                advertiserAccountsPage.CheckForAdvertiserPlatformTab());
    }

    @When("^Search for an Advertiser to Merge$")
    public void searchForAnAdvertiserToMerge()  {
        this.AdvertiserMerger = GeneralUtilites.getAdvertiserNameDB("NoAgency");
        advertiserAccountsPage.SearchForAdvertiser(this.AdvertiserMerger);
        GeneralUtilites.wait(2);
    }

    @And("^Select the Advertiser to be merged and Save$")
    public void selectTheAdvertiserToBeMergedAndSave(){
       this.MergedAdvertiser = advertiserAccountsPage.SelectAdvertiserToMerge();
        GeneralUtilites.wait(1);
    }

    @Then("^Second Advertiser details page shown$")
    public void secondAdvertiserDetailsPageShown(){
        GeneralUtilites.wait(1);
       Assert.assertTrue("Second Advertiser details page not shown", this.MergedAdvertiser.toLowerCase().contains(advertiserAccountsPage.txtAdvertiserName.getAttribute("value").toLowerCase()));
       mouseClick(advertiserAccountsPage.btnBack);
    }

    @When("^Search for Advertiser one merged$")
    public void searchForAdvertiserOneMerged() {
        advertiserAccountsPage.SearchForOnAdvertiserPage(this.AdvertiserMerger);
    }

    @Then("^No Advertisers returned$")
    public void noAdvertisersReturned()  {
        Assert.assertTrue("Advertiser Still exist after Merge", advertiserAccountsPage.CheckForNoAdvertiserMatched());
    }

    @When("^Search for Advertiser two merged$")
    public void searchForAdvertiserTwoMerged()  {
        advertiserAccountsPage.SearchForOnAdvertiserPage(this.MergedAdvertiser);
    }


    @Then("^Advertisers filtered as per search key \"([^\"]*)\"$")
    public void advertisersFilteredAsPerSearchKey(String strSearchKey)   {
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
        this.MergedAdvertiser = advertiserAccountsPage.SelectAdvertiserToMergeAndCancel();
        GeneralUtilites.wait(1);
    }

    @Then("^First Advertiser details page shown$")
    public void firstAdvertiserDetailsPageShown()   {
        Assert.assertTrue("First Advertiser details page not shown", advertiserAccountsPage.txtAdvertiserName.getAttribute("value").toLowerCase().contains(this.AdvertiserMerger.toLowerCase().replace("_"," ")));
        mouseClick(advertiserAccountsPage.btnBack);
    }

    @When("^Click on edit icon to change advertiser information$")
    public void clickOnEditIconToChangeAdvertiserInformation()  {
        mouseClick(advertiserAccountsPage.btnEditAdvertiserDetails);
    }

    @And("^Update Advertiser, Agency Name and save the details$")
    public void updateAdvertiserAgencyNameAndSaveTheDetails()  {
        this.AdvertiserNameAfterEdit = "EditedAdvertiser" + GeneralUtilites.RandomNumber(1000,9999);
        advertiserAccountsPage.EditAdvertiserName(this.AdvertiserNameAfterEdit,true);
    }

    @And("^Update Advertiser and save the details$")
    public void updateAdvertiserAndSaveTheDetails() throws Throwable {
        this.AdvertiserNameAfterEdit = "EditedAdvertiser" + GeneralUtilites.RandomNumber(1000,9999);
        advertiserAccountsPage.EditAdvertiserName(this.AdvertiserNameAfterEdit,false);
    }

    @When("^Search for an Advertiser to EditName$")
    public void searchForAnAdvertiserToEditName()  {
        this.AdvertiserNameBeforeEdit = GeneralUtilites.getAdvertiserNameDB("EditName");
        advertiserAccountsPage.SearchForAdvertiser(this.AdvertiserNameBeforeEdit);
        GeneralUtilites.wait(2);
    }

    @When("^Search for Advertiser before edit name$")
    public void searchForAdvertiserBeforeEditName()   {
        advertiserAccountsPage.SearchForAdvertiser(this.AdvertiserNameBeforeEdit);
        GeneralUtilites.wait(2);
    }

    @When("^Search for Advertiser with updated name$")
    public void searchForAdvertiserWithUpdatedName()   {

        advertiserAccountsPage.SearchForAdvertiser(this.AdvertiserNameAfterEdit);
        GeneralUtilites.wait(2);
    }

    @When("^Search based on Requires action$")
    public void searchBasedOnRequiresAction()  {

        advertiserAccountsPage.SearchForAdvertiserByRequiresAction();
        GeneralUtilites.wait(2);
    }

    @Then("^Advertisers filtered as per Requires action$")
    public void advertisersFilteredAsPerRequiresAction()  {

        Assert.assertTrue("Advertisers not filtered as per Requires action", advertiserAccountsPage.CheckForAdvertiserRequiresActions());
    }

    @And("^Click on bulk edit$")
    public void clickOnBulkEdit()   {
        mouseClick(advertiserAccountsPage.btnBulkEdit);
    }

    @And("^Edit two or more Advertiser, Agency details and Save$")
    public void editTwoOrMoreAdvertiserAgencyDetailsAndSave()  {
        advertiserAccountsPage.BulkEditAdvertiserAgency();
    }

    @Then("^Bulk edit saved successfuly$")
    public void bulkEditSavedSuccessfuly()  {
        Assert.assertTrue("Bulk edit not saved successfuly", advertiserAccountsPage.CheckForAdvertiserRequiresActions());
    }

    @Then("^Able to navigate to Administration Security Groups$")
    public void ableToNavigateToAdministrationSecurityGroups() throws Throwable {
      Assert.assertTrue("Unable to navigate to Administration Security Groups",  adminSecurityGroupsPage.lblSecurityGroups.isDisplayed());
    }

    @When("^I click on Security Groups tab$")
    public void iClickOnSecurityGroupsTab() throws Throwable {
        mouseClick( adminPage.btnSecurityGroups);
    }

    @And("^Users column shown in the grid and it is numeric$")
    public void usersColumnShownInTheGridAndItIsNumeric() throws Throwable {
      Assert.assertTrue("Users column not shown in the grid and it is numeric",
               getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[3]/div") > 0);
      Assert.assertTrue("Users column  shown in the grid and it is not numeric", GeneralUtilites.isNumeric( getElements("//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[3]/div").get(0).getText()));
    }

    @When("^Clicked on the Users number$")
    public void clickedOnTheUsersNumber() throws Throwable {
        mouseClick(getElements("//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div[3]/div").get(0));
        GeneralUtilites.wait(2);
    }

    @Then("^Popup shown with Users who have access to group$")
    public void popupShownWithUsersWhoHaveAccessToGroup() throws Throwable {
        Assert.assertTrue("Popup not shown with Users who have access to group",
        getElementCount("/html/body/div[2]/div/div[2]/section/div[2]/div[1]/div[1]/div/div[2]/div/div") > 0);
    }

    @When("^Search for a key \"([^\"]*)\" on the Users list$")
    public void searchForAKeyOnTheUsersList(String strSearchKey) throws Throwable {
         typeText(adminSecurityGroupsPage.txtUserSearch,strSearchKey);
    }

    @Then("^Users list filtered based on Search Key \"([^\"]*)\"$")
    public boolean usersListFilteredBasedOnSearchKey(String strSearchKey) throws Throwable {
        List<WebElement> users =  getElements("/html/body/div[2]/div/div[2]/section/div[2]/div[1]/div[1]/div/div[2]/div/div/div[1]");
        boolean returnType= true;
        for ( WebElement user : users  ) {
            returnType = returnType &&  user.getText().toLowerCase().contains(strSearchKey.toLowerCase());
        }
        mouseClick(adminSecurityGroupsPage.btnUserCancel);
        GeneralUtilites.wait(1);
        return returnType;
    }

    @When("^Open Edit Security Group screen for one of the groups$")
    public void openEditSecurityGroupScreenForOneOfTheGroups() throws Throwable {
          mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div"));
          GeneralUtilites.wait(1);
    }

    @Then("^Unassigned Advertiser Accounts table shown$")
    public void unassignedAdvertiserAccountsTableShown() throws Throwable {
       Assert.assertTrue("Unassigned Advertiser Accounts table not shown",
               getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/div") > 0);
    }

    @And("^Assigned Advertiser Accounts table shown$")
    public void assignedAdvertiserAccountsTableShown() throws Throwable {
        Assert.assertTrue("Assigned Advertiser Accounts table not shown",
                adminSecurityGroupsPage.lblAssignedAdvetiser.isDisplayed());
    }

    @And("^Count to identify how many Advertiser Accounts are currently assigned is shown$")
    public void countToIdentifyHowManyAdvertiserAccountsAreCurrentlyAssignedIsShown() throws Throwable {
       GeneralUtilites.wait(1);
       String strAssignedAdvertiser  = adminSecurityGroupsPage.lblAssignedAdvetiser.getText();
        Assert.assertTrue("Count to identify how many Advertiser Accounts are currently assigned is not shown",
                Integer.parseInt( adminSecurityGroupsPage.lblAssignedAdvetiser.getText()
                        .split(" " )[0]) >= 1);
    }

    @And("^Advertiser,Agency and Operational Unit columns displayed on the table$")
    public void advertiserAgencyAndOperationalUnitColumnsDisplayedOnTheTable() throws Throwable {
        WebElement headerAssigned = getElement("//*[@id='root']/div/section/div/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]");
        Assert.assertTrue("Advertiser,Agency and Operational Unit columns not displayed on the table",
        headerAssigned.getText().toLowerCase().contains("advertiser") &&
        headerAssigned.getText().toLowerCase().contains("agency") &&
        headerAssigned.getText().toLowerCase().contains("Op. Unit".toLowerCase()));
    }

    @And("^Option search advertiser exist on unassigned account table$")
    public void optionSearchAdvertiserExistOnUnassignedAccountTable() throws Throwable {
        GeneralUtilites.wait(1);
         Assert.assertTrue("Option search advertiser does not exist on unassigned account table",adminSecurityGroupsPage.txtAssignedAdvSearch.isDisplayed());
    }

    @When("^Search for a assigned advertiser \"([^\"]*)\"$")
    public void searchForAAssignedAdvertiser(String strSearchKey) throws Throwable {
       typeText(adminSecurityGroupsPage.txtAssignedAdvSearch,strSearchKey);
       GeneralUtilites.wait(2);
    }

    @Then("^Assigned advertiser list filtered based on search key \"([^\"]*)\"$")
    public void assignedAdvertiserListFilteredBasedOnSearchKey(String strSearchKey) throws Throwable {
        List<WebElement> advs =  getElements("//*[@id='root']//section//div[2]/div/div[2]/div/div/div/div/div[2]/div/div/div[1]");
        boolean returnType= true;
        for ( WebElement adv : advs ) {
            returnType = returnType &&  adv.getText().toLowerCase().contains(strSearchKey.toLowerCase());
        }

        Assert.assertTrue("Assigned advertiser list not filtered based on search key", returnType);
    }

    @Then("^I am able to clear this filter$")
    public void iAmAbleToClearThisFilter() throws Throwable {
        typeText(adminSecurityGroupsPage.txtAssignedAdvSearch,"");
    }

    @And("^the table will go back to listing all Advertiser Accounts assigned$")
    public void theTableWillGoBackToListingAllAdvertiserAccountsAssigned() throws Throwable {
        Assert.assertTrue("the table refreshed listing all Advertiser Accounts assigned",
                getElementCount("//*[@id='root']//section//div[2]/div/div[2]/div/div/div/div/div[2]/div/div/div[1]") > 0);
    }

    @When("^Open Add Security Group screen$")
    public void openAddSecurityGroupScreen() throws Throwable {
       mouseClick( adminSecurityGroupsPage.btnAddSecurityGroups);
       GeneralUtilites.wait(1);
    }

    @And("^Enter the Security Group name$")
    public void enterTheSecurityGroupName() throws Throwable {
        enterText(adminSecurityGroupsPage.txtSecurityGroupsName, "AutomationSecurityGroup" + GeneralUtilites.RandomNumber(100,999));
        mouseClick(adminSecurityGroupsPage.btnSave);
        GeneralUtilites.wait(2);
      //  mouseClick(adminSecurityGroupsPage.btnBack);
    }

    @And("^Search in the Advertiser search field  \"([^\"]*)\"$")
    public void searchInTheAdvertiserSearchField(String strSearchKey) throws Throwable {
        GeneralUtilites.wait(1);
      typeText(adminSecurityGroupsPage.txtUnAssignedAdvSearch,strSearchKey);
      GeneralUtilites.wait(1);
    }

    @Then("^There is a add button next to the Advertiser Account row$")
    public void thereIsAAddButtonNextToTheAdvertiserAccountRow() throws Throwable {
         Assert.assertTrue("There is no add button next to the Advertiser Account row", getElementCount("//*[@id='root']//section//div[1]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/div[4]//button")>0);
    }

    @When("^I select add button next to the Advertiser Account row$")
    public void iSelectAddButtonNextToTheAdvertiserAccountRow() throws Throwable {
       GeneralUtilites.wait(1);
       mouseClick( getElements("//*[@id='root']//section//div[1]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div/div[4]//button").get(0));
       GeneralUtilites.wait(1);
    }

    @Then("^the Advertiser Account moves to the right side table 'Assigned Advertiser Accounts'$")
    public void theAdvertiserAccountMovesToTheRightSideTableAssignedAdvertiserAccounts() throws Throwable {
        Assert.assertTrue("the Advertiser Account not moved to the right side table 'Assigned Advertiser Accounts'",
                getElementCount("//*[@id='root']//section//div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div") ==2);
    }

    @And("^there is a minus button next to the advertiser account row$")
    public void thereIsAMinusButtonNextToTheAdvertiserAccountRow() throws Throwable {
        Assert.assertTrue("there is no minus button next to the advertiser account row",
                getElementCount("//*[@id='root']//section//div[2]/div/div[2]//div/div[4]/div/button") ==2);

    }

    @When("^I select the minus button$")
    public void iSelectTheMinusButton() throws Throwable {
        mouseClick(getElements("//*[@id='root']//section//div[2]/div/div[2]//div/div[4]/div/button").get(0));
        GeneralUtilites.wait(1);
    }

    @Then("^the advertiser account is removed$")
    public void theAdvertiserAccountIsRemoved() throws Throwable {
        Assert.assertTrue("the advertiser account is not removed",
                getElementCount("//*[@id='root']//section//div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div") ==1);
    }

    @When("^Search for a Secuity group$")
    public void searchForASecuityGroup() throws Throwable {
       enterText(adminSecurityGroupsPage.txtSearchSecurityGroups,"Demo");
       mouseClick(adminSecurityGroupsPage.btnApply);
       GeneralUtilites.wait(2);
    }

    @When("^I click on save button after editing advertiser account details$")
    public void iClickOnSaveTheAdvertiserAccountDetailsSavedToSecurityGroup() throws Throwable {
       mouseClick(getElement("//*[@id='root']//section//button[text()='Save']"));
       GeneralUtilites.wait(1);
    }

    @Then("^Changes to Advertiser account details are saved$")
    public void changesToAdvertiserAccountDetailsAreSaved() throws Throwable {
        Assert.assertTrue("Changes to Advertiser account details are not saved",getElementCount("//*[@id='root']//section//button[text()='Save']") ==0 );
    }


    @Then("^Security Group rows shown$")
    public void securityGroupRowsShown() throws Throwable {
         Assert.assertTrue("Security group rows not shown",getElementCount("//*[@id='root']//section//div[2]/div/div/div[2]/div/div") > 1);
    }

    @Then("^Tooltip Security Group name shown on mouseover on name$")
    public void tooltipSecurityGroupNameShownOnMouseoverOnName() throws Throwable {
        List<WebElement> objRows =  getElements("//*[@id='root']//section//div[2]/div/div/div[2]/div/div[1]/div[2]");
        for ( WebElement objRow:objRows) {
             System.out.println( " TExt on Element : " + objRow.getText() );
             Assert.assertEquals("",objRow.getText(),  getToolTip(objRow));
        }


    }
}
