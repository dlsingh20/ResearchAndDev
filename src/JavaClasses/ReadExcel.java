package JavaClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel 
{
	public static void main(String[] args) throws IOException {
		/*
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\din\\Desktop\\TestData.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheetAt(0);
		System.out.println(sh.getRow(1).getCell(2));
		*/
		
		readExc();
	}
	
	public static void readExc() throws IOException
	{
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\sony\\Desktop\\TestData.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Data1");
		
		String str = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(str);
		
		FileInputStream fisa = new FileInputStream(new File("C:\\Users\\sony\\Desktop\\tp.properties"));
		
		Properties pro = new Properties();
		pro.load(fisa);
		System.out.println(pro.getProperty("Name"));
		
		
		
	}
}