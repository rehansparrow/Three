package DataLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayListIteratorDataProviderExample {

	public static void main(String[] args) throws Exception {
		ArrayListIteratorDataProviderExample data = new ArrayListIteratorDataProviderExample();
		data.readExcel(0); 
		data.readExcel(1); 
		data.readExcel(2);  
		data.readExcel(3); 
		
		data.tc(); 
	}
	
	
	public void tc() throws Exception { 
		System.setProperty("webdriver.chrome.driver",  "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize();  
	driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fin.ebay.com%2F"); 
	ArrayList<String> username = readExcel(0); 
	ArrayList<String> lastName = readExcel(1); 
	ArrayList<String> email = readExcel(2); 
	ArrayList<String> password = readExcel(3); 
	for(int i =0; i<username.size();i++) { 
	driver.findElement(By.name("firstname")).sendKeys(username.get(i)); 
	driver.findElement(By.name("lastname")).sendKeys(lastName.get(i)); 
	driver.findElement(By.name("email")).sendKeys(email.get(i)); 
	driver.findElement(By.id("PASSWORD")).sendKeys(password.get(i)); 	
	} 
	} 
	
	public ArrayList<String> readExcel(int colNo) throws Exception { 
		File source = new File("C:\\Users\\shaikh\\Desktop\\Test Data.xlsx"); 
		FileInputStream fis = new FileInputStream(source); 
		XSSFWorkbook wb = new XSSFWorkbook(fis); 
		XSSFSheet sh = wb.getSheetAt(0); 
		
		Iterator<Row> rItr = sh.iterator(); 
		rItr.next(); 
		
		ArrayList<String> list = new ArrayList<String>(); 
		while(rItr.hasNext()) { 
			list.add(rItr.next().getCell(colNo).getStringCellValue()); 
			
		} 
		System.out.println(list); 
		return list; 
		
		
	}
	
	

}
