package gollie_Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://kencloudecosysadmin.azurewebsites.net/UserManagement/User/Index");
		
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//input[@id='AddFirstName']")).sendKeys(Keys.SHIFT, "SHAIKH");
		
		Actions actndrvr = new Actions(driver);
		actndrvr.moveToElement(driver.findElement(By.xpath("//input[@id='AddFirstName']"))).keyDown(Keys.SHIFT).sendKeys("shaikh").keyUp(Keys.SHIFT).build().perform();
		
		/*driver.findElement(By.xpath("//input[@id='addLastName']")).sendKeys("Rehan");
		driver.findElement(By.xpath("//input[@id='AddUserId']")).sendKeys("shaikh@kencloud.co.in");

	
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='k-widget k-dropdown k-header mob-zone']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class ='k-animation-container']")).sendKeys(Keys.DOWN, Keys.DOWN);*/

		
	}

}
