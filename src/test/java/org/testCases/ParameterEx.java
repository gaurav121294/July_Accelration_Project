package org.testCases;

import org.qa.BaseUtility.BaseUtility;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx {
  @Test
  @Parameters({"bName","uName","pwd"})
  public void test(String browserName, String username,String password) {
       BaseUtility obj=new BaseUtility();
       
		if(browserName.equalsIgnoreCase("ch")) {
			
		  obj.startup("ch", "https://www.facebook.com");
	  }
		else if(browserName.equalsIgnoreCase("fi")) {
			obj.startup("fi", "https://www.google.com");
		}
		System.out.println("usename="+username);
		System.out.println("password="+password);
  }
}
