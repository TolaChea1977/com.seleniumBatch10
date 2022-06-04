package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class InventoryPage {
	
	
	public InventoryPage() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }
    
    @FindBy (className = "title")
    public WebElement pageHeader;
    
    @FindBy(className="inventory_item_name")
    public WebElement productList;
    
    @FindBy (className= "btn btn_primary btn_small btn_inventory")
    public List<WebElement> addToCartButton;
    
    
//    @FindBy (xpath = "//button[@class='btn btn_primary btn_small btn_inventory' and @id='add-to-cart-sauce-labs-backpack']")
//    public WebElement slbackpack;
//    
//    @FindBy (xpath = "//button[@class='btn btn_primary btn_small btn_inventory' and @id='add-to-cart-sauce-labs-bike-light']")
//    public WebElement bikeLight;
//    
//    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory' and @id='add-to-cart-sauce-labs-bolt-t-shirt']")
//    public WebElement tShirt;
    
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement shoppingCart;
    
    
//    public void addTshirtToCart() throws InterruptedException {
//    	Thread.sleep(4000);
//    	List<WebElement> shirtEl = BaseClass.driver.findElements(By.className("//div[@class='inventory_item']"));
//    	for(WebElement el:shirtEl) {
//    		System.out.println(el.getText());
//    	}
//    	
//    }
    
    
    
    public void addToCart() {
//    	
//        slbackpack.click();
//        bikeLight.click();
//        tShirt.click();
        shoppingCart.click();
    }

}
