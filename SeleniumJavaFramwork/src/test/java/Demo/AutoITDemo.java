package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoITDemo {
	static WebDriver driver = null;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		test();
	}
	public static void test() throws IOException, InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println("string path "+ projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://tinyupload.com");
		Thread.sleep(3000);
		System.out.println("Before clicking on upload file");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]")).click();
		System.out.println("after clicking on uploaded file ");
		Runtime.getRuntime().exec("C:\\TestAutoIT\\FileUploadScrip.exe");
		Thread.sleep(3000);
		driver.close();
		
	}

}
