import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	private static XSSFWorkbook ExcelWBook;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		writeExcel1();
	}
	
	public static void writeExcel1() throws IOException
	{
		String file = "C:\\Users\\sony\\Desktop\\TestData.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("Test");
		
		for(int i=0; i<5; i++)
		{
			Row row = sh.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue("TestCase"+(i+1));
			
		}
		
		Row row = sh.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("TestCase1");
		
		FileOutputStream fo = new FileOutputStream(file);
		wb.write(fo);
		fo.close();
	}	
}
