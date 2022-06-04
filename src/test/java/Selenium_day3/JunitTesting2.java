package Selenium_day3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTesting2 {
	
	 WebDriver driver;

	    @BeforeClass
	    public static void beforeClass() {
	        System.out.println("Before Class");
	    }
	    
	    @AfterClass
	    public static void afterClass() {
	        System.out.println("After Class");
	    }
	    
	    @After
	    public void tearDown() {
	        driver.close();
	        System.out.println("Close Browser");

	    }
	    
	    
	    @Before
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();

	        driver = new ChromeDriver();

	        //driver.get("https://www.techcircleschool.com/");
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
	    
	    
	    @Ignore
	    @Test
	    public void test3() {
	        System.out.println("Test3");

	    }
	    
	    @Test(expected=ArithmeticException.class)
	    public void test4() {
	        System.out.println("Test4");
	        int i = 45/0;
	        System.out.println(i);

	    }

	    @Test(timeout=500)
	    public void test5() {
	        System.out.println("Test5");
	    
	    }

}
