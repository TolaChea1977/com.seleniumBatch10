package Selenium_day9;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportingLog {
	
  @Test
  public void f() {
	  
	  Reporter.log("Before assertion");
	  
	  Assert.assertTrue(true);
	  Reporter.log("If this code executes, assertion PASS");
  }
  
}
