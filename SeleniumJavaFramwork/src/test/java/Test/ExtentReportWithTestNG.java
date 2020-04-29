package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportWithTestNG {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test; 
	WebDriver driver = null;
	@BeforeSuite
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter("extentReport.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	@Test
	public void test1() throws Exception {

		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		driver.get("https://google.com");
		test.pass("Launch Google.com");
		test.log(Status.INFO, "Starting test case");
		test.pass("Navigated to google.com");
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		test.pass("Enter text in Searchbox");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("Enter key");
		// log(Status, details)
		test.log(Status.INFO, "This step shows usage of log(status, details)");

		// info(details)
		test.info("This step shows usage of info(details)");

		// log with snapshot
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		test.addScreenCaptureFromPath("screenshot.png");

	}

	@Test
	public void test2() throws Exception {


		ExtentTest test2 = extent.createTest("My second Test", "Sample description");

		driver.get("https://google.com");
		test2.pass("Launch Google.com");
		test2.log(Status.INFO, "Starting test case");
		test2.pass("Navigated to google.com");
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		test2.pass("Enter text in Searchbox");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test2.pass("Enter key");
		// log(Status, details)
		test2.log(Status.INFO, "This step shows usage of log(status, details)");

		// info(details)
		test2.info("This step shows usage of info(details)");

		// log with snapshot
		test2.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		test2.addScreenCaptureFromPath("screenshot.png");

	}
	@AfterSuite
	public void tearDown() {
		// calling flush writes everything to the log file
		extent.flush();
		driver.close();
		driver.quit();


	}
}
