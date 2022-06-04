package seleniumBasic;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormPractice {
	
	WebDriver driver;
	Select select;

	 @Before
	    public void setUp() throws InterruptedException {

		 	WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://demoqa.com/");
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);  // implicit wait
	    }
	 
	 @Test
	 public void formTesting() throws InterruptedException {
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]")).click();
		 driver.findElement(By.xpath("//*[text() ='Practice Form']")).click();
		 driver.findElement(By.id("firstName")).sendKeys("Tola");
		 driver.findElement(By.id("lastName")).sendKeys("Chea");
		 driver.findElement(By.id("userEmail")).sendKeys("cheatola1768@gmail.com");
		 driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		 driver.findElement(By.id("userNumber")).sendKeys("7032169658");
		 driver.findElement(By.id("dateOfBirthInput")).click();
		 
		 select = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
	     select.selectByVisibleText("January");
	     Thread.sleep(3000);
	     
	     select = new Select(driver.findElement(By.xpath("//*[@class='react-datepicker__year-select']")));
	     select.selectByVisibleText("1977");
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("//*[@aria-label='Choose Saturday, January 1st, 1977']")).click();
	     driver.findElement(By.id("subjectsInput")).sendKeys("Accounting");
	    
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
	     driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
	     driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
	     
	        		 
	 }

}
