package DataLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataLib {
	
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public TestDataLib(String excelpath) {
		try {
			File src = new File(excelpath);
			FileInputStream fis = new FileInputStream(src);
				
			wb = new XSSFWorkbook(fis);
			sh = wb.getSheetAt(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} 
		}
	public String getData(int indexNo, int row, int colm) {
		
		String data = sh.getRow(row).getCell(colm).getStringCellValue();
		return data;
		
	}
	
	

}
