package Tola51TestCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases1 {
	
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
	public void test1(){
		
		WebElement shopMenu = driver.findElement(By.id("menu-item-40"));
		WebDriverWait wait = new WebDriverWait (driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(shopMenu));
		shopMenu.click();
	
		
		WebElement Homebtn = driver.findElement(By.xpath("//*[@id='content']/nav/a"));
		Homebtn.click();
		
		List<WebElement> sliders = driver.findElements(By.xpath("//*[@id='n2-ss-6']/div[1]/div/div/div"));
		System.out.println("Number of sliders : " +sliders.size());
		int sliderNum =0;
		for(WebElement sliderCount:sliders) {
			sliderNum++;
			driver.findElement(By.xpath("//*[@id='n2-ss-6-arrow-next']/img")).click();
			driver.findElement(By.xpath("//*[@id='n2-ss-6-arrow-next']/img")).click();
			System.out.println("Slider: "+sliderNum+" " + sliderCount.getLocation()+ ": "+sliderCount.isDisplayed());
		}
		
	}
	
	@After
	public void tearDown() {
		
		driver.close();
	}
	
	
}
