package selenium_day4;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clickable_element {
	
	WebDriver driver;
    WebDriverWait wait;
	
	 @Before
	    public void setUp() throws InterruptedException {
	        
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://www.google.com/");
	        driver.manage().window().maximize();
	        
	        //implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        wait = new WebDriverWait(driver,30);    
	    }
	
	  
	    @Test
	    public void explicitWaitTest() {
	        driver.findElement(By.name("q")).sendKeys("Movie2022", Keys.ENTER);
	       
	        WebElement firstLink = driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a"));
	        wait.until(ExpectedConditions.elementToBeClickable(firstLink));
	        firstLink.click();
	        WebElement secondLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/video-voyager/div/div/div/div[1]/a/h3"));
	        wait.until(ExpectedConditions.elementToBeClickable(secondLink));
	        secondLink.click();
	        
	    }


}
