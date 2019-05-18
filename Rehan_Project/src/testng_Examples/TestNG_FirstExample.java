package testng_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestNG_FirstExample {

WebDriver driver;
	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
	}
		@BeforeClass
		public void Launch() {
			driver = new ChromeDriver();	
			driver.manage().window().maximize();
		}
		@BeforeTest
		public void openURL() {
			
		
		}
		
	
	@BeforeMethod
	public void Login() {
		driver.get("http://chiraghospital.azurewebsites.net/admin");
					driver.findElement(By.id("txtLoginName")).sendKeys("jyotiprakash.m@kencloud.co.in");
					driver.findElement(By.id("txtPassword")).sendKeys("Test@1234");
					driver.findElement(By.name("btnSignin")).click(); 	
	}

		@Test
		public void start1() {
    driver.findElement(By.linkText("/Admin/AppointmentView.aspx")).click();
		
	}
		@AfterTest()
		public void logout() {
			driver.findElement(By.id("ctl00_RadLlUserName")).click();
			driver.findElement(By.xpath("//a[@id='lnksignout']")).click();
		}
		
		
		@AfterMethod
		public void test() {
			System.out.println("After Method executed");
		
		}
		@AfterClass
		public void quit() {
			driver.quit();
		}
}
