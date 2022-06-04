package selenium_review;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YouTube_Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		try {
			driver.get("https://www.google.com/"); 

			WebElement searchBox = driver.findElement(By.className("gLFyf gsfi"));
			Thread.sleep(3000);
			searchBox.sendKeys("New release movie 2022");
		} catch (InterruptedException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		WebElement userName = driver.findElement(By.id("identifierId"));
//		userName.sendKeys("cheatola1768@gmail.com");
//		Thread.sleep(2000);
//		WebElement nextButton = driver.findElement(By.className("VfPpkd-vQzf8d"));
//		nextButton.click();
	}

}
