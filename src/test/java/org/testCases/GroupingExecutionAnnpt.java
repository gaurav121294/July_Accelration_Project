package org.testCases;

import org.testng.annotations.Test;

public class GroupingExecutionAnnpt {
  @Test(groups={"Regression","smoke","UAT"})
  
         public void test1()
         {
	        System.out.println("test1");
         }
   
		  @Test(groups={"Regression","smoke"})
		  
		  public void Mumbai()
		  {
			  System.out.println("Mumbai");
		  }
		  @Test(groups={"smoke","UAT"})
		  
		  public void Rajdhani()
		  {
			  System.out.println("test3");
		  }
		  @Test(groups={"UAT","Regression"})
		 
		  public void delhi() 
		    {
			  System.out.println("delhi");
			  
            }
          @Test(groups={"UAT"})
		  public void pune()
          {
			  System.out.println("pune");
          }
          @Test(groups={"smoke"})
		  public void nagpur()
          {
			  System.out.println("nagpur");
          }
          @Test(groups={"smoke",})
		  public void jalgaon() 
          {
			  System.out.println("jalgaon");
          }
}
