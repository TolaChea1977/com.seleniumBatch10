package Selenium_day12_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;
import Utilities.Driver;

public class LogInPage{
	
	WebDriver driver = Driver.getDriver();
	
	public LogInPage() {
		
		PageFactory.initElements(driver,this);
	}
		@FindBy(xpath = "//*[@id='user-name']")
		public WebElement usernameInput;
		
		@FindBy(xpath = "//*[@id='password']")
		public WebElement passwordInput;
		
		@FindBy(xpath = "//*[@id='login-button']")
		public WebElement loginBtn;
		
		@FindBy(className = "title")
		public WebElement pageHeader;
		
		public void doLogin(String username, String password) {
			usernameInput.sendKeys(username);
			passwordInput.sendKeys(password);
			loginBtn.click();
			
		}
		
		
		
	
		
	

}
