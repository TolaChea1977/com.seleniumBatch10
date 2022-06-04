package Selenium_day8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Utilities.Driver;

public class TestDriverClass{
	
	@Before
	public void setUp() {
		
		Driver.getDriver();
	
	}
	
	
	@Test
	public void test() {
		System.out.println("Testing Browser opened");
	}
	
	
	@After
	public void tearDown() {
		Driver.tearDown();
	}
	
	
	
	

}
