package DataLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test1 {
	
	public void testData() {
		try {
			File src = new File("C:\\Users\\shaikh\\Desktop\\TestTestData.xlsx");
			FileInputStream fl = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fl);
			XSSFSheet sh = wb.getSheetAt(0);
		    int totalrowcount = sh.getLastRowNum();
		   
		    
		    for(int i=2;i<=totalrowcount;i++) {
		    
		    }
		    
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
		
		
	
	
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		
		
		
	}

}
