package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasicDemo {
	private static WebDriver driver = null;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter htmtReport = new ExtentHtmlReporter("extentReport.html");
		//create ExtentReports and attach report(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmtReport);
		
		//creates a toggle for given test, adds all log events under
		ExtentTest test1 = extent.createTest("Google Search Test One.", "This is validate search functionality");
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting test case");
		test1.pass("Navigated to google.com");
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		test1.pass("Enter text in Searchbox");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Enter key");
		
		driver.close();
		driver.quit();
		test1.pass("Close the report");
		test1.info("Test is complete");
		
		//Second test
		ExtentTest test2 = extent.createTest("Google Search Test Two.", "This is validate search functionality");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test2.log(Status.INFO, "Starting test case");
		test2.pass("Navigated to google.com");
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		test2.fail("Enter text in Searchbox");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test2.pass("Enter key");
		
		driver.close();
		driver.quit();
		test2.pass("Close the report");
		test2.info("Test is complete");
		//calling flush to writes everything to the log file
		extent.flush();
	}

}
