package org.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex4 {
  @Test
  public void f() {
	  String projectpath=System.getProperty("user.dir");
		System.out.println("projectpath="+projectpath);
	
			System.setProperty("webdriver.chrome.driver", projectpath+"\\Driver\\chromedriver.exe");
			 ChromeDriver driver=new ChromeDriver();
			 String url="https://www.facebook.com";
			 driver.get(url);
		
  }
}
