package selenium_day7;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	
	WebDriver driver;
    Actions act;

    @Before
    public void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void simpleDragAndDrop() {
        act = new Actions(driver);
        
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        act.dragAndDrop(source, target).build().perform();
       
    }
    
    
    @Test
    public void AcceptDragAndDrop() throws InterruptedException {
        act = new Actions(driver);
        
        WebElement acceptExample = driver.findElement(By.id("droppableExample-tab-accept"));
        acceptExample.click();
        Thread.sleep(3000);
        
        WebElement source1 = driver.findElement(By.id("acceptable"));
        WebElement source2 = driver.findElement(By.id("notAcceptable"));
        WebElement target1 = driver.findElement(By.xpath("//*[@id='droppableContainer']"));  
        
        act.dragAndDrop(source1, target1).build().perform();
        act.dragAndDrop(source2, target1).build().perform();
        
        
    }
    
   

}
