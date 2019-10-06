import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/newtours/register.php");
		 driver.findElement(By.xpath("//input[contains(@name,'address1')]")).sendKeys("Hima");
		//input[contains(@name,'address1')]

	}

}
