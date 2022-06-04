package selenium_day4;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyCheckBox {
	
	/*1. go to https://demoqa.com/radio-button
2. verify if first radio button is unchecked by default
3. verify if second radio button is unchecked by default
4. verify if third radio button is disabled by default
5. click on the second radio button ' Impressive'
6. verify text 'You have selected Impressive' is displayed
	 * */
	
	WebDriver chrome;
	
	@Before
public void setUp() {
		
		WebDriverManager.chromedriver().setup();
        chrome = new ChromeDriver();
      
		chrome.manage().window().maximize();
		chrome.manage().deleteAllCookies();
		chrome.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		chrome.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	    chrome.get("https://demoqa.com/radio-button");
	    System.out.println("Open Browser");
	}
	@Test
public void testCheckBox() {
		
		boolean isYesCheckBox = chrome.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")).isSelected();
		        
		       
}

}
