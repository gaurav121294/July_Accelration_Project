package org.testCases;

import org.testng.annotations.Test;

public class SequencSynchEx {
  @Test(priority=1)
  public void Update() {
	  System.out.println("Update");
  }
  @Test(priority=2)
  public void Login() {
	  System.out.println("Login");
	  
  }
  @Test(priority=3)
  public void password() {
	  System.out.println("password");
	  
  }
  @Test(priority=4)
    public void username() {
	  System.out.println("usename");
	  
  }
  @Test(priority=5)
  public void delete() {
	  System.out.println("delete");
	  
  }
  @Test(priority=6)
  public void rename() {
	  System.out.println("rename");
	  
  }
}
