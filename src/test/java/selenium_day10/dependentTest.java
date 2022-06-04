package selenium_day10;

import org.testng.annotations.Test;

import Utilities.Driver;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class dependentTest {@Test(dependsOnMethods = {"OpenBrowser"})
public void AclickOnRSVP() {
    
    System.out.println("this will execute second(clickOnRSVP), it depends on 'OpenBrowser' Method");
}

@Test
public void OpenBrowser() {
    
    System.out.println("this will execute first(OpenBrowser)");
    
    Assert.assertTrue(false);
}


}
