package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Selector_Ebay {
	 WebDriver driver;
	 	    
	    @Before
	    public void setUp() throws InterruptedException {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://ebay.com");
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    
	    @Test
	    public void Ebay() {
	    	//Add scroll down function
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	    	driver.findElement(By.cssSelector("#gh-ac")).sendKeys("OnePlus6T");
	    	driver.findElement(By.cssSelector("#gh-btn")).click();
	    	
	    	js.executeScript("window.scrollBy(0,500)");
	    	
	    	String actualResult = driver.getTitle();
	    	String expectedResult = "oneplus6t: Search Result | eBay";
	    	driver.close();
	    	
	    	if(actualResult.equalsIgnoreCase(expectedResult)) {
				System.out.println("ExpectedResult is: "+expectedResult);
				System.out.println("ActualResult is: "+actualResult);
				System.out.println("Test is successful!");
			}else {
				System.out.println("ExpectedResult is: "+expectedResult);
				System.out.println("ActualResult is: "+actualResult);
				System.out.println("Test is Failure!");
			}
	    }
	    
	    

}
