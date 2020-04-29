package Listener;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

//@Listeners(Listener.TestNGListeners.class)
public class TestNGListenerDemo {
	@Test
	public void test1() {
		System.out.println("I am inside test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside test 2");
		String projectPath = System.getProperty("user.dir");
		System.out.println("string path "+ projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		//WebElement textBox = driver.findElement(By.name("q"));
		WebElement textBox = driver.findElement(By.xpath("//input[@name= 'q']"));
		textBox.sendKeys("Automation Step by Step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
	
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside test 3");
		throw new SkipException("This test is skipped");
	}
}
