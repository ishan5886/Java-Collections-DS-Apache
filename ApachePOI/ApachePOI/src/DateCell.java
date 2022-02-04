import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DateCell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sheet = wb.createSheet("Date Format");
		
		
		//Date in number format
		XSSFCell cell = sheet.createRow(0).createCell(0);
		cell.setCellValue(new Date());

		
		XSSFCreationHelper ch = wb.getCreationHelper();
		
		
		// Format dd-mm-yyyy
		CellStyle cStyle = wb.createCellStyle();
		cStyle.setDataFormat(ch.createDataFormat().getFormat("dd-mm-yyyy"));
		XSSFCell cell1 = sheet.createRow(1).createCell(0);
		cell1.setCellValue(new Date());
		cell1.setCellStyle(cStyle);
		
		FileOutputStream fos = new FileOutputStream(".//datafiles/dateformat.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
