package SearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	private static WebElement txt_Search = null;
	private static WebElement bnt_Search = null;
public static WebElement textbox_search(WebDriver driver)
	{
		txt_Search = driver.findElement(By.name("q"));
		return txt_Search;
	}

public static WebElement Search(WebDriver driver) {
	   bnt_Search = driver.findElement(By.name("btnK"));
	return bnt_Search;
	}
}
