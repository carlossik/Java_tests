package runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


//@RunWith(E.class)
@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"./src/test/resources/Rerun/"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-html-report",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt",
                "junit:target/cucumber-junit-report/cucumbertestreport.xml"
        },
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report_Rerun.html"},
        glue = {"StepDefination"},
        tags = { "~@ignore" })

public class RunCucumberTest3 {
    @AfterClass
    public static void teardown() {
        // Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 10");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}

