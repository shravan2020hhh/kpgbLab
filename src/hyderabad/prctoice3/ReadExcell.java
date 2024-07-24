package hyderabad.prctoice3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcell {

	public static void main(String[] args) throws IOException {
				
		String  excelpath = "C:\\Users\\srava\\OneDrive\\Desktop\\Interview_Asked_Questions.xlsx";
		//we connected to the Stream with file
		FileInputStream fis = new FileInputStream(excelpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFSheet sheet = wb.getSheetAt(0);
		String value = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);
		wb.close();
		fis.close();
		
		
	}

}
