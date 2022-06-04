package Selenium_day9;

import org.testng.annotations.Test;

import Utilities.Driver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Grouping_testNG {
  @Test(groups = {"smokeTest"})
  public void a() {
	  System.out.println("a");
  }
  
  @Test(groups = {"smokeTest"})
  public void b() {
	  System.out.println("b");
  }
  
  @Test(groups = {"regressionTest"})
  public void c() {
	  System.out.println("c");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  Driver.getDriver();
  }

//  @AfterMethod
//  public void afterMethod() {
//	  Driver.tearDown();
//	  
//  }

}
