 package   StepDefination;

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

public class ProteusWebCampaignsSteps extends BrowserFactory {
    private BrowserFactory browserFactory;
    private ProteusWebCampaignsPage campaignsPage;
    private CampaignsCampaignsPage campaignsCampaignPage;
    private ProteusWebAdvertiserAccountsPage advertiserAccountsPage;
    private AdminSecurityGroupsPage adminSecurityGroupsPage;
    private ProteusWebAdminPage adminPage;
    private ReportingAPIResponse objResponse;
    private Properties prop = new Properties();
    private InputStream input = null;

    private static String currentPath = System.getProperty("user.dir");
    public ProteusWebCampaignsSteps() {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsCampaignPage = new CampaignsCampaignsPage(this.browserFactory);
    }

    public ProteusWebCampaignsSteps(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
        try {
            InputStream input = new FileInputStream(currentPath + "/src/test/java/Resources/config.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        campaignsCampaignPage = new CampaignsCampaignsPage(this.browserFactory);
    }


    @And("^All Campaigns loads which I have access to$")
    public void allCampaignsLoadsWhichIHaveAccessTo() throws Throwable {       
        Assert.assertTrue("All Campaigns not loads which I have access to",campaignsCampaignPage.GetCampaignRowsCount() > 0);
    }

    @And("^There is a section called 'Campaigns'$")
    public void thereIsASectionCalledCampaigns() throws Throwable {
        Assert.assertTrue(" 'Campaigns' section not shown",campaignsCampaignPage.lblCampaignsCount.isDisplayed());
    }

    @And("^I can search by Campaigns Name or Agency Name$")
    public void iCanSearchByCampaignsNameOrAgencyName() throws Throwable {

        Assert.assertTrue("I can't search by  Campaigns Name or Agency",campaignsCampaignPage.CheckSearchByCampaigns() );
    }

    @When("^I search/filter for a particular campaign$")
    public void iSearchFilterForAParticularCampaign() throws Throwable {
        campaignsCampaignPage.EnterSearchFilter("campaign", "", "");
    }

    @Then("^All campaign matching search/filter combination load as results$")
    public void allCampaignMatchingSearchFilterCombinationLoadAsResults() throws Throwable {
        Assert.assertTrue( "All campaign matching search/filter combination are not loaded as results",campaignsCampaignPage.GetCampaignRowsCount()>0 );
    }



    @Then("^No campaign returned and message displayed$")
    public void noCampaignReturnedAndMessageDisplayed() throws Throwable {
        Assert.assertTrue("No campaign returned and message not displayed",campaignsCampaignPage.CheckForNoCampaignMatchingForSearch());
    }

    @Then("^All Campaigns matching campaign \"([^\"]*)\" are filtered$")
    public void allCampaignsMatchingCampaignAreFiltered(String strCampaignName) throws Throwable {
        Assert.assertTrue("All Campaigns matching campaign " + strCampaignName + " are not filtered",campaignsCampaignPage.CheckForCampaignNameForCampaign(strCampaignName));
    }

    @And("^Expand Campaign details$")
    public void expandCampaignDetails() throws Throwable {
       mouseClick( campaignsCampaignPage.btnExpand);
    }

    @And("^Cost Breakdown Details displayed when Campaign is expanded$")
    public void costBreakdownDetailsDisplayedWhenCampaignIsExpanded() throws Throwable {
        Assert.assertTrue("Cost Breakdown Details not displayed when Campaign is expanded",campaignsCampaignPage.CheckForCostBreakdownDetails());
    }

    @And("^MRC Viewability Details displayed when Campaign is expanded$")
    public void mrcViewabilityDetailsDisplayedWhenCampaignIsExpanded() throws Throwable {
        Assert.assertTrue("MRC Viewability Details not displayed when Campaign is expanded",campaignsCampaignPage.CheckForMRCViewabilityDetails());
    }

    @And("^DSP Delivery Details displayed when Campaign is expanded$")
    public void dspDeliveryDetailsDisplayedWhenCampaignIsExpanded() throws Throwable {
        Assert.assertTrue("DSP Delivery Details not displayed when Campaign is expanded",campaignsCampaignPage.CheckForDSPDeliveryDetails());
    }

    @And("^AdServer Delivery Details displayed when Campaign is expanded$")
    public void adserverDeliveryDetailsDisplayedWhenCampaignIsExpanded() throws Throwable {
        Assert.assertTrue("AdServer Delivery Details not displayed when Campaign is expanded",campaignsCampaignPage.CheckForAdServerDeliveryDetails());
    }

    @And("^DSP Delivery details show tooltip when Campaign is expanded$")
    public void dspDeliveryDetailsShowTooltipWhenCampaignIsExpanded() throws Throwable {
        Assert.assertTrue("DSP Data detials tooltip not shown",
                campaignsCampaignPage.CheckForDSPDeliveryDetailsToolTip());
    }

    @When("^Click on arrow Campaign details$")
    public void clickOnArrowCampaignDetails() throws Throwable {
        campaignsCampaignPage.CollaspeCampaignDetails();
    }

    @Then("^Campaign details collapsed$")
    public void campaignDetailsCollapsed() throws Throwable {
       Assert.assertTrue("Campaign details not collapsed" ,campaignsCampaignPage.btnExpand.isDisplayed());
    }

    @When("^I select show decimal places on campaign tab$")
    public void iSelectShowDecimalPlacesOnCampaignTab() throws Throwable {
      campaignsCampaignPage.showDecimalPlaces();
    }

    @Then("^Decimal places shown for amounts on campaign grid$")
    public void decimalPlacesShownForAmountsOnCampaignGrid() throws Throwable {
        Assert.assertTrue("Decimal places not shown for amounts", campaignsCampaignPage.checkForDecimalPlaces());
    }

    @When("^I select hide decimal places on campaign tab$")
    public void iSelectHideDecimalPlacesOnCampaignTab() throws Throwable {
        campaignsCampaignPage.hideDecimalPlaces();
    }

    @Then("^Decimal places not shown for amounts on campaign grid$")
    public void decimalPlacesNotShownForAmountsOnCampaignGrid() throws Throwable {
        Assert.assertFalse("Decimal places shown for amounts", campaignsCampaignPage.checkForDecimalPlaces());
    }

    @When("^Clicked on the Campaign header \"([^\"]*)\"$")
    public void clickedOnTheCampaignHeader(String HeaderName) throws Throwable {
        mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div/*[text()='"+HeaderName+"']"));
        if(HeaderName.equals("Advertiser") ){ //|| HeaderName.equals("End Date") ) {
            GeneralUtilites.wait(2);
            mouseClick(getElement("//*[@id='root']/div/section/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div/*[text()='"+HeaderName+"']"));
        }
        GeneralUtilites.wait(2);
    }

    @Then("^Campaign rows are sorted based on \"([^\"]*)\"$")
    public void campaignRowsAreSortedBasedOn(String HeaderName) throws Throwable {
        Assert.assertTrue("Campaign rows are not sorted based on " + HeaderName,
                campaignsCampaignPage.CheckIfCampaignSortedOn(HeaderName));
    }


    @When("^I click on the creatives icon on Campaign row$")
    public void iClickOnTheCreativesIconOnCampaignRow() throws Throwable {
            mouseClick( campaignsCampaignPage.btnCampaignCreatives);
    }

    @When("^I click on the pixels icon on Campaign row$")
    public void iClickOnThePixelsIconOnCampaignRow() throws Throwable {
        mouseClick( campaignsCampaignPage.btnCampaignPixels);
    }

    @When("^I search/filter for a campaign \"([^\"]*)\" on Campaigns tab$")
    public void iSearchFilterForACampaignOnCampaignsTab(String strCampaignName) throws Throwable {
        campaignsCampaignPage.EnterSearchFilter(strCampaignName, "", "");
    }

    @Then("^Campaign Tab Apply button is enabled$")
    public void applyButtonIsEnabledOnCampaignTab() throws Throwable {
        Assert.assertTrue( "Apply button is not enabled after enter search",campaignsCampaignPage.btnApplyFilters.isEnabled());
    }

    @And("^Campaigns tab click on Apply button$")
    public void clickOnApplyButtonOnCampaignsTab() throws Throwable {
        GeneralUtilites.wait(1);
        mouseClick(getElement("//*[@id='root']//section//div[2]/div/div/div[1]/div/div/div[1]/div/button"));
        GeneralUtilites.wait(1);
        mouseClick(getElement("//*[@id='root']//section//button[text()='APPLY']"));
    }

    @Then("^Campaign tab clear Filters button is enabled$")
    public void clearFiltersButtonIsEnabledOnCampaign() throws Throwable {
        Assert.assertTrue( "Clear Filters button is not enabled after enter search",campaignsCampaignPage.btnClearFilters.isEnabled());
    }

    @And("^Campaigns Tab Filter dropdown fields exist on popup$")
    public void campaignsTabFilterDropdownFieldsExist () throws Throwable {
        Assert.assertTrue( "Filter dropdown fields does not exist",campaignsCampaignPage.CheckFilterExist());
    }

    @And("^Click on ended on campaign tab$")
    public void clickOnEndedOnCampaignTab() throws Throwable {
       mouseClick(campaignsCampaignPage.rdbtnEnded);
       GeneralUtilites.wait(1);
    }

    @And("^There is option to set the filters$")
    public void thereIsOptionToSetTheFilters() throws Throwable {
       Assert.assertTrue("Option to set the filters is not displayed",campaignsCampaignPage.btnFilter.isDisplayed());
    }

    @And("^I can see Clear filter icon on popup$")
    public void iCanSeeClearFilterIconOnPopup() throws Throwable {
        Assert.assertTrue("Option to set the filters is not displayed",campaignsCampaignPage.btnClearFilters.isDisplayed());
    }

    @And("^Campaign column is shown as a link$")
    public void campaignColumnIsShownAsALink() throws Throwable {
         Assert.assertTrue("",getElementCount("//*[@id='root']/div/section//div[6]/div/span") > 0);
    }

    @When("^Clicked on the Campaign name in the table$")
    public void clickedOnTheCampaignNameInTheTable() throws Throwable {
        mouseClick(getElements("//*[@id='root']/div/section//div[6]/div/span").get(0));
    }

    @Then("^Flights tab loaded$")
    public void flightsTabLoaded() throws Throwable {
        campaignsPage = new ProteusWebCampaignsPage(this.browserFactory);
        Assert.assertTrue("Flights tab loaded",campaignsPage.GetFlightRowsCount()> 0);
    }

    @When("^I have selected values in one or more filters$")
    public void iHaveSelectedValuesInOneOrMoreFilters() throws Throwable {
        enterText(campaignsCampaignPage.txtAdvertiser,"TRAVEL - LUXURY");
        enterText(campaignsCampaignPage.txtAgency,"Agency > Business & Industrial 1597");
    }

    @When("^I click on clear filters$")
    public void iClickOnClearFilters() throws Throwable {
       mouseClick(campaignsCampaignPage.btnClearFilters);
    }

    @Then("^The values are cleared on popup$")
    public void theValuesAreClearedOnPopup() throws Throwable {
        Assert.assertTrue("The values are not cleared on popup",
        campaignsCampaignPage.txtAdvertiser.getText().equals("") &&
        campaignsCampaignPage.txtAgency.getText().equals(""));
    }

    @When("^I click on cancel on popup$")
    public void iClickOnCancelOnPopup() throws Throwable {
        mouseClick(campaignsCampaignPage.btnCancelFilters);
    }

    @Then("^Changes are discarded on the popup and popup closed$")
    public void changesAreDiscardedOnThePopupAndPopupClosed() throws Throwable {
        Assert.assertTrue("Popup not closed",
                        campaignsCampaignPage.txtSearch.isDisplayed());
    }
}