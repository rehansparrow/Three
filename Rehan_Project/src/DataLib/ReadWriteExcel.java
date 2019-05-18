package DataLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWriteExcel {

	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.freecrm.com/register/");
	boolean a=	driver.findElement(By.xpath("//button[@name='submitButton']")).isEnabled();
	System.out.println(a);
	
	
	
	
	}
}