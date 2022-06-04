package selenium_day5;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {
	
	 WebDriver driver;
	 Select select;
	    
	    @Before
	    public void setUp() throws InterruptedException {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://spicejet.com");
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();

	        // implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    
	    @Test
	    public void roundtripSelection() throws InterruptedException {
	        
	        //clicking on round trip radio button
	        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]")).click();
	        
	        //send MAA to 'From'
	        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("MAA");
	        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input")).sendKeys("DEL");
//	        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[1]/div[1]/div[2]/div[1]")).click();
	        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[3]/div[7]/div/div")).click();
//	        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div/div[2]/div[2]/div[2]")).click();
	        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[3]/div[3]/div")).click();
	    }
	    
	  

}
