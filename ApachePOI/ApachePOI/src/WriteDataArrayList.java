import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataArrayList {

	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook wb = new XSSFWorkbook(); //CREATE A NEW WORKBOOK
		
		XSSFSheet sheet = wb.createSheet("EmpInfo");
		
		ArrayList<Object[]> empdata = new ArrayList<Object[]>();
		
				
		empdata.add(new	Object[]{"EmpId","Name", "Job"});
		empdata.add(new	Object[]{"I1","N1", "J1"});
		empdata.add(new	Object[]{"I2","N2", "J2"});
		empdata.add(new	Object[]{"I3","N3", "J3"});
		empdata.add(new	Object[]{"I4","N4", "J4"});
		empdata.add(new	Object[]{"I5","N5", "J5"});
					
		
		
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
		
		for(Object[] emp:empdata) 
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






























