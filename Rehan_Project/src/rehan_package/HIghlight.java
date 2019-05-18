package rehan_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HIghlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://chiraghospital.azurewebsites.net/");		
		String t1 = driver.findElement(By.xpath("//div[@class='section-title']//h2[text()='The Best For Your Health!']")).getCssValue("color");
	String t2 = driver.findElement(By.xpath("//div[@class='section-title']//h2[text()='The Best For Your Health!']")).getCssValue("background-color");
	System.out.println(t1);
	System.out.println(t2);
	}

}
