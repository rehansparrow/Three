package rehan_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");

driver.findElement(By.name("Name")).sendKeys("Shaikh Rehan Ahmed");
driver.findElement(By.name("Name")).sendKeys(Keys.CONTROL+"a");
driver.findElement(By.name("Name")).sendKeys(Keys.CONTROL+"c");
driver.findElement(By.name("comments")).sendKeys(Keys.CONTROL+"v");



	}

}
