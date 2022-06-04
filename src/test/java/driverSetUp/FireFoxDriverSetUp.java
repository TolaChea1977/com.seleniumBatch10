package driverSetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverSetUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tola Chea\\eclipse-workspace\\com.seleniumBatch10\\Server\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
	}

}
