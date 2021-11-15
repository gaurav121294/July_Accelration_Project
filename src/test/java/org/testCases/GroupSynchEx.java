package org.testCases;

import org.testng.annotations.Test;

public class GroupSynchEx {
  @Test
  public void test1() {
	    System.out.println("test1");
       }
   
		  @Test(priority=7)
		  

		  public void test2() {
			  System.out.println("test2");
		  }
		  @Test(priority=8)
		  

		  public void test3() {
			  System.out.println("test3");
			  
		  }
		  @Test(priority=9)
		  

		  public void test4() {
			  System.out.println("test4");
			  
	  
  }
}
