package com.Runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Base.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/**
 * @author Gayathri Devi G
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/FeatureFile/FeatureFile.feature",
				glue="com.StepDefnition",
				monochrome = true,dryRun = false, strict = true,
				plugin = { "html:Report/HtmlReport",
						"pretty",
						"json:JansonReport/Report.json",
						"com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html" },
				tags = {"@AcaciumPortal"})
public class Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void SetUp() {
		driver = Base_Class.get_Driver();		
	}
	@AfterClass
	public static void TearDown() {
		//driver.close();
	}
}