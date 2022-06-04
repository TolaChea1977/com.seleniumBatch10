package Selenium_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.com");
	        
	        WebElement searchBox = driver.findElement(By.id("Twotapsearchtextbox"));
	        searchBox.sendKeys("Car parts");
	        searchBox.submit();
	        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
	        searchButton.click();
	        


	}

}
