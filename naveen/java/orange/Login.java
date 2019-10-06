package orange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	  static WebDriver driver;
	public static void main(String[] args)  {
	}
	
		
		public void startup()  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.className("loginText")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	
}
	public void teardown() {
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	}
}
