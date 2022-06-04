package hw_project;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnableClick {
	
	/*1. go to https://demoqa.com/checkbox
https://demoqa.com/checkbox
3. verify if all the checkboxes are unchecked by default
4. click on 'Home', Parent Checkbox
5. now verify if all the checkboxes are checked
	 * */
	
	WebDriver driver;
  
	 @Before
	 public void setUp(){
	        
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    	driver.get("https://demoqa.com/checkbox");
	        //implicit wait
	        driver.manage().deleteAllCookies();
//			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    }
	 
	 @Test
	 public void expandAllCheckBoxes(){
		 
		 driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]")).click();
		 
		 boolean verifyChecked = driver.findElement(By.xpath("(//*[@class='rct-icon rct-icon-uncheck'])[1]")).isSelected();
		 if (verifyChecked) {
			 System.out.println("Test failure");
			 System.out.println("All checkboxes are not all unchecked");
		 } else {
			 System.out.println("Test successful all checkboxes are unchecked by default.");
		 }
		 
		 driver.close();
	 }
	 
	 @Test
	 public void homeButtonCheck() {
		 
		 driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]")).click();
		 driver.findElement(By.xpath("(//*[@class= 'rct-title'])[1]")).click();
		 
		 boolean displayCheckedBoxes = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]")).isDisplayed();
		 if(displayCheckedBoxes) {
			 System.out.println("Test successful");
			 System.out.println("All boxes are checked");
		 }else{
			 System.out.println("Test failure");
			 System.out.println("not all boxes are checked");
		 }
		driver.close();
		 
	 }
}
