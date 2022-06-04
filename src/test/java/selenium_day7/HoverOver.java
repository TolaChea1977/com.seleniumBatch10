package selenium_day7;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HoverOver {
	
	WebDriver driver;
    Actions act;

    @Before
    public void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://amazon.com/");
        driver.manage().window().maximize();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @Test
    public void hoverOverTest() {
    	
    	  act = new Actions(driver);
          
          WebElement amazonMenu = driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));    
          
          act.moveToElement(amazonMenu).build().perform();

    }

}
