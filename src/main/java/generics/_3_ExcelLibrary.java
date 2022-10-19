package generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _3_ExcelLibrary implements _1_AutoConstant {
	public static String getCellValue(String sheet, int row, int cell) throws IOException
	{
	FileInputStream fis=new FileInputStream(excel_path);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	String cellvalue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return cellvalue;
	}
}