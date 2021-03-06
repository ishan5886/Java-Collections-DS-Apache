import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook wb = new XSSFWorkbook(); //CREATE A NEW WORKBOOK
		
		XSSFSheet sheet = wb.createSheet("EmpInfo");
		
		Object empdata[][] = {
				
				{"EmpId","Name", "Job"},
				{101,"Ishan","Test"},
				{101,"Ishan1","Test1"},
				{101,"Ishan2","Test2"},
				{101,"Ishan3","Test3"},
				{101,"Ishan4","Test4"}
				
		};
		
		/*//Using For Loop
		
		int rows = empdata.length;
		int cols = empdata[0].length;
		
		System.out.println(rows);
		System.out.println(cols);
		
		for(int r=0; r<rows;r++) 
		
		{
			
			XSSFRow row = sheet.createRow(r);   //Create row in excel
			
			
			for(int c=0;c<cols;c++) 
			
			{
				XSSFCell cell = row.createCell(c);
				Object value = empdata[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}*/
		
		
		// using foreach loop
		
		
		int rowCount=0;
		
		for(Object emp[]:empdata) 
		{
			
			XSSFRow row = sheet.createRow(rowCount++);
			int colCount = 0;
			
			for(Object value:emp) {
				
				XSSFCell cell = row.createCell(colCount++);
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
				
			}
		}
		
		String filePath =".//datafiles//employee.xlsx";
		FileOutputStream outstream = new FileOutputStream(filePath);
				wb.write(outstream);
				outstream.close();
				
		System.out.println("------------File write successful-----------");
		
		
		
		
	}

}






























