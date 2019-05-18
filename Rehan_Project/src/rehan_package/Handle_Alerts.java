package rehan_package;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");

 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
// driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");
//
// 	driver.findElement(By.xpath("//input[@type='button']")).click();
// 	driver.switchTo().alert().accept();
// 	
// 	driver.findElement(By.name("pwd")).sendKeys("Test");
 	driver.get("http://primusevent.azurewebsites.net/Admin/");
 	driver.findElement(By.name("txtLoginName")).sendKeys("jyotiprakash.m@kencloud.co.in");
  driver.findElement(By.name("txtPassword")).sendKeys("Test@1234");
  driver.findElement(By.name("btnSignin")).click();
  
  driver.findElement(By.name("ctl00$CPMain$GridService$ctl00$ctl04$gbccolumn")).click();
  Thread.sleep(5000);
  //driver.switchTo().alert().accept();
  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
  driver.findElement(By.xpath("//ul[@class='rwCommands']//li[@class='rwListItem']//span[@class='rwCommandButton rwCloseButton']")).click();
  
  Thread.sleep(5000);
  driver.findElement(By.name("ctl00$CPMain$GridService$ctl00$ctl04$gbccolumn1")).click();
    //Note: //a[text()='']//parent::td[@class='']//preceding or forward-sibling::td[@class='']//input[@id=''] -->Example of the complicated relative xpath
  //input[contains(@id,'')]
  //input[starts-with(@id,'')]
  //input[ends-with(@id,'')]
  //all the html tag is a for all the links
  //List <WebElement> xyz = driver.findelements()(this is used to find the total number of the webelement of the same name & using the varible we can count the elements number)
//  Alert get_Text = driver.switchTo().alert();
//  System.out.println(get_Text.getText());
  
  
 	
 	
 	
 
 
	}

}
