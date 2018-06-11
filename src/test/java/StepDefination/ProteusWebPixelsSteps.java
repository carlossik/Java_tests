package StepDefination;

import PageObjects.*;
import SupportingUtilites.BrowserFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.io.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.Assert;
import SupportingUtilites.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.xhtmlrenderer.util.GeneralUtil;

public class ProteusWebPixelsSteps extends BrowserFactory {
    private BrowserFactory browserFactory;
    private ProteusWebCampaignsPage campaignsPage;
    private ProteusWebPixelsPage pixelsPage;
    private Properties prop = new Properties();
    private InputStream input = null;
    private String AdvertiserAccountNameBeforeEdit;
    private String AdvertiserAccountNameAfterEdit;
    private static String currentPath = System.getProperty("user.dir");

    public ProteusWebPixelsSteps() {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        pixelsPage = new ProteusWebPixelsPage(this.browserFactory);
    }

    public ProteusWebPixelsSteps(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
        try {
            InputStream input = new FileInputStream(currentPath + "/src/test/java/Resources/config.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        pixelsPage = new ProteusWebPixelsPage(this.browserFactory);
    }

    @Then("^Pixels screen opened$")
    public void creativesScreenOpened() {
        Assert.assertTrue("Creatives screen not opened", pixelsPage.lblPixels.isDisplayed());
        GeneralUtilites.wait(1);
        if(pixelsPage.chbxMissingUnclassified.getAttribute("checked").equals("true"))
        {
           // pixelsPage.chbxMissingUnclassified.clear();
            mouseClick(pixelsPage.chbxMissingUnclassifiedClickable);
            mouseClick(pixelsPage.btnPixelsApplyFilters);
            GeneralUtilites.wait(1);
        }
    }

    @Then("^There is a Pixels Icon on the left hand tool bar$")
    public void thereIsAPixelsIconOnTheLeftHandToolBar()   {
        Assert.assertTrue("There is a Pixels Icon on the left hand tool bar", campaignsPage.btnPIXELS.isDisplayed());
    }

    @When("^Click on Pixels icon$")
    public void clickOnPixelsIcon()   {
       mouseClick(campaignsPage.btnPIXELS);

       if(pixelsPage.txtAdvertiserAccount.isDisplayed())
       {
           pixelsPage.txtAdvertiserAccount.click();
           typeText(pixelsPage.txtAdvertiserAccount,"QAAutomationAdvertiser 1 GB");
           mouseClick(getElements("/html/body/div/div/div[2]/section/div[2]/form/div[1]/div/ul").get(0));
           pixelsPage.btnOK.click();
       }
    }

    @And("^Pixels are listed$")
    public void pixelsAreListed()   {
        if(pixelsPage.chbxMissingUnclassified.isSelected())
        {
            mouseClick(pixelsPage.chbxMissingUnclassified);
            mouseClick(pixelsPage.btnPixelsApplyFilters);
            GeneralUtilites.wait(1);
        }
        Assert.assertTrue("Pixels are not listed", pixelsPage.checkForPixelsInGrid());
    }


    @And("^Advertiser Account is labelled as the title of the Page$")
    public void flightsAdvertiserAccountShown()  {
        Assert.assertTrue("Advertiser Account is not labelled as the title of the Page",
                !pixelsPage.lblAdvertiserPixels.getText().toLowerCase().
                        equals(""));
    }

    @And("^Change button shown on the pixel page$")
    public void changeButtonShownOnThePixelPage() {
        Assert.assertTrue("Change button not shown on the pixel page",
                pixelsPage.btnChange.isDisplayed());
    }

    @When("^Click on Pixel Change button$")
    public void clickOnPixelChangeButton() {

     try{
         AdvertiserAccountNameBeforeEdit = pixelsPage.lblAdvertiserPixels.getText();
        mouseClick(pixelsPage.btnChange);
     }
     catch(Exception e)     {
         System.out.println("dffd" + e.getMessage());

     }
    }

    @Then("^Option to change pixel advertiser account exist$")
    public void optionToChangePixelAdvertiserAccountExist()   {
        GeneralUtilites.wait(2);
        Assert.assertTrue("Option to change pixel advertiser account not exist",
                pixelsPage.txtAdvertiserAccount.isDisplayed() &&
                        pixelsPage.btnOK.isDisplayed());
    }

    @When("^I change the pixel advertiser and save$")
    public void iChangeThePixelAdvertiserAndSave()   {
        pixelsPage.txtAdvertiserAccount.click();
        mouseClick(getElements("/html/body/div/div/div[2]/section/div[2]/form/div[1]/div/ul").get(0));
        pixelsPage.btnOK.click();
    }

    @Then("^New advertiser details shown on the pixel page$")
    public void newAdvertiserDetailsShownOnThePixelPage()  {
        GeneralUtilites.wait(1);

        Assert.assertTrue("New advertiser details not shown on the pixel page",
                !pixelsPage.lblAdvertiserPixels.getText().toLowerCase().
                        contains(AdvertiserAccountNameBeforeEdit.toLowerCase()));
    }

    @And("^I don't change the pixel advertiser and save$")
    public void iDonTChangeThePixelAdvertiserAndSave()   {
        GeneralUtilites.wait(1);
      //  pixelsPage.txtAdvertiserAccount.click();
        pixelsPage.btnOK.click();
    }

    @Then("^Advertiser details shown on the pixel page$")
    public void advertiserDetailsShownOnThePixelPage()  {
        Assert.assertTrue("Advertiser details not shown on the pixel page",
                pixelsPage.lblAdvertiserPixels.getText().toLowerCase().
                        contains(AdvertiserAccountNameBeforeEdit.toLowerCase()));
    }

    @When("^I click on the pixels icon on flight row$")
    public void iClickOnThePixelsIconOnFlightRow()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        mouseClick( campaignsPage.btnFlightPixels);
    }

    @And("^There is an icons for Pixels$")
    public void thereIsAnIconsForPixels()   {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Icons for Pixels not shown", campaignsPage.CheckForAdvertiserPixelIcon());

    }

    @And("^Tooltips shown on mouseover on each Pixels icon$")
    public void tooltipsShownOnMouseoverOnEachPixelsIcon()     {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Tooltips not shown on mouseover on each Pixels icon", campaignsPage.CheckForAdvertiserPixelToolTip());

    }

    @And("^Pixels are listed for the Advertiser Account of the Flight selected$")
    public void pixelsAreListedForTheAdvertiserAccountOfTheFlightSelected()     {
        Assert.assertTrue("Pixels are not listed for the Advertiser Account of the Flight selected",pixelsPage.pixelsForAdvertiserListed());
    }

    @And("^Flights Advertiser Account is automatically applied on the Advertiser Account$")
    public void flightsAdvertiserAccountIsAutomaticallyAppliedOnTheAdvertiserAccount()     {
        Assert.assertTrue("Flights Advertiser Account is not automatically applied on the Advertiser Account",
                pixelsPage.lblAdvertiserPixels.getText().toLowerCase().
                        contains("TRAVEL - LU".toLowerCase()));
    }

    @And("^The following column shown in pixel grid$")
    public void theFollowingColumnShownInPixelGrid()     {
        List<String> expectedHeaders = Arrays.asList ("Platform", "Pixel Name","External ID","Category","Type");
        Assert.assertTrue("All the expected columns not shown",
                pixelsPage.checkForPixelColumns(expectedHeaders));
    }

    @When("^I change the pixel advertiser to \"([^\"]*)\" and save$")
    public void iChangeThePixelAdvertiserToAndSave(String AdvertiserName)   {
        mouseClick(pixelsPage.btnChange);
        GeneralUtilites.wait(1);
        if(pixelsPage.txtAdvertiserAccount.isDisplayed())
        {
            pixelsPage.txtAdvertiserAccount.click();
            typeText(pixelsPage.txtAdvertiserAccount,AdvertiserName);
            mouseClick(getElements("/html/body/div/div/div[2]/section/div[2]/form/div[1]/div/ul").get(0));
            pixelsPage.btnOK.click();
            GeneralUtilites.wait(1);
        }
    }

    @And("^There is an action icon on the screen indicating the missing values$")
    public void thereIsAnActionIconOnTheScreenIndicatingTheMissingValues()    {
       Assert.assertTrue("There is no action icon on the screen indicating the missing values",
               getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[5]/div/span") > 0);
    }

    @And("^Tooltips shown on mouseover on each missing icon$")
    public void tooltipsShownOnMouseoverOnEachMissingIcon()     {
            By AdvertiserPixelIcon = By.xpath("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[5]/div/span");
            WebElement webElement = browserFactory.getDriver().findElement(AdvertiserPixelIcon);
            Assert.assertTrue("There is no action icon on the screen indicating the missing values",
                    getToolTip(webElement).toLowerCase().contains("Edit Classification".toLowerCase()));
    }

    @When("^Clicked on the header \"([^\"]*)\"$")
    public void clickedOnTheHeader(String HeaderName)     {
        pixelsPage.SortPixelGridOn(  HeaderName);
    }

    @Then("^Rows are sorted based on \"([^\"]*)\"$")
    public void rowsAreSortedBasedOn(String HeaderName) {
       Assert.assertTrue("Rows are not sorted based on " + HeaderName, pixelsPage.CheckIfPixelsSortedOn(HeaderName));

    }

    @When("^Enter a search key \"([^\"]*)\"and click on Apply$")
    public void enterASearchKeyAndClickOnApply(String SearchKey)  {
     pixelsPage.Search(SearchKey);
    }

    @Then("^Pixels filtered based on the \"([^\"]*)\"$")
    public void pixelsFilteredBasedOnThe(String SearchKey)   {
    Assert.assertTrue("Pixels not filtered based on the key " + SearchKey,
            getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div[contains(.,'"+SearchKey+"')]") > 0);
        //getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div[contains(.,'"+SearchKey+"')]") > 0
        //getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div[not(contains(.,'"+SearchKey+"'))]") == 0

    }

    @Then("^the Pixels list of results is defaulted to 'Missing Classification'$")
    public void thePixelsListOfResultsIsDefaultedToMissingClassification()  {
        Assert.assertEquals("The Pixels list of results is not defaulted to 'Missing Classification'",
                pixelsPage.chbxMissingUnclassified.getAttribute("checked"),"true");
    }

    @And("^Dropdown to filter based on Platforms exist and defaulted to ALL$")
    public void dropdownToFilterBasedOnPlatformsExistAndDefaultedToALL()  {
        Assert.assertTrue("Dropdown to filter based on Platforms does not exist or not defaulted to ALL",
                pixelsPage.cmbPixelsPlatform.isDisplayed() &&
                        pixelsPage.cmbPixelsPlatform.getAttribute("value").equals(""));
    }

    @And("^Pagination shown at the bottom of the page$")
    public void paginationShownAtTheBottomOfThePage()   {
       Assert.assertTrue("Pagination not shown at the bottom of the page",
               getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[2]/ul/li") >=3 );
    }

    @And("^Option to enter search key exist$")
    public void optionToEnterSearchKeyExist() {
        Assert.assertTrue("Option to enter search key does exist",
                pixelsPage.txtPixelsSearch.isDisplayed());
    }

    @When("^I entered search key$")
    public void iEnteredSearchKey()     {
      enterText( pixelsPage.txtPixelsSearch, "SearchKey");
      GeneralUtilites.wait(1);
    }

    @Then("^Clear Filters button enabled$")
    public void clearFiltersButtonEnabled()     {
        Assert.assertTrue("Clear Filters button not enabled",
                pixelsPage.btnPixelClearFilters.isEnabled());
    }

    @And("^Pixel bulk edit button shown on pixel tab$")
    public void pixelBulkEditButtonShownOnPixelTab()     {
        Assert.assertTrue("Pixel bulk edit button not shown on pixel tab",
                pixelsPage.btnPixelsBulkEdit.isDisplayed());
    }

    @And("^Tooltips shown on mouseover on Bulk edit button$")
    public void tooltipsShownOnMouseoverOnBulkEditButton() {
        Assert.assertEquals("Tooltips not shown on mouseover on Bulk edit button",
             getToolTip(pixelsPage.btnPixelsBulkEdit).toLowerCase(),"Edit pixel classification".toLowerCase() );
    }

    @When("^Click on pixel bulk edit$")
    public void clickOnPixelBulkEdit() {
      mouseClick( pixelsPage.btnPixelsBulkEdit);
    }

    @Then("^Pixel grid changed to editable state$")
    public void pixelGridChangedToEditableState()  {
        Assert.assertFalse("Pixel grid not changed to editable state",
                pixelsPage.btnPixelsBulkEdit.isEnabled());
    }

    @And("^Save button shown and is disabled$")
    public void saveButtonShownAndIsDisabled()  {
        Assert.assertTrue("Save button not shown or is it enabled",
                 pixelsPage.btnPixelsBulkSave.isDisplayed() &&
                        !pixelsPage.btnPixelsBulkSave.isEnabled());
    }

    @And("^Cancel button shown and is enabled$")
    public void cancelButtonShownAndIsEnabled() {
        Assert.assertTrue("Cancel button not shown or is it enabled",
                pixelsPage.btnPixelsBulkCancel.isDisplayed() &&
                        pixelsPage.btnPixelsBulkCancel.isEnabled());
    }

    @And("^Editable columns shown on pixel grid$")
    public void editableColumnsShownOnPixelGrid() {
        Assert.assertTrue("Category or Type columns are not editable",
                   getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[4]/div/div/div/input") > 0
                        && getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[5]/div/div/div/input") > 0);
    }

    @And("^ReadOnly columns shown on pixel grid$")
    public void readonlyColumnsShownOnPixelGrid() {
        Assert.assertTrue("ReadOnly columns not shown on pixel grid",
                   getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[3]") > 0
                        && getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[2]") > 0
                        && getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div/div[1]") > 0);
    }

    @Then("^Dropdown list with categories, Hard and Soft$")
    public void dropdownListWithCategoriesHardAndSoft(){
        Assert.assertEquals("Dropdown list with categories(Hard and Soft) not shown",
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div[1]/div[4]/div/div/ul/li"), 2);
    }

    @And("^Dropdown list with Types: Homepage, Confirmation Page, Landing Page$")
    public void dropdownListWithTypesHomepageConfirmationPageLandingPage(){
        Assert.assertEquals("Dropdown list with Types: Homepage, Confirmation Page, Landing Page not shown",
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/div[1]/div[5]/div/div/ul/li"), 17);
    }

    @When("^Bulk edit Category and Type$")
    public void bulkEditCategoryAndType() {
      pixelsPage.BulkEditPxiels();
    }

    @When("^Click on Save$")
    public void clickOnSave()  {
        mouseClick(pixelsPage.btnPixelsBulkSave);
        GeneralUtilites.wait(1);
    }

    @Then("^Save button Enabled$")
    public void saveButtonEnabled()  {
        Assert.assertTrue("Save button not Enabled",
                pixelsPage.btnPixelsBulkSave.isEnabled());
    }

    @Then("^Pixel details saved$")
    public void pixelDetailsSaved() {
        Assert.assertEquals("Pixel details not saved",
                getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div//button"),1);
    }

    @When("^I click on the add icon$")
    public void iClickOnTheAddIcon(){
      if( getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div/div/span") > 0)
        mouseClick( getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div/div/span").get(0));
      else  {
        System.out.println("No add icon shown");
        mouseClick( pixelsPage.btnPixelsBulkEdit);
      }
    }

    @And("^The Pixels Name is a deeplink$")
    public void thePixelsNameIsADeeplink(){
        Assert.assertTrue("The Pixels Name is a not deeplink",
         getElementCount("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/div/a") > 0 &&
                 !getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/div/a").get(0).getAttribute("href").equals(""));

        }

    @When("^Click on the Pixel Name$")
    public void clickOnThePixelName() {
       mouseClick(getElements("//*[@id='root']/div/section/div/div[2]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/div/a").get(0));
    }

    @Then("^DSP tab opened in the browser for the Advertiser$")
    public void dspTabOpenedInTheBrowserForTheAdvertiser() {
       GeneralUtilites.CheckBrowserTabs(this.browserFactory.getDriver());
    }

}