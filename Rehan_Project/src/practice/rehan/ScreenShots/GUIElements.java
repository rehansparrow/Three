package practice.rehan.ScreenShots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GUIElements {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		/*-------------------------Handle GUI Elements-------------------*/
		
		/*-------------------------Input Box-------------------*/
		
		driver.findElement(By.id("id")).sendKeys("Enter in TextBox");
		driver.findElement(By.id("id")).clear();
		
		
		/*-------------------------Button-------------------*/
		
		driver.findElement(By.id("id")).click();
		
		
		/*-------------------------Drop Down-------------------*/
		
		WebElement dropdown = driver.findElement(By.id("id"));
		
		Select drpDrvr = new Select(dropdown);
		drpDrvr.selectByIndex(0);
		drpDrvr.selectByValue("Test");
		drpDrvr.selectByVisibleText("Test 1");
		drpDrvr.getFirstSelectedOption();
		
		/*-------------------------Check Box-------------------*/
		
		
		WebElement checkBox = driver.findElement(By.id("id"));
		checkBox.isSelected();
		checkBox.click();
		
		/*-------------------------Radio Button-------------------*/
		WebElement radio1 = driver.findElement(By.id("id"));
		WebElement radio2 = driver.findElement(By.id("id"));
		
		radio1.click();//radio button 1 is selected
		radio2.click();//radio button 1 is unselected and 2 is selected
		
		
		
	}

}
