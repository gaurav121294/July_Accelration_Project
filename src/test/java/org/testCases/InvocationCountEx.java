package org.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCountEx {
  @Test(invocationCount=3)//invocationcount=3 means facebook window open 3 times
  public void f() {
  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  
	 
		}
}
