package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2
{
	public static void main(String[] args) throws InvalidFormatException, IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\husna\\OneDrive\\Documents\\Book1.xlsx");
		Workbook wb=new XSSFWorkbook(f);
		Sheet sh=wb.getSheet("Sheet1");
		Row rw=sh.createRow(0);
		Cell c=rw.createCell(0);
		c.setCellType(CellType.STRING);
		c.setCellValue("INDIA1");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\husna\\OneDrive\\Documents\\Book1.xlsx");
		wb.write(fo);
		wb.close();
		// code to insert data to excel file
		
		
	}	

}
