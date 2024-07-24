package hyderabad.prctoice3;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleAuthAlerts {

	public static void main(String[] args) {
		
		WebDriver edge = new ChromeDriver();
		edge.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//"https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//"https://username:password@URL
		edge.manage().window().maximize();
		
		
	}

}
