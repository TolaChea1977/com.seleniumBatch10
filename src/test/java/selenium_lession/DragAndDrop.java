package selenium_lession;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.junit.After;
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
Actions action;
	
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

        action = new Actions(driver);

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        action.dragAndDrop(source, target).build().perform();

    }

    @Test
    public void acceptDragAndDrop() {
        action = new Actions(driver);
        driver.findElement(By.id("droppableExample-tab-accept")).click();
        WebElement acceptable = driver.findElement(By.id("acceptable"));
        WebElement target2 = driver.findElement(By.id("acceptDropContainer"));
        action.dragAndDrop(acceptable, target2).build().perform();
        
    }

    @Test
    public void preventPropogationDragAndDrop() {
        driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();

        action = new Actions(driver);
        WebElement  dragMe = driver.findElement(By.id("dragBox"));
        WebElement target3 = driver.findElement(By.id("notGreedyInnerDropBox"));
        action.dragAndDrop(dragMe, target3).build().perform();
        

    }

    @Test
    public void revertDraggableDragAndDrop() {
        action = new Actions(driver);
        driver.findElement(By.id("droppableExample-tab-revertable")).click();

        WebElement  willRevert = driver.findElement(By.id("revertable"));
        WebElement target4 = driver.findElement(By.id("revertableDropContainer"));
        action.dragAndDrop(willRevert, target4).build().perform();
        

    }

}
