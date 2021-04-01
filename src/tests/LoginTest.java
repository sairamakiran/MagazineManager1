package tests;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Base;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends Base{
	

	@Test(dataProvider = "Authentication")
	public void logintest(String Email, String Password) throws InterruptedException
	{
		LoginPage lp1 = new LoginPage(driver);
		lp1.loginMethod(Email, Password);
		HomePage hp1 = new HomePage(driver);
		hp1.logoutMM();		
	}	
	  @DataProvider(name = "Authentication")
		 
	  public static Object[][] credentials() {
	 
	        // The number of times data is repeated, test will be executed the same no. of times
	 
	        // Here it will execute two times
	 
	        return new Object[][] { { "ssairamakiran@mirabeltechnologies.com", "Mirabel@123" }};	 
	  }
}
//,{ "sairamakiran2@gmail.com", "Mirabel@123" }