package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends Base{
	
	private WebElement emailfield = driver.findElement(By.xpath(".//*[@name='txtLoginId']"));
	private WebElement passwordfield = driver.findElement(By.xpath(".//*[@name='txtPassword']"));
	private WebElement loginbutton = driver.findElement(By.xpath(".//*[@name='btnLogin']"));
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public HomePage loginMethod(String Email, String Password)
	{
		emailfield.click();
		emailfield.sendKeys(Email);
		passwordfield.click();
		passwordfield.sendKeys(Password);
		loginbutton.click();		
		return new HomePage(driver);
	}
	 
}
