package hyderabad.practice;

//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.BaseTestMethod;

public class EDay10WebTableHandling {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		// get specific row/column data
		String singleValue = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[1])")).getText();
		System.out.println(singleValue);

		// get all data
		String allValues = driver.findElement(By.xpath("//table[@id='customers']/tbody)")).getText();
		System.out.println(allValues);

		// get a column value of specific row(if col1="meta" the print col2,col3)
		for (int r = 1; r < 8; r++) {
			String singleValue1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + r + "]/td[1])"))
					.getText();
			System.out.println(singleValue1);
			if (singleValue1.equals("Meta")) {
				String secondValue = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + r + "]/td[2]"))
						.getText();
				String thirdValue = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + r + "]/td[3]"))
						.getText();
				System.out.println(singleValue1 + "  " + secondValue + "  " + thirdValue);

				// get all the data by iterator method
				for (int r1 = 1; r1 < 8; r1++) {
					for (int c = 1; c < 4; c++) {
						String values = driver
								.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + r + "]/td[" + c + "]"))
								.getText();

						System.out.println(values);
					}
				}
			}
		}
	}
}
