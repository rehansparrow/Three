package rehan_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("http://chiraghospital.azurewebsites.net");

	}

}
