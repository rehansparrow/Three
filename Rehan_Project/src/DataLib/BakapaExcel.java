package DataLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BakapaExcel {
	
	private static final XSSFCell String = null;

	public static void main(String[] args) throws IOException {
		
		
		File source = new File("C:\\Users\\shaikh\\Desktop\\TestTestData.xlsx");
		FileInputStream input = new FileInputStream(source);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sh = wb.getSheetAt(0);
		int total = sh.getLastRowNum();
		int totalcell = sh.getColumnWidth(total);
		
		for(int i=1; i<=total;i++) {
			XSSFCell result = sh.getRow(i).getCell(0);
			
			XSSFCell result2 = sh.getRow(i).getCell(1);
			System.setProperty("webdriver.chrome.driver",  "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/");
		
		
		
		
		
		
		
		}
		

			

}
	}
