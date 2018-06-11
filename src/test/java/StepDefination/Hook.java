package StepDefination;
import SupportingUtilites.BrowserFactory;
import SupportingUtilites.GeneralUtilites;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Hook extends BrowserFactory
{
    private BrowserFactory browserFactory;
    private Properties prop = new Properties();
    private InputStream input = null;
    private static String currentPath = System.getProperty("user.dir");
    public Hook(BrowserFactory browserFactory) {
        this.browserFactory = browserFactory;
    }
    public Hook(){
        try
        {
            InputStream input = new FileInputStream(currentPath + "/src/test/java/Resources/config.properties");
            prop.load(input);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.exit(0);
        }
    }

    @Before
    public void InitializeTest()
    {
        System.out.println("\n Open the browser \n");
      //  startWebDriver(prop.getProperty("Browser"));
       GeneralUtilites.KillProcesses();
    }


    @After
    public void TearDownTest()
    {
     //   stopWebDriver();
           SupportingUtilites.BrowserFactory.closeAllDrivers();
       System.out.println("\n Close the browser \n");
    }
}
