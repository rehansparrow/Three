package practice.rehan.ScreenShots;

import java.util.List;

import org.apache.log4j.pattern.ClassNamePatternConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOperations {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		/*-----------------WebElement Operations------------------*/
		
		driver.findElement(By.id("id")).click();//-This is used to click on webelements like link, button, radio group, checkbox, images…etc.
		driver.findElement(By.id("id")).sendKeys();//-This is used to sending inputs into text fields and text areas, and also used to select value from the drop down box.
		driver.findElement(By.id("id")).clear();//-Clear the input operation
		driver.findElement(By.id("id")).getText();//-Capture the Text of element operation
		driver.findElement(By.id("id")).getTagName();//Capture the Tag Name of element operation
		driver.findElement(By.id("id")).getLocation();//-Gets the X Y coordinates of element in the app
		driver.findElement(By.id("id")).isSelected();//Check whether the checkbox or radio button is selected or not.
		driver.findElement(By.id("id")).isDisplayed();//Check whether the element is available/displayed or not.
		driver.findElement(By.id("id")).isEnabled();//Check whether the element is enable or not.
		driver.findElement(By.id("Id")).getAttribute(null);
		driver.findElement(By.id("Id")).getCssValue(null);

		
		/*-----------------WEBDRIVER METHODS---------------------*/
		driver.get("url");//- Method used to open specified url in Browser.
		driver.getCurrentUrl();//-Method used to retrieve current url of the page.
		driver.getTitle();//-Method used to retrieve current Title of the page.
		driver.getPageSource();//-Method used to retrieve source of current page
		driver.findElement(By.id("Text"));//-Method to find the first element
		List elements =	driver.findElements(By.id("Text"));//-Method to find the list of element
		driver.close();//-Method used to close the current browser window. 
		driver.quit();//-Method used to close all the opened Browser window by selenium
		driver.getWindowHandle();//-Whenever the web driver launches the browser it assigns the unique id to that browser which is called as window handler. This can be captured through the method.
		driver.getWindowHandles();//-Whenever multiple windows are opened by webdriver and we want to capture all their ids. We use this method.
		driver.switchTo().window(null);
		driver.switchTo().frame(0);
		driver.switchTo().alert();
		driver.navigate().to("url");//-Method used to navigate and it access the browser history which helps in refresh, move back and forward.
		driver.manage().window().maximize();//-Manage method used to maximize, wait the window
		
	}

}
