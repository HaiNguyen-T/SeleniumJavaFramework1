import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowerTest {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("string path "+ projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", projectPath+"\\Drivers\\InternetExplorerDriver\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://google.com");
		//WebElement textBox = driver.findElement(By.name("q"));
		WebElement textBox = driver.findElement(By.xpath("//input[@name= 'q']"));
		List<WebElement> listElements =  driver.findElements(By.xpath("//input"));
		int count = listElements.size();
		System.out.println("List size of these elements "+ count);
		textBox.sendKeys("Automation Step by Step");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}