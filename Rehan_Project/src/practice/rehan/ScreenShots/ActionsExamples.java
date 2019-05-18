package practice.rehan.ScreenShots;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
             /* ---------------------------Actions---------------------*/	
		Actions actionDriver = new Actions(driver); //-Create object of Actions class
		
		/*-----------------Methods Available in Selenium Actions Class-----------------*/
		/*-----------------Keyboard Events Using Selenium Actions Class API:-----------*/
		
		driver.findElement(By.id("id")).sendKeys("Text to be entered");//-sendKeys, send a series of keystrokes onto the elements
		actionDriver.moveToElement(driver.findElement(By.id("id"))).keyDown(Keys.CONTROL).sendKeys("text or button").keyUp(Keys.SHIFT).perform();//-Use shift and release shift button.
		
		/*----------------Mouse Events Using Selenium Actions Class API----------------:*/
		WebElement element = driver.findElement(By.id("id"));
		actionDriver.moveToElement(element).click();//-Click the Element
		actionDriver.moveToElement(element).doubleClick();//-Double click the Element
		actionDriver.moveToElement(element).contextClick();//-Right Click the Element
		actionDriver.clickAndHold(element);//-Click the element without release(use to drag)
		actionDriver.dragAndDrop(element, driver.findElement(By.name("name")));//Drag and drop from source to target
		actionDriver.moveToElement(element);//-shifts the mouse to the element
		actionDriver.release();//releases
		
		//Note- build() method is used to compile all the actions to single step
	
	
	
	}

}
