package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchTestNG2_1 {
	static WebDriver driver = null;
	//public static void main(String[] args) {
		//googleSearch ();
	//}
	@BeforeTest
	public void setupTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public static void googleSearch2() {
		
		//String projectPath = System.getProperty("user.dir");
		//System.out.println("string path "+ projectPath);
		//System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		//go to google.com
		driver.get("https://google.com");
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//click on Search textbox
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		//click on Search button
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		

	}
	@Test
	public static void googleSearch4() {
		
		//go to google.com
		driver.get("https://google.com");
		//click on Search textbox
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		//click on Search button
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		

	}
	@AfterTest
	public void tearDown()
	{
		//close the browser
		driver.close();
		System.out.println("Test completes successfully");
	}
}
