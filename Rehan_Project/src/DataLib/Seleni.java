package DataLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Seleni {
	static WebDriver driver;

@BeforeMethod
public void setup() {
	
	System.setProperty("webdriver.chrome.driver",  "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.freecrm.com");
	driver.manage().window().maximize();	
	
}

@Test

public void test(String Username,String Password){
	
driver.findElement(By.name("username")).sendKeys(Username);
driver.findElement(By.name("password")).sendKeys(Password);
}


@AfterMethod
public void close() {
	driver.quit();
}

}
