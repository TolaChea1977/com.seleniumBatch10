package pageObjectModelTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.InventoryPage;
import Pages.LoginPage;
import Utilities.BaseClass;


public class SwaglabsTesting {
	LoginPage lp = new LoginPage();
	InventoryPage iP = new InventoryPage();

	@BeforeMethod
	public void setUp() {

		BaseClass.getDriver();
		BaseClass.getDriver().get(BaseClass.getUserDataProperty("swaglabUrl"));
		BaseClass.getDriver().manage().window().maximize();
		BaseClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void login() {

		lp.standard_user_login();
		Assert.assertTrue(lp.InventoryPageTitle.isDisplayed());
		
	}
	
//	@Test
//	public void inventorySelection() throws InterruptedException {
//		iP.addTshirtToCart();
//		
//		
//		String tShirt = "T-Shirt";
//		String eachProduct;
//		WebElement productName;
//		WebElement selectItem;
//		for (int i =1; i<=iP.productList.size(); i++) {
//			productName = iP.productList.get(i);
//			eachProduct = productName.getText();
//			if(eachProduct.contains(tShirt)) {
//				
//				System.out.println(eachProduct);
//			
//				for (int j = 1; j<= iP.addToCartButton.size(); j++) {
//				selectItem = iP.addToCartButton.get(j);
//				selectItem.click();
//				}
//			}
//		}
//		
//		}
		

		
		
	
	

	
	@AfterMethod
	public void tearDown() {

	}
}
