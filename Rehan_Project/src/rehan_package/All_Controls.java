package rehan_package;
import org.openqa.selenium.*;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class All_Controls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://softwaretesting-guru.blogspot.com/p/main-page.html");
		
		driver.findElement(By.xpath("//a[text()='Selenium Practice page']")).click();
		driver.findElement(By.linkText("Selenium Practice page")).click();
		driver.findElement(By.name("Name")).sendKeys("Shaikh Rehan Ahmed");
		String value_get = driver.findElement(By.name("Name")).getAttribute("value");
		System.out.println(value_get);
		driver.findElement(By.name("subscribe")).click();
		driver.findElement(By.name("comments")).sendKeys("Test Test Test test test test Test test Test Test Test Test Test Test Test");
		
		new Select(driver.findElement(By.name("countries"))).selectByVisibleText("Argentina"); 
		driver.findElement(By.xpath("//input[@value='bad']")).click();
		driver.get("http://softwaretesting-guru.blogspot.com/p/main-page.html");
		String text_content = driver.findElement(By.xpath("//a[contains(text(),'Software Testing Guru')]")).getText();
		System.out.println(text_content);
		
		String actual_text = "Software Testing Guru";
		
		if(text_content.equalsIgnoreCase(actual_text)) {
			System.out.println("Test Case is passed");
		}
		else {
			System.out.println("Failed");
		}
		
		
		
		driver.get("https://www.google.com/search?source=hp&ei=PmYWW46JJcHMvgTw372wAw&q=test&oq=test&gs_l=psy-ab.3..0i131k1l3j0l2j0i131k1j0l4.64864.67432.0.67750.8.7.1.0.0.0.246.814.0j4j1.5.0..3..0...1.1.64.psy-ab..2.6.816...0i10k1.0.bLlE0Zd4bkg");
		driver.findElement(By.id("lst-ib")).sendKeys("Test");
		String test_title = driver.findElement(By.id("logo")).getAttribute("title");
		System.out.println(test_title);
	
		
	}

}
