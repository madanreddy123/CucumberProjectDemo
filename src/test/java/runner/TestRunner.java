package runner;

import com.sogeti.automation.framework.driver.GlobalDriver;
import com.sogeti.automation.framework.utils.Logging;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

@CucumberOptions(
        features = "src/test/resources/Features/",
        glue = "stepdefinitions",
        monochrome = true,
        dryRun = false,
        tags = "@tests",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber-reports/cucumber.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {


}
