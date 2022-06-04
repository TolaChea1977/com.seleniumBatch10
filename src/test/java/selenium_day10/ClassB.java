package selenium_day10;

import org.testng.annotations.Test;

public class ClassB extends ClassA {
  @Test(dependsOnMethods = {"f"})
  public void b() {
	  System.out.println("Another method executed over this world, called classB");
  }
  
  @Test
  public void d() {
	  
	  System.out.println();
	  System.out.println();
	 
  }
  
}
