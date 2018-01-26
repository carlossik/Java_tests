package SupportingUtilites;

import  org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.remote.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.lang.*;

public class BrowserFactory {
    public static   Map <String, WebDriver> Drivers = new HashMap <String, WebDriver>();
    public static WebDriver driver;
    static String currentPath = System.getProperty("user.dir");

    public WebDriver getDriver()
    {
      return  driver;
    }
    public static void setDriver(WebDriver value)
    {
        driver = value;
    }

    /***************************************************/
    public static WebDriver initBrowser(String strBrowserName)
    {
        //Get the Libraries Path
        String librariespath = currentPath + "/src/test/java/Libraries/" ;

        //Launch the Browser based on the Browser name
        switch (strBrowserName)
        {
            case "Firefox":
                if (driver == null)
                {
                    driver = new FirefoxDriver();
                    Drivers.put("Firefox", driver);
                }
                break;

            case "IE":
                if (driver == null)
                {
                    InternetExplorerOptions options = new InternetExplorerOptions();
                    options.enableNativeEvents();
                    options.introduceFlakinessByIgnoringSecurityDomains();
                    System.setProperty("webdriver.ie.driver", librariespath);
                    driver = new InternetExplorerDriver(options);
                    Drivers.put("IE", driver);
                }
                break;
            case "Chrome":
                if (driver == null)
                {
                    ChromeOptions options = new ChromeOptions();
                    String strOptions = "user-data-dir=C:\\Users\\" +  "ramchander.telu"  + "\\AppData\\Local\\Google\\Chrome\\User Data";
                    options.addArguments(strOptions);
                    options.addArguments("no-sandbox");
                    System.setProperty("webdriver.chrome.driver", librariespath+ "chromedriver.exe");
                   // driver = new ChromeDriver(options);
                    driver = new ChromeDriver();
                    //driver = new ChromeDriver(librariespath,options);
                    Drivers.put("Chrome", driver);
                }
                break;
            case "Headless":
                if (driver == null)
                {
                    driver = new RemoteWebDriver(DesiredCapabilities.htmlUnit());
                    Drivers.put("Headless", driver);
                }
                break;
        }

        //Set the Timeouts
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.switchTo().defaultContent();
        //Return the Driver
        return driver;
    }

    public static void loadApplication(String strUrl)
    {
        //Load the URL
        driver.navigate().to(strUrl);
    }

    public static void closeAllDrivers()
    {
        //Loop through and Close all the browsers

        for (String key: Drivers.keySet())
        {
            Drivers.get(key).close();
            Drivers.get(key).quit();
        }

        Drivers.clear();
        driver = null;
    }
}

