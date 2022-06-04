package selenium_lession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertMethod {
	WebDriver driver;
	
	@Before
    public void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

	
	@Test
    public void text() {
    WebElement textBox = driver.findElement(By.xpath("//span[@class='text']"));
    textBox.click();
    
    WebElement name = driver.findElement(By.xpath("//*[@id='userName']"));
    name.sendKeys("Nui Tabing");
    
    WebElement email = driver.findElement(By.xpath("//*[@id='userEmail']"));
    email.sendKeys("nui@tabing.org");
    
    WebElement address = driver.findElement(By.xpath("//*[@id='currentAddress']"));
    address.sendKeys("Redmond, WA");
    
    WebElement Paddress = driver.findElement(By.xpath("//*[@id='permanentAddress']"));
    Paddress.sendKeys("Redmond, WA");
    
    
    WebElement submit = driver.findElement(By.xpath("//*[@id='submit']"));
    submit.sendKeys(Keys.RETURN);
   
    
    String nameSubmit = driver.findElement(By.xpath("//*[@id= 'name']")).getText();
    String ExpectedName = "Nui Tabing";
    
    String strName = nameSubmit.substring(nameSubmit.indexOf(":")+1);
    assert(strName.equals(ExpectedName));
    
    String emailSubmit = driver.findElement(By.xpath("//*[@id='email']")).getText();
    String strEmail = emailSubmit.substring(emailSubmit.indexOf(":")+1);
    String ExpectedEmail = "nui@tabing.org";
    assert(strEmail.equals(ExpectedEmail));
    
    List<WebElement> currentAddressSubmit = driver.findElements(By.xpath("//*[@id='currentAddress']"));
    String crtAddSubmit = currentAddressSubmit.get(1).getText();
    String strCrtAdd = crtAddSubmit.substring(crtAddSubmit.indexOf(":")+1);

    String ExpectedCrtAdd = "Redmond, WA";
    assert(strCrtAdd.equals(ExpectedCrtAdd));
    
    List<WebElement> permnentAddressSubmit = driver.findElements(By.xpath("//*[@id='permanentAddress']"));
    String perAddSubmit = permnentAddressSubmit.get(1).getText();
    String strPerAdd = perAddSubmit.substring(perAddSubmit.indexOf(":")+1);
    String ExpectedPerAdd = "Redmond, WA";
    assert(strPerAdd.equals(ExpectedPerAdd));
    }
}

