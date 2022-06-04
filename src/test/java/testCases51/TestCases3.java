package testCases51;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases3 {
	
WebDriver driver;

	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	    driver.get("http://practice.automationtesting.in/");
	}
	@Test
	public void teseCase3() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement shopMenu = driver.findElement(By.id("menu-item-40"));
		WebDriverWait wait = new WebDriverWait (driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(shopMenu));
		shopMenu.click();
	
		WebElement Homebtn = driver.findElement(By.xpath("//*[@id='content']/nav/a")); 
		Homebtn.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		
		List<WebElement> newArrivalList = driver.findElements(By.xpath("//*[@id='themify_builder_content-22']/div[2]/div/div/div/div/div[2]/div"));
		 int numNewArrival=newArrivalList.size();
		if(numNewArrival==3) {
			System.out.println("New Arrival is equal "+numNewArrival+" : TEST PASS");
		}else {
			System.out.println("New Arrival is equal "+numNewArrival+" : TEST FAIL");
		}	
		
		 for (int i = 1; i <=numNewArrival; i++) {
	            WebElement inStockCheck=driver.findElement(By.xpath("//*[@id=\"themify_builder_content-22\"]/div[2]/div/div/div/div/div[2]/div["+i+"]"));
	            String search=inStockCheck.getText();
	            System.out.println(search);
	            if (search.contains("ADD TO BASKET")) {
	                inStockCheck.click();
	                WebElement bookItem = driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[2]/form/button"));
	                action.moveToElement(bookItem).build().perform();
	                bookItem.click();
	                System.out.println("book add to his basket successful");

	            } else {
	                System.out.println("Out of Stock");
	            }
		 }
	}
	
	@Test
	public void testRelatedBook() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement shopMenu = driver.findElement(By.id("menu-item-40"));
		WebDriverWait wait = new WebDriverWait (driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(shopMenu));
		shopMenu.click();
		WebElement Homebtn = driver.findElement(By.xpath("//*[@id='content']/nav/a")); 
		Homebtn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		WebElement HTMLBook = driver.findElement(By.xpath("//*[@id='text-22-sub_row_1-0-2-1-0']/div/ul/li/a[1]/img"));
		HTMLBook.click();
		
		List<WebElement> relatedProducts = driver.findElements(By.xpath("//*[@id=\'product-163\']/div[5]/ul/li"));
		
		int numRelPro = relatedProducts.size();
		
		for (int j = 1; j<=numRelPro; j++) {
			WebElement inStockCheck=driver.findElement(By.xpath("//*[@id=\\\'product-163\\']/div[5]/ul/li["+j+"]"));
            String search=inStockCheck.getText();
            System.out.println(search);
            if (search.contains("ADD TO BASKET")) {
                inStockCheck.click();
                WebElement bookItem = driver.findElement(By.xpath("//*[@id=\'product-165\']/div[2]/form/button"));
                action.moveToElement(bookItem).build().perform();
                bookItem.click();
                System.out.println("book add to his basket successful");

            } else {
                System.out.println("Out of Stock");
            }
		}
		
	}
	@After
	public void tearDown() {
		driver.close();
	}

}
