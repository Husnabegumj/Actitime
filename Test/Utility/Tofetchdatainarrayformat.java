package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Tofetchdatainarrayformat {

	public static  Object[][] Readdata()  throws  InvalidFormatException, IOException 
	{
		FileInputStream f=new FileInputStream("C:\\Users\\husna\\OneDrive\\Documents\\Book1.xlsx");
		Workbook wb=new XSSFWorkbook(f);
		Sheet sh=wb.getSheet("Sheet1");
		
		String[][] obj=new String[sh.getLastRowNum()+1][sh.getRow(0).getLastCellNum()];
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			for(int j=0;j<=sh.getRow(0).getLastCellNum()-1;j++)
			{
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
		

	}

}
