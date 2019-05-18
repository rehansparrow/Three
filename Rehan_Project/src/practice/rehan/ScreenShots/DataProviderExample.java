package practice.rehan.ScreenShots;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class DataProviderExample {
	WebDriver driver;
	@BeforeMethod
	public void launchApp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");	
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fin.ebay.com%2F");
		Thread.sleep(4000);
		
	}

	@Test(dataProvider = "dataValues")	
	public void register(String firstName, String lastName, String email, String password) {
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(lastName); 
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.id("PASSWORD")).sendKeys(password);	
		
		
		
	}
	
	@DataProvider(name = "dataValues")
	public Object[][] dataProviders() {
		
	Object[][] data;
	
		data = new Object[5][4]; 
		data[0][0] = "Shaikh";
		data[0][1] = "Rehan";
		data[0][2] = "shaikh@kencloud.co.in";
		data[0][3] = "Test@1234";
	 
		data[1][0] = "S";
		data[1][1] = "Rehan";
		data[1][2] = "shaikh@kencloud.co.in";
		data[1][3] = "Test@1234";
		
		data[2][0] = "h";
		data[2][1] = "Rehan";
		data[2][2] = "shaikh@kencloud.co.in";
		data[2][3] = "Test@1234";
		
		data[3][0] = "a";
		data[3][1] = "Rehan";
		data[3][2] = "shaikh@kencloud.co.in";
		data[3][3] = "Test@1234";
		
		data[4][0] = "ikh";
		data[4][1] = "Rehan";
		data[4][2] = "shaikh@kencloud.co.in";
		data[4][3] = "Test@1234";
		
		
		
	
	
		return data;
		
	
	
	
	
		
		
	}
	@AfterMethod
	public void  asit() {
		System.out.println("Rehan gone from earth---allah");
	}
}
