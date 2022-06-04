package Tola51TestCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
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

public class TestCases4 {
	
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
	public void testCase4() {
		
		WebElement shopMenu = driver.findElement(By.id("menu-item-40"));
		WebDriverWait wait = new WebDriverWait (driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(shopMenu));
		shopMenu.click();
		WebElement Homebtn = driver.findElement(By.xpath("//*[@id='content']/nav/a")); 
		Homebtn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
//RugbyBook
		
		WebElement seleniumRugby = driver.findElement(By.xpath("//*[@id=\'text-22-sub_row_1-0-2-0-0']/div/ul/li/a[1]/img"));
		wait.until(ExpectedConditions.elementToBeClickable(seleniumRugby));
		seleniumRugby.click();
		String descriptionRugby = driver.findElement(By.xpath("//*[@id=\'tab-description\']/p")).getText();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"tab-description\"]/p")).isDisplayed());
		System.out.println("Description: "+descriptionRugby);
		System.out.println("DESCRIPTION IS DISPLAY. TEST PASS!");
		
		driver.navigate().back();
		
//ThinkHTML Book	
		WebElement thinkInHTML = driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(thinkInHTML));
		thinkInHTML.click();
		String descriptionThinkInHTML = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/p[1]")).getText();
		Assert.assertTrue(driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/p[1]")).isDisplayed());
		System.out.println("Description: "+descriptionThinkInHTML);
		System.out.println("DESCRIPTION IS DISPLAY. TEST PASS!");
		
		driver.navigate().back();
		
//Javascript Book
		WebElement javaScript = driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(javaScript));
		javaScript.click();
		String description_Javascript = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/p[1]")).getText();
		Assert.assertTrue(driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/p[1]")).isDisplayed());
		System.out.println("Description: "+description_Javascript);
		System.out.println("DESCRIPTION IS DISPLAY. TEST PASS!");
		
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
