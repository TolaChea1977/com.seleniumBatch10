package selenium_lession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllTestCase {
	
WebDriver driver;
    
    @Before
    public void setUp() {
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
      
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);

        driver.get("http://practice.automationtesting.in/test-cases/");
        System.out.println("Open Browser");
    }
    
    @Test
    public void printAll18TestCaseName() {
        
    	List<WebElement> HomePageTestCaseTitles = driver.findElements(By.xpath("//*[@id='accordion-222-sub_row_1-0-1-0-0']/ul/li"));
        for(WebElement eachElement:HomePageTestCaseTitles ) {
            String each = eachElement.getText();
            System.out.println(each);
        }
        
        List<WebElement> myAccountLogIn = driver.findElements(By.xpath("//*[@id='accordion-222-sub_row_1-0-1-0-2']/ul/li"));
        for(WebElement eachElement:myAccountLogIn ) {
            String each = eachElement.getText();
            System.out.println(each);
        }
        List<WebElement> myAccountRegistration = driver.findElements(By.xpath("//*[@id='accordion-222-sub_row_1-0-1-0-4']/ul/li"));
        for(WebElement eachElement:myAccountRegistration ) {
            String each = eachElement.getText();
            System.out.println(each);
        }
        
        List<WebElement> shop = driver.findElements(By.xpath("//*[@id='accordion-222-sub_row_1-0-1-0-6']/ul/li"));
        for(WebElement eachElement:shop ) {
            String each = eachElement.getText();
            System.out.println(each);
        }

}
}
