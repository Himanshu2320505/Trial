import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_xpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://facebook.com");
		 driver.findElement(By.id("email")).sendKeys("himans");
		 driver.findElement(By.name("pass")).sendKeys("4568");
         driver.findElement(By.xpath("//input[@value='Log In'] ")).click();
       //input[@value='Log In'] 
		 
       
	}

}
