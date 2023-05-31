package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TofetchEntirecolumn
{

	public static void main(String[] args) throws InvalidFormatException, IOException
	{
		File f=new File("C:/Users/husna/OneDrive/Documents/Book1.xlsx");
		Workbook wb=new XSSFWorkbook(f);
		Sheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
	for (int i=0;i<=sh.getLastRowNum();i++)
		{
		
		
		
			System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
			System.out.println(sh.getRow(i).getCell(1).getStringCellValue());
			
		
		
	}	

	}
}
