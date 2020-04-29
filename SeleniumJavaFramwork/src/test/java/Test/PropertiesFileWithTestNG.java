package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.PropertiesFile;
import Demo.Log4JDemo;

public class PropertiesFileWithTestNG {

	/*
	 * public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		//getProperties();
		//setProperties();

	 */
	static WebDriver driver = null;
	static Logger myLogger = LogManager.getLogger(PropertiesFileWithTestNG.class);
	Properties prop = new Properties();
	String pathDirectory = System.getProperty("user.dir"); 
	//PropertiesFile proFile = new PropertiesFile();
	public static String browserName = null;

	@BeforeTest
	public void setUp()
	{

		PropertiesFile.getProperties();
		myLogger.info("Browser name is " + browserName);
		System.out.println("Browser name is " + browserName);
		if (browserName.contains("InternetExplorer")) 
		{
			System.out.println("Before getting browser in config file");
			System.setProperty("WebDriver.ie.driver", pathDirectory+"\\Drivers\\InternetExplorerDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			myLogger.info("Browser name is " + browserName);
			System.out.println("Testing InternetExplorer ");
		}
		else if (browserName.contains("chrome")) {
			System.setProperty("WebDriver.chrome.driver", pathDirectory+"/Drivers/chromedriver/chromedriver.exe");
			driver =  new ChromeDriver();
			myLogger.info("Browser name is " + browserName);
			System.out.println("Testing Chorme" );
		}
	}
	@Test
	public static void searchOnGoogle()  {
		driver.get("https://google.com");
		//click on Search textbox
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");

		//click on Search button
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);


	}	
	/*@Test
	public static void setProperties() {
		try { 
			OutputStream output = new FileOutputStream(proLocation+"/src/test/java/Config/config.properties");
			prop.setProperty("browser","chrome");
			prop.store(output, null);
			String newBrowser = prop.getProperty("browser");
			System.out.println(newBrowser);
		} 
		catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();			
		} 
	} */
	@AfterTest	
	public void tearDown() {

		driver.close();
		driver.quit();
		System.out.println("Test completes successfully");
	}
}

