package interview.interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("E:\\Selenium\\workspace\\interview\\data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("number1");
		Row row = sheet.getRow(0);
		int value0=(int)row.getCell(0).getNumericCellValue();
		  
		int value1=(int)row.getCell(1).getNumericCellValue();
		
	System.out.println(value0+value1);
	
		
	}

}
