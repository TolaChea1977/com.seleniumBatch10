package selenium_review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Review1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https:///www.amazon.com");
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchBox.sendKeys("Watch");
//		searchBox.submit();
		searchButton.click();
		
		
		 String expectedTitle = "Amazon.com : Watch";
		 String title = driver.getTitle().toString();
		 Thread.sleep(3000);
		
	     if(expectedTitle.equals(title)) {
	    	System.out.println("Title : " + title + " (TEST PASSED!!!)");
	    	driver.quit();
	     }else {
	    	 System.out.println("Expected Title: " + expectedTitle + " "+ "TEST FAILED");
	     }
	 
	}

}
