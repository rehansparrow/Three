package practice.rehan.ScreenShots;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviderListArrayExample {
	
	public static void main(String[] args) throws Exception {
		
	
	
	File source = new File("C:\\Users\\shaikh\\Desktop\\Test Data.xlsx");
	FileInputStream fis = new FileInputStream(source);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh = wb.getSheetAt(0);
	
	Iterator<Row> rItr = sh.iterator();
	
	rItr.next();
	while(rItr.hasNext()) {
		System.out.println(rItr.next().getCell(0).getStringCellValue());
		
		
		
		
	}
	
	
	
	

}
}