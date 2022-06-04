package Selenium_day6;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HardAssertion {

	public static void main(String[] args) {
		
	    WebDriver driver ;
        
        WebDriverManager.chromedriver().setup();
    
        driver = new ChromeDriver();
    
        driver.get("https://www.amazon.com");
        String ActualTitle = driver.getTitle();
    //    String ExpectedTitle = "Welcome to Amazon";  // incorrect title expectation
        String ExpectedTitle = "Amazon.com. Spend less. Smile more.";  //correct title expectation
        Assert.assertEquals(ActualTitle, ExpectedTitle); //hard assertion
        System.out.println("Assert passed");
    
    
    
    
    
    
    

	}

}
