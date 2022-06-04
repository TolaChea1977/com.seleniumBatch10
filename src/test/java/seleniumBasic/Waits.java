package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	WebDriver driver;

	 @Before
	    public void setUp() throws InterruptedException {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // implicit wait
	        driver.get("https://www.facebook.com");
	    }
	 
	 @Test
	 	public void explicitWait() {
		 
		 driver.findElement(By.name("email")).sendKeys("tolasarin@yahoo.com");
		 driver.findElement(By.name("pass")).sendKeys("cpc2007");
		 driver.findElement(By.name("login")).click();
		 
	 }
		 
	

}
