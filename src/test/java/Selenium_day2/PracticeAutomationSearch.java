package Selenium_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAutomationSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	        // This method will maximize the browser before route to the url
	        driver.manage().window().maximize();

	        // get method will take you the URL you have given.
	        driver.get("https://www.amazon.com");
	       
	       WebElement searchBox =  driver.findElement(By.id("twotabsearchtextbox"));
	       WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
	       //Type in what you want to search
	       searchBox.sendKeys("TV Toshiba");
	       searchBox.submit();
	       //search button click
	       searchButton.click();
	       
	       
	       
	       driver.quit();
	       driver.close();
	       
	       System.out.println("Test Pass");
	       
	}

}
