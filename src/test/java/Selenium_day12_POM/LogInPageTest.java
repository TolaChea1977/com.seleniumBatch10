package Selenium_day12_POM;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Driver;

public class LogInPageTest extends BaseClass {
	
	WebDriver driver;
	LogInPage loginPage = new LogInPage();
	
	@BeforeSuite
	
	public void goTosauceDemo() {
		driver = Driver.getDriver();
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	public void verifyLogIn() {
		
		Assert.assertTrue(loginPage.usernameInput.isDisplayed());
		Assert.assertTrue(loginPage.passwordInput.isDisplayed());
		Assert.assertTrue(loginPage.loginBtn.isDisplayed());
	}
	
	@Test
	public void verifyPageHeaderOfProductPage() {
		loginPage.doLogin("standard_user", "secret_sauce");
		
		loginPage.pageHeader.getText();
		Assert.assertEquals(loginPage.pageHeader.getText(),"PRODUCTS");
		
		
	}
	

}
