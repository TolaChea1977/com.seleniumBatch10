package Selenium_day13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.BaseClass;



public class loginTestCases {

	loginPage lp = new loginPage();

	@BeforeMethod
	public void setUp() {

		BaseClass.getDriver();
		BaseClass.getDriver().get(BaseClass.getUserDataProperty("swaglabUrl"));
		BaseClass.getDriver().manage().window().maximize();
		BaseClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void loginWithValidCredentials_Standard() {

		lp.standard_user_login();

	}

	@Test
	public void loginWithValidCredentials_lockoutUser() {

		lp.locked_out_user_login();

	}

	@Test
	public void loginWithValidCredentials_problemUser() {

		lp.problem_user_login();

	}

	@Test
	public void loginWithValidCredentials_performanceGlitchUser() {

		lp.performance_glitch_user_login();

	}

	@AfterMethod
	public void tearDown() {

	}

}
