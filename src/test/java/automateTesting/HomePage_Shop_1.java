package automateTesting;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage_Shop_1 {
	WebDriver driver;
	@Before
	public void setUp() {
		
		driver= WebDriverManager.chromedriver().create();
     
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	    driver.get("http://practice.automationtesting.in/");
	    System.out.println("Open Browser");
	}

}
	