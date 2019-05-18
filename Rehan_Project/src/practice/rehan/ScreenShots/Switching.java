package practice.rehan.ScreenShots;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Switching {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		 
        /*-------------Get the Current Window Handle------------------*/

        String handle= driver.getWindowHandle();

        System.out.println(handle);

        // Click on the Button "New Message Window"

        driver.findElement(By.xpath("//button[@id='button1']")).click();

        // Store and Print the name of all the windows open	              

        Set handles = driver.getWindowHandles();
        System.out.println(handles.size());
        System.out.println(handles);

        // Pass a window handle to the other window

        for (String handle1 : driver.getWindowHandles()) {

         System.out.println(handle1);
         
         driver.switchTo().window(handle1);
         
         }
        String currentHandle = driver.getWindowHandle();
        System.out.println(currentHandle);
        System.out.println();
        
        /*-------------------------Alerts---------------------------*/
        Alert alrtDrvr = driver.switchTo().alert();
        alrtDrvr.accept();
        alrtDrvr.sendKeys("Test");
        
        /*-------------------------Frames---------------------------*/
        
        driver.switchTo().frame(1);
        
        
        
        
        
	}

}
