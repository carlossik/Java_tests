package StepDefination;
import SupportingUtilites.BrowserFactory;
import SupportingUtilites.GeneralUtilites;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BrowserFactory
{
    private BrowserFactory browserFactory;
    public Hook(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
    }
    public Hook(){}

    @Before
    public void InitializeTest()
    {
        System.out.println("\n Open the browser \n");
        GeneralUtilites.KillProcesses();
    }

    @After
    public void TearDownTest()
    {
       SupportingUtilites.BrowserFactory.closeAllDrivers();
       System.out.println("\n Close the browser \n");
    }
}
