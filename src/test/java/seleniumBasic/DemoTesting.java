package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tola Chea\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("identifierId")).sendKeys("cheatola1768@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Sign out - Google Accounts";
		driver.close();
		
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("ExpectedTitle is: "+expectedTitle +", Actual result is: "+actualTitle + " => Test successful.");
		}else {
			System.out.println("ExpectedTitle is: "+expectedTitle +", Actual result is: "+actualTitle + " => Test failure.");
		}
		
		


	}

}
