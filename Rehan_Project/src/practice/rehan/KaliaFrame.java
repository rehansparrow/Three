package practice.rehan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KaliaFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shaikh\\Desktop\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("shaikh92 ");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
     
		WebElement element=driver.findElement(By.xpath(" //input[@value='Login']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		
		
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		
	 driver.switchTo().frame("mainpanel");
		
		
	
		

	}

}
