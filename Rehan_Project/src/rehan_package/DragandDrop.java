package rehan_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
String URL = "https://jqueryui.com/droppable/";
driver.get(URL);
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
driver.switchTo().frame(0);
WebElement From = driver.findElement(By.xpath("//div[@id= 'draggable' and @class ='ui-widget-content ui-draggable ui-draggable-handle']"));
WebElement To = driver.findElement(By.xpath("//div[@id='droppable']"));
Actions builder = new Actions(driver);

Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();;
dragAndDrop.perform();

	}

}
