package org.testCases;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SequenceAnnotationEx3 {
  @Test
  public void test() {
	  int a=10;
	  int b=20;
	  int sum=a+b;
	  System.out.println("sum="+sum);
	  System.out.println("test");
  }
  @BeforeSuite
  public void BeforeSuit() {
	  System.out.println("Before suit");
  }
  @BeforeClass
  public void Beforeclass() {
	  System.out.println("Before Class");
  }
  @BeforeTest
  public void Beforetest() {
	  System.out.println("Before Test");
  }
  @AfterMethod
  public void AfterMethod() {
	  System.out.println("Aftere Method");
  }
  @BeforeMethod
  public void BeforeMethod() {
	  System.out.println("Before Method");
  }
  @AfterClass
  public void Afterclass() {
	  System.out.println("After Class");
  }
  @AfterSuite
  public void Aftersuit() {
	  System.out.println("After Suite");
  }
  @AfterTest
  public void Aftertest() {
	  System.out.println("After Test");
  }
  @Test
  public void BeforeMethod2() {
	  System.out.println("Before method2");
  }
}
