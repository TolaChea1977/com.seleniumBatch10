package Selenium_day11;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class parallelTesting {
	
	WebDriver driver;
	
  @Test
	  public void testchromeBrowser()
	  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tola Chea\\eclipse-workspace\\com.seleniumBatch10\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.getTitle();
	  }
	
	  
  @Test
  public void testFireFoxBrowser()
  {	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tola Chea\\eclipse-workspace\\com.seleniumBatch10\\Server\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://google.com");
	driver.manage().window().maximize();
	
	System.out.println(driver.getTitle());

  }
		  
 
  @AfterMethod
  public void close()
  {
  driver.quit();
  }

}
