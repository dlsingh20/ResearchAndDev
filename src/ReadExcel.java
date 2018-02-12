import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static org.apache.poi.ss.usermodel.Cell Cell;
    private static XSSFRow Row;
    public static String data;
    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readExcel();
	}
	
	public static void readExcel() throws IOException
	{
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\sony\\Desktop\\TestData.xlsx"));
		ExcelWBook = new XSSFWorkbook(fis);
		ExcelWSheet = ExcelWBook.getSheet("Data1");
		Cell = ExcelWSheet.getRow(1).getCell(3);
		Cell.setCellType(Cell.CELL_TYPE_STRING);
		data = Cell.getStringCellValue();
		System.out.println(data);
		
	}

}
