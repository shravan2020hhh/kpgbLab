package hyderbadHostel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();

		// 4 Line code TakeScreenShot
		TakesScreenshot sc = (TakesScreenshot) driver;
		File srcFile = sc.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C://sdf/sdfsdf/sdfsdf/ffff.png");
		FileUtils.copyFile(srcFile, destFile);

		// 6 Line code ReadExcelSheet
		String excPath = "Interview_Asked_Questions.xlsx";
		FileInputStream fis1 = new FileInputStream(excPath);
		XSSFWorkbook wb1 = new XSSFWorkbook(fis1);
		XSSFSheet sheet1 = wb1.getSheetAt(0);
		String val = sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.print(val);
		
		// 5 Line ReadPropertiesFile
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("config.properties");
		prop.load(fis);
		String url = prop.getProperty("url");
		System.out.println(url);
	}

}
