package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends Base {
	
	
	private WebElement userProfile = driver.findElement(By.id("ext-element-17"));
	
	private WebElement logout = driver.findElement(By.xpath("//*[@id='menuitem-1050']"));

	public HomePage(WebDriver driver) {
        this.driver = driver;
      }
	
	public LoginPage logoutMM() throws InterruptedException
	{	
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		userProfile.click();
		System.out.println("user profile clicked");
		userProfile.click();
		return new LoginPage(driver);
	}
}
