package Pages;

import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class CheckoutCompletePage {

	public CheckoutCompletePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

}
