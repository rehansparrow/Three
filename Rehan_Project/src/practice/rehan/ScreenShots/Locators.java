package practice.rehan.ScreenShots;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
             /* ---------------------------Locators---------------------*/		
		/*-----------------findElement Examples-----------------*/
		driver.manage().window().maximize();
		driver.findElement(By.id("id"));//-By id
		driver.findElement(By.name("name"));//-By name 
		driver.findElement(By.tagName("tagName"));//-By tagName
		driver.findElement(By.className("class attribute"));//-By class attribute
		driver.findElement(By.cssSelector("#id"));//-By cssSelector where #=id
		driver.findElement(By.cssSelector(".classAttribute"));//-By cssSelector where . = class attribute 
		driver.findElement(By.xpath("Absolute or Relative"));//-By Xpath
		driver.findElement(By.linkText("Forgotten Password"));//-By Link Text(Full link text present)
		driver.findElement(By.partialLinkText("Forgotten"));//-By Partial Link Text(partial Text used)
	
		/*----------------findElements Examples---------------------------*/
		
		List<WebElement> items = driver.findElements(By.id(""));//-can be used with any locator.

	}

}
