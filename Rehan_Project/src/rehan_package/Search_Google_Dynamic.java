package rehan_package;

import java.util.List;
//import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Wait;

public class Search_Google_Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver","C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shaikh\\Desktop\\Chrome Driver\\FireFox Driver\\geckodriver.exe");

//WebDriver driver = new ChromeDriver();
	WebDriver driver = new FirefoxDriver();	

driver.manage().window().maximize();

driver.get("http://google.com");
driver.findElement(By.id("lst-ib")).sendKeys("Testing");
driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

//List<WebElement> list1 = driver.findElements(By.xpath("//ul[@role ='listbox']/child::li//div[text()='testing']"));
List<WebElement> list1 = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
	//List<WebElement> test = driver.findElements(By.className("sbqs_c"));
System.out.println("Total Suggestion displayed"+ list1.size());
  for(int i = 0; i<list1.size(); i++)
{
	  //String s = list.get(i).getText();
	System.out.println(list1.get(i).getText());
	if(list1.get(i).getText().contains("testing techniques"))
	{
	System.out.println(list1.get(i).getText());
	list1.get(i).click();
		
	}
	}

//for (WebElement suggest : test) {
//	System.out.println(suggest.getText());
}
	}


