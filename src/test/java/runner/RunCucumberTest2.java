package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.cucumber.listener.Reporter;
import org.junit.runner.RunWith;
import org.junit.AfterClass;
import java.io.File;

//@RunWith(E.class)
@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"./src/test/resources/features/"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-html-report",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt",
                "junit:target/cucumber-junit-report/cucumbertestreport.xml"
        },
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
        glue = {"StepDefination"},
        tags = { "~@ignore" })

public class RunCucumberTest2 {
    @AfterClass
    public static void teardown() {
        // Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 10");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}

