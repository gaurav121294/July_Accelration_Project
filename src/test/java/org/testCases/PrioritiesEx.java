package org.testCases;

import org.testng.annotations.Test;

public class PrioritiesEx {
  @Test(priority=1)
  public void Test1() {
	  System.out.println("Test1");
  }
  @Test(priority=4)
  public void test2() {
	  System.out.println("test2");
  }
  @Test(priority=3)
  public void Test3() {
	  System.out.println("Test3");
	  
  }
  @Test(priority=0)
  public void Test4() {
	  System.out.println("Test4");
	  
  }
  @Test(priority=-1)
  public void Test5() {
	  System.out.println("Test5");
	  
  }
  @Test
  public void Test6() {
	  System.out.println("Test6");
	  
  }
  @Test
  public void test3() {
	  System.out.println("test3");
	  
  }
  
}
