package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_cssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		driver.get("https://login.yahoo.com");
		
		WebElement userName = driver.findElement(By.cssSelector("#login-username"));
		userName.sendKeys("tolasarin@yahoo.com");
		
		Thread.sleep(2000);
		WebElement logInButton = driver.findElement(By.cssSelector("#login-signin"));
		logInButton.click();
		
		WebElement passWord = driver.findElement(By.cssSelector("#login-passwd"));
		passWord.sendKeys("Sereyvatey2007");
		
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.cssSelector("#login-signin"));
		submit.click();
		
	}

}
