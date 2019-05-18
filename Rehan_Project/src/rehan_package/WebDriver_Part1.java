package rehan_package;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriver_Part1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method 
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kenmedics-staging.azurewebsites.net");
		TakesScreenshot tobo = ((TakesScreenshot)driver);
		File SrcFile = tobo.getScreenshotAs(OutputType.FILE);
	

        //Copy file at destination

		FileUtils.copyFile(SrcFile, new File("C:/selenium/findme.png"));
		driver.quit();
		
		
		
	}

}
