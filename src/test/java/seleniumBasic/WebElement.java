package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tola Chea\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Watch");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Free shipping checkBox
		driver.findElement(By.xpath("//*[@id=\"p_76/2661625011\"]/span/a/div[1]/label/i")).click();
	
	}

}
