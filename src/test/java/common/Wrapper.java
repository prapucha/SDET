package common;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Wrapper {
 static String path = "./resource/testdata.xlsx";
 static String sheet = "Sheet1";
 
 public static String getDateFromExcel(int row, int col) throws IOException {
	 FileInputStream fs = new FileInputStream(path);
	 Workbook wb = new XSSFWorkbook(fs);
	 Sheet sh = wb.getSheet(sheet);
	 Row rows = sh.getRow(row);
	 Cell cell = rows.getCell(col);
	 DataFormatter df = new DataFormatter();
	 String formatValue = df.formatCellValue(cell);
	 return formatValue;	 
 }
 
}
