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
        System.out.println(" Open the browser \n");
        GeneralUtilites.KillProcesses();
    }

    @After
    public void TearDownTest()
    {
        browserFactory.closeAllDrivers();
        System.out.println("Close the browser \n");
    }
}
