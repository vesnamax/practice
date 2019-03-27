package zSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	double r, pi,o;
  @Test
  public void f() {
	  o=2*r*pi;
  }
  @BeforeMethod
  public void beforeMethod() {
	  r=2;
	  pi=3.14;
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("obim kruga je " +o);
  }

}
