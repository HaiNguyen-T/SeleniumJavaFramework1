package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	public static void main(String[] args) {
		googleSearch ();
	}
	
	public static void googleSearch() {
		
		//String projectPath = System.getProperty("user.dir");
		//System.out.println("string path "+ projectPath);
		//System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//go to google.com
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		//click on Search button
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//close the browser
		driver.close();
		System.out.println("Test completes successfully");

	}
}
