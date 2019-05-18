package practice.rehan;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GalleryJyotiD {
	

	  
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://suryainternational.azurewebsites.net/Admin/");
		driver.findElement(By.name("txtLoginName")).sendKeys("jyotiprakash.m@kencloud.co.in");
		driver.findElement(By.name("txtPassword")).sendKeys("Test@1234");
		driver.findElement(By.name("btnSignin")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='GalleryDetails.aspx']")).click();
		driver.findElement(By.id("CPMain_btnAddGalary")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 Thread.sleep(5000);
		 WebElement element2 = driver.findElement(By.id("ctl00_CPMain_RadWindowGallary_C_RadDropDownProducts"));
		element2.click(); 
		Select s1 = new Select(element2);
		s1.selectByVisibleText("Charging Station");
		
		
		
		
		
		
		
	
	}
}
