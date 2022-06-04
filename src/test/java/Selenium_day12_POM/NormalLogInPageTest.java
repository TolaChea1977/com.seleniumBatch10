package Selenium_day12_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utilities.Driver;

public class NormalLogInPageTest {
	
	WebDriver driver;
	
	@BeforeSuite
	
	public void goTosauceDemo() {
		driver = Driver.getDriver();
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	
	public void verifyLogInElementArePresent() {
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='user-name']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='password']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='login-button']")).isDisplayed());
	}

}
