package gollie_Pratice;

import org.apache.log4j.Priority;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTestNGSequence {
	
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
		
	}
	
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Before Groups");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("After Groups");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@Test
	public void test() {
		System.out.println("Test");
	}
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
}
