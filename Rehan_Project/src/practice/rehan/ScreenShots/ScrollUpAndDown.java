package practice.rehan.ScreenShots;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[3]/div[1]/div[1]/p[5]"));
		WebElement element1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[3]/div[1]/div[1]/p[11]"));
		
		
		JavascriptExecutor jedriver = (JavascriptExecutor)driver;
		
		jedriver.executeScript("arguments[0].scrollIntoView(true);", element);
		System.out.println(element.getText());
		Thread.sleep(5000);
		jedriver.executeScript("arguments[0].scrollIntoView(true);", element1);
		
		
		
		System.out.println(element1.getText());
		
		jedriver.executeScript("scroll(0,3456.800)");
		

	}

}
