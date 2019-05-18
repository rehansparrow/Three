package rehan_package;
//import java.awt.*;

//import java.awt.AWTException;
import java.awt.Robot;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windows_Action_Examole {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

//driver.get("http://google.com");
//driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
//driver.findElement(By.id("lst-ib")).sendKeys("Java Download");
//driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
//driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
//driver.findElement(By.xpath("//a[@href='https://java.com/download' and text()='Download Free Java Software']")).click();
//driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
//driver.findElement(By.xpath("//div[@class='jvdl0 jvdl0v0']//span")).click();
//driver.findElement(By.xpath("//div[@class='jvdl0 jvdl0v0']//a[@title='Download Free Java Software']//span")).click();
Robot robobj = new Robot();
driver.get("http://chiraghospital.azurewebsites.net/admin/");
driver.findElement(By.name("txtLoginName")).sendKeys("jyotiprakash.m@kencloud.co.in");
driver.findElement(By.name("txtPassword")).sendKeys("Test@1234");
driver.findElement(By.name("btnSignin")).click();
driver.get("http://chiraghospital.azurewebsites.net/Admin/GallaryEntry.aspx");
driver.findElement(By.id("CPMain_btnAddGalary")).click();
driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
driver.findElement(By.xpath("//ul[@class='ruInputs']//li[@class='ruSelectWrap']//span[text()='Select']")).sendKeys(Keys.ENTER);
driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
robobj.setAutoDelay(5000);
robobj.keyPress(java.awt.event.KeyEvent.VK_TAB);
robobj.keyPress(java.awt.event.KeyEvent.VK_TAB);
robobj.keyPress(java.awt.event.KeyEvent.VK_TAB);
robobj.keyPress(java.awt.event.KeyEvent.VK_ENTER);







	}

}
