package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import SearchPage.GoogleSearchPage;
import SearchPage.GoogleSearchPage;

public class GoogleSearchPageTest {
	public static void main(String[] args) {
		googleSearch ();
	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//go to google.com
		driver.get("https://google.com");
		//Enter text on search text box
		//driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step by Step");;
		
		//click on Search button
		GoogleSearchPage.Search(driver);
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//close the browser
		driver.close();
		System.out.println("Test completes successfully");

	}
}
