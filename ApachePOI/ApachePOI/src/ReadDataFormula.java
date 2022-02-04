import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFormula {

	public static void main(String[] args) throws IOException {
		
String excelFilePath = ".//datafiles//readformula.xlsx";
		
		FileInputStream is= new FileInputStream(excelFilePath); //open file in reading mode
		XSSFWorkbook wb = new XSSFWorkbook(is);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		
		//Using For Loop
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		//System.out.println(rows);
		//System.out.println(cols);
		
		for(int r=0; r<=rows;r++) {
			XSSFRow row = sheet.getRow(r);  //get Row object
					
			for(int c=0;c<cols;c++) {
				
				XSSFCell cell = row.getCell(c);
			 //returns type of cell	
				switch (cell.getCellType()) 
				{
				case STRING: 
					System.out.print(cell.getStringCellValue());break;
				case NUMERIC: 
					System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:	
					System.out.print(cell.getBooleanCellValue());break;
					
				case FORMULA:
					System.out.print(cell.getNumericCellValue());break;  //Get value of cell with FORMULA
					
				}			
				System.out.print(" | ");
				
			}
			System.out.println();	
		}	
		
		
		/* //Iterator
		
		
		Iterator iterator = sheet.iterator(); //this will return all the rows and we can iterate over those rows
		
		while(iterator.hasNext())
		{
			XSSFRow row=(XSSFRow) iterator.next();  //will return the first row
			Iterator celliterator = row.cellIterator(); // will iterate all the cells in the particular row
			
			
			while (celliterator.hasNext()) {
				
				XSSFCell cell =(XSSFCell) celliterator.next();
				
				switch (cell.getCellType()) 
				{
				case STRING: 
					System.out.print(cell.getStringCellValue());break;
				case NUMERIC: 
					System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:	
					System.out.print(cell.getBooleanCellValue());break;
					
				}			
			System.out.print("  |  ");
			
			}
			
			System.out.println();
		}
		
		*/
		
		
		
	}

}
