package fireFoxTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchToFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Tola Chea\\eclipse-workspace\\com.seleniumBatch10\\Server\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/selenium/deprecated.html");
        
        driver.manage().window().maximize();
        
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();
//        driver.close();

		
	}

}
