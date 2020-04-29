package SearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObj {
	WebDriver driver = null;
	By textbox_Search = By.name("q");
	By button_Search = By.name("btnK");
	
	
	public GoogleSearchPageObj(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_Search).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(button_Search).sendKeys(Keys.RETURN);
	}

}
