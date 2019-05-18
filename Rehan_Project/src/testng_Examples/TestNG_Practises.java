package testng_Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Practises {
	
	WebDriver driver;
	String driverPath = "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe";
	String url = "http://demo.guru99.com/test/newtours/";
	String expected = null;
	String actual = null;
	
	@BeforeTest
	public void before_test() {
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  System.out.println("Launch the Brower & maximize it");
		  driver.get(url);
		 
	}
	
	@BeforeMethod
	
	public void before_method() {
	String actual_title = driver.getTitle();
	String expected_title = "Welcome: Mercury Tours";
	Assert.assertEquals(actual_title,expected_title);
	}
	@AfterMethod
	public void after_method() {
		driver.get(url);
		
	}
	
		
	
  @Test(priority = 1 )
  public void check() {
	
	driver.findElement(By.xpath("//td[@class='mouseOut']//a[@href='register.php']")).click(); 
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	actual = driver.getTitle();
	expected = "Register: Mercury Tours";
	Assert.assertEquals(actual, expected);
	System.out.println(actual);
	 
  }
  @Test(priority = 2)
  public void check_2() {
	  driver.findElement(By.xpath("//td[@class='mouseOut']//a[@href ='login.php']")).click();
		actual = driver.getTitle();
		expected = "Sign-on: Mercury Tours";
		Assert.assertEquals(actual, expected); 
  }
	  @AfterTest
	  public void after_test()
	  {
		  driver.close();
	  }
	  
  
}