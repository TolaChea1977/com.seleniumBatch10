package selenium_review;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit_YahooLoginTesting {
	
	 WebDriver driver;
	    
	    @Before
	    public void setUp() throws InterruptedException {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://yahoo.com");
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    
	    @Test
	    public void yahooLogIn() {
	    	
	    	driver.findElement(By.xpath("//*[@class = '_yb_14jai']")).click();
	    	driver.findElement(By.id("login-username")).sendKeys("tolasarin@yahoo.com");
	    	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	    	driver.findElement(By.className("password")).sendKeys("Sereyvatey2007");
	    	driver.findElement(By.name("verifyPassword")).click();
	    	driver.findElement(By.xpath("//*[@class='_yb_kxvyu _yb_ngfap']")).click();
	    	
	    	String actualResult = driver.getTitle();
	    	String expectedResult = "(370 unread) - tolasarin@yahoo.com - Yahoo Mail";
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
