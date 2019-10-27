package ExcelUdemy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	// Identify TestCases coloumn by scanning the entire 1st row
	// once coloumn is identified then scan entire testcase coloumn to identify
	// purchase testcase row
	// after you grab purchase testcase row= pull all the data of that row and feed
	// into test
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\TestDat.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i <= sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("TestData")) {
				XSSFSheet sheet = workbook.getSheetAt(i); // sheet reference is possessing all the rows
				// Identify TestCases coloumn by scanning the entire 1st row
				Iterator<Row> rows = sheet.iterator();// rows has abaility to iterate through each and every row
				Row firstRow = rows.next();// this is how it will move to the next row; on the 1st row for the firstntime
											
				Iterator<Cell> cell = firstRow.cellIterator();// to navigate to each and every cell of the row
				int k=0;
				int coloumn = 0;
				while(cell.hasNext()) 
				{// will check if cell is present in first row or not
				Cell value=	cell.next();// will go to the  next cell
			if(value.getStringCellValue().equalsIgnoreCase("TestCases")) 
			{
				coloumn=k;
				
				
			}
			k++;
				}
				System.out.println(coloumn);

			}
		}

	}
}
