package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPage {
	
	
	public LoginPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	@FindBy(id="user-name")
	public WebElement userNameField;
	
	@FindBy(id="password")
	public WebElement passWordField;
	
	@FindBy(id="login-button")
	public WebElement loginButton;
	
	@FindBy(xpath = "//span[@class='title']")
	public WebElement InventoryPageTitle;
	
	
	public void standard_user_login() {
		
		userNameField.sendKeys(BaseClass.getUserDataProperty("standard_user"));
		passWordField.sendKeys(BaseClass.getUserDataProperty("swaglabLoginPassword"));
		loginButton.click();
	}
	
	public void locked_out_user_login() {
		
		userNameField.sendKeys(BaseClass.getUserDataProperty("locked_out_user"));
		passWordField.sendKeys(BaseClass.getUserDataProperty("swaglabLoginPassword"));
		loginButton.click();
	}
	
	
	public void problem_user_login() {
		
		userNameField.sendKeys(BaseClass.getUserDataProperty("problem_user"));
		passWordField.sendKeys(BaseClass.getUserDataProperty("swaglabLoginPassword"));
		loginButton.click();
	}
	
	
	public void performance_glitch_user_login() {
		
		userNameField.sendKeys(BaseClass.getUserDataProperty("performance_glitch_user"));
		passWordField.sendKeys(BaseClass.getUserDataProperty("swaglabLoginPassword"));
		loginButton.click();
	}

}
