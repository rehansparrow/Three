package practice.rehan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Pract {
	
	public void tc() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://kenmedics-staging.azurewebsites.net/");
		
		ArrayList username = readExceldata(0);
		ArrayList password = readExceldata(1);
		
		for(int i =0;i<username.size();i++) {
		driver.findElement(By.name("txtUserName_Valid")).sendKeys((CharSequence[]) username.get(i));
		driver.findElement(By.name("txtPassword_Valid")).sendKeys((CharSequence[]) password.get(i));
		}
		
	}
	 
	
	public ArrayList<String> readExceldata(int colNo) throws IOException {
			
		
		FileInputStream fis = new FileInputStream("C:\\Users\\shaikh\\Desktop\\TestTestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("First");
		Iterator<Row> rwItr = sh.iterator();
		
		
		ArrayList<String> list = new ArrayList<String>();
		rwItr.next();
		while(rwItr.hasNext()) {
			list.add(rwItr.next().getCell(colNo).getStringCellValue());
		}
		System.out.println("List:::"+list);
		
		return list;
		}

	public static void main(String[] args) throws IOException {
		
	
		
		
		Pract obj = new Pract();
		obj.tc();
	
		
		

	}

}
