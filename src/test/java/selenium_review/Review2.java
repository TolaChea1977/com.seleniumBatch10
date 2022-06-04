package selenium_review;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review2 {
	
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tola Chea\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			
			driver.get("http://www.amazon.com");
			searchItems();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void searchItems() {
		try {
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Watch");
			Thread.sleep(3000);
			driver.findElement(By.id("nav-search-submit-button")).click();
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,1000)");
			
			driver.findElement(By.className("a-icon a-icon-checkbox")).submit();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Review2 myObj = new Review2();
		myObj.invokeBrowser();
		myObj.searchItems();
	

	}

}
