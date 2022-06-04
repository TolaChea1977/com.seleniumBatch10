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

public class Iframe {
	
	WebDriver driver;
    Actions act;

    @Before
    public void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void simpleDragAndDrop() throws InterruptedException {
        act = new Actions(driver);
        
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        
        driver.switchTo().frame(0);
        
        WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement target = driver.findElement(By.xpath("//*[@id='droppable']"));
        
        Thread.sleep(3000);
        act.dragAndDrop(source, target).build().perform();
        
        driver.switchTo().defaultContent();
        
        

    }
    

}
