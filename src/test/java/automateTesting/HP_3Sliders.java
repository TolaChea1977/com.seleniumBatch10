package automateTesting;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HP_3Sliders {
	
WebDriver driver;
	
	@Before
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
      
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);

	    driver.get("http://practice.automationtesting.in/");
	    System.out.println("Open Browser");
	}
	
	@Test
	public void homePageWith3Sliders() {
		WebElement shop = driver.findElement(By.xpath("//*[text() = 'Shop']"));
		shop.click();
		
		WebElement home = driver.findElement(By.xpath("//a[text() ='Home']"));
		home.click();
		
		
		
		
	}


}
