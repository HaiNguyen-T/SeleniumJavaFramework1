package Test;
import SearchPage.GoogleSearchPage;
import SearchPage.GoogleSearchPageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPageObjTest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		GoogleSearchTest();
	}
	
	public static void GoogleSearchTest() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("string path "+ projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	
		
		GoogleSearchPageObj searchPageObj = new GoogleSearchPageObj(driver);
		driver.get("https://google.com");
		searchPageObj.setTextInSearchBox("Automation Step by Step");
		searchPageObj.clickSearchButton();
		
		driver.close();
		System.out.println("Test completes successfully");
	}

}
