package rehan_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Handle_Alerts_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//http://kesinentravels.com
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://kesinenitravels.com/");
		driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");
		//driver.findElement(By.xpath("//button[@class='btn btn-default btn-booking']")).click();
		driver.findElement(By.xpath("input[@value='Display a confirm box']")).click();
		//driver.switchTo().alert().accept();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("The Alert message displayed"+" "+alert.getText());
		alert.accept();
		System.out.println(driver.getTitle());
		
//		String actualResult = alert.getText();
 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        
//		alert.accept();
//		
//		
//		String expectedResult = "Please select the Source city";
//		if(actualResult.equalsIgnoreCase(expectedResult)) {
//			System.out.println("Test Case is passed");
		//}
		
		
//		driver.findElement(By.name("source")).sendKeys("Cuttack");
//		driver.findElement(By.xpath("//button[@class='btn btn-default btn-booking']")).click();

 
	}

}
