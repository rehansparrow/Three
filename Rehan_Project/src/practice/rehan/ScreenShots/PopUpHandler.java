package practice.rehan.ScreenShots;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().deleteAllCookies();
		
		
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	
driver.findElement(By.xpath("//a[@class='black']")).click();

   Set <String> handler= driver.getWindowHandles();
   
 Iterator <String> it =handler.iterator();
 
  String Parentwindowid=it.next();
  
	System.out.println("Parentwindowid"+Parentwindowid);
	
	String ChildwindowId=it.next();

	System.out.println("Parentwindowid"+ChildwindowId);
	
	driver.switchTo().window(ChildwindowId);
	
	System.out.println("Child window pop up title"+driver.getTitle());
	driver.close();
	
	driver.switchTo().window(Parentwindowid);
	
	System.out.println("Parent window pop up title"+driver.getTitle());
	}

}
