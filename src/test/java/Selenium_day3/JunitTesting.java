package Selenium_day3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTesting {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

	    driver.get("https://www.youtube.com/");
	    System.out.println("Open Browser");
	}
	@Test
	public void test1() {
		System.out.println("Test1");
		
	}
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	@After
	public void tearDown() {
		driver.close();
		 System.out.println("Close Browser");
		
	}

}
