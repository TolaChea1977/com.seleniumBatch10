package selenium_review;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UniqueXpath {
	WebDriver driver;
	
	 @Before
	    public void setUp() throws InterruptedException {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://demoqa.com/");
	        driver.manage().window().maximize();

	        // implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	 
	 @Test
	 public void selectElements() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//h5[(text()='Elements')] ")).click();
		 driver.findElement(By.xpath("//*[@class='text']")).click();
		 driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Tola Chea");
		 driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("tolasarin@yahoo.com");
		 driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("1910 Hyannis Court, MC, VA");
		 driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Same as current address.");
		 driver.findElement(By.xpath("//button[@id='submit']")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.close();
		 
		 String actualName = driver.findElement(By.xpath("//p[@id = 'name']")).getText();
		 String expectedName = "Name:Tola Chea";
//		 assert(actualName.equals(expectedName));
		 
		 String actualEmail = driver.findElement(By.xpath("//p[@id = 'email']")).getText();
		 String expectedEmail = "Email:tolasarin@yahoo.com";
//		 assert(actualEmail.equals(expectedEmail));
		 
		 String actualCur_Add = driver.findElement(By.xpath("//p[@id = 'currentAddress']")).getText();
		 String expectedCur_Add = "Current Address :1910 Hyannis Court, MC, VA";
//		 assert(actualCur_Add.equals(expectedCur_Add));
		 
		 String actualPer_Add = driver.findElement(By.xpath("//p[@id = 'permanentAddress']")).getText();
		 String expectedPer_Add = "Permananet Address :Same as current address.";
//		 assert(actualPer_Add.equals(expectedPer_Add));
		 
		 if(actualName.equalsIgnoreCase(expectedName)&& actualEmail.equalsIgnoreCase(expectedEmail)&& actualCur_Add.equalsIgnoreCase(expectedCur_Add) && actualPer_Add.equalsIgnoreCase(expectedPer_Add)) {
			System.out.println("Test is successful");
		 }else {
			 System.out.println("Test is failure");
		 }
		 
	 }

}
