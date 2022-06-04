package Tola51TestCase;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases2 {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	    driver.get("http://practice.automationtesting.in/");
	}
	
	@Test
	public void teseCase2() throws InterruptedException {
		
		WebElement shopMenu = driver.findElement(By.id("menu-item-40"));
		WebDriverWait wait = new WebDriverWait (driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(shopMenu));
		shopMenu.click();
	
		WebElement Homebtn = driver.findElement(By.xpath("//*[@id='content']/nav/a")); 
		Homebtn.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		WebElement newArrival1 = driver.findElement(By.xpath("//*[text() = 'Selenium Ruby']"));
		wait.until(ExpectedConditions.elementToBeClickable(newArrival1));
		newArrival1.isDisplayed();
		System.out.println("The first new arrival apprear: " + newArrival1.isDisplayed());
		
		WebElement newArrival2 = driver.findElement(By.xpath("//*[text() = 'Thinking in HTML']"));
		wait.until(ExpectedConditions.elementToBeClickable(newArrival1));
		newArrival2.isDisplayed();
		System.out.println("The second new arrival apprear: " + newArrival2.isDisplayed());
		
		WebElement newArrival3 = driver.findElement(By.xpath("//*[text() = 'Mastering JavaScript']"));
		wait.until(ExpectedConditions.elementToBeClickable(newArrival1));
		newArrival3.isDisplayed();
		System.out.println("The third new arrival apprear: " + newArrival3.isDisplayed());
		
		if (newArrival1.isDisplayed() && newArrival2.isDisplayed() && newArrival3.isDisplayed() ) {
			
			System.out.println("TEST PASS!");
			
		}else {
			System.out.println("TEST Failure!");
		}
		
	}
	
	@After
	public void tearDown() {
		
		driver.close();
	}
		
}
