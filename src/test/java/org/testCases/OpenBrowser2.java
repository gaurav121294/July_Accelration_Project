package org.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser2 {
  @Test(invocationCount=5,threadPoolSize=5)
  
	  public void test1() {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com");
	  }
	  @Test(invocationCount=3,threadPoolSize=2)
	  public void test2() {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.myntra.com");
  }
}
