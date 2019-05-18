package practice.rehan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class All_Controls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kenmedics-staging.azurewebsites.net");
		
		Actions actiondriver = new Actions(driver);
		WebElement name1 = driver.findElement(By.name("txtUserName_Valid"));
		actiondriver.moveToElement(name1).keyDown(Keys.SHIFT).sendKeys("shaikh rehan ahmed").keyUp(Keys.SHIFT).perform();
		

		//driver.findElement(By.name("subscribe")).click();
		
		//new Select(driver.findElement(By.name("computerbrands"))).selectByValue("HP");
	
	//driver.navigate();	
		
		
	}
	}
						 