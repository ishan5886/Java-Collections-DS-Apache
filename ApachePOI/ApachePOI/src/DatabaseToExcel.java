import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatabaseToExcel {

	public static void main(String[] args) throws SQLException, IOException {
		
		//connect to the database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");

		//statement/query
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from country");
		
		//Excel
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Country Data");
		
		XSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("Country");
		row.createCell(1).setCellValue("Capital");
		
		int r=1;
		while(rs.next())
		{
			
			String country=rs.getString("countryname");
			String capital=rs.getString("capital");
		
			
			row=sheet.createRow(r++);
			
			row.createCell(0).setCellValue(country);
			row.createCell(1).setCellValue(capital);
		}
		
		
		FileOutputStream fos=new FileOutputStream(".//datafiles//locations.xlsx");
		workbook.write(fos);
		
		workbook.close();
		fos.close();
		con.close();
		
		System.out.println("Done!!!");
	}

}
