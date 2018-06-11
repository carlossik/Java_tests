package runner;

import cucumber.api.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import static junit.framework.TestCase.assertTrue;
import com.github.mkolisnyk.cucumber.runner.ReportRunner;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedParallelCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;


//@RunWith(E.class)
@RunWith(ExtendedCucumber.class)
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
        plugin = { "html:target/cucumber-reports/cucumber-html-report",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "pretty:target/cucumber-reports/cucumber-pretty.txt",
                "usage:target/cucumber-reports/cucumber-usage.json",
                "junit:target/cucumber-reports/cucumber-results.xml" },
        glue = {"StepDefination"},
        tags = { "~@ignore" })
@ExtendedCucumberOptions(
        jsonReport = "target/cucumber-reports/CucumberTestReport.json",
       // retryCount = 0,
      //  threadsCount = 1,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        overviewChartsReport = true,
        //coverageReport = true,
        jsonUsageReport = "target/cucumber-reports/cucumber-usage.json",
       // usageReport = false,
      //  toPDF = false,
        excludeCoverageTags = {"@flaky" },
        includeCoverageTags = {"@passed" },
        outputFolder = "target/reports")
public class RunCucumberTest1     {

        @Test
        public void testMe() {
                assertTrue(true);
        }
}
