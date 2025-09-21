package Excel_Tests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Tests {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C://Users//localadminuser//Documents//LinuxCommands.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		String name;
		for(int i=0; i<sheets; i++)
		{
			name = workbook.getSheetName(i);
			System.out.println(name);
		}
		
	}

}


