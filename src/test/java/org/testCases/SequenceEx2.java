package org.testCases;

import org.testng.annotations.Test;

public class SequenceEx2 {
  @Test(enabled=false)
  public void Update() {
	  System.out.println("Update");
  }
  @Test(dependsOnMethods="Update")
  public void Login() {
	  System.out.println("Login");
	  
  }
  @Test
  public void password() {
	  System.out.println("password");
	  
  }
  @Test
    public void username() {
	  System.out.println("usename");
	  
  }
  @Test
  public void delete() {
	  System.out.println("delete");
	  
  }
  @Test
  public void rename() {
	  System.out.println("rename");
	  
  }
  
}
