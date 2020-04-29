import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class DesiredCapabilites_Demo {
	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.IE.driver", projectPath+"\\Drivers\\InternetExplorerDriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
	}

}
