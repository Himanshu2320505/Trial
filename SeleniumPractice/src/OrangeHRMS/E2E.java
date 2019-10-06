package OrangeHRMS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public  class E2E {
static WebDriver driver;

@Test(priority=1)
	public static void startUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		if (driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title martched");
		}
		
		else {
			System.out.println("Title not matched and expected title is :"+driver.getTitle());
		}
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("title matched");
		}
			
			else {
				System.out.println("title not matched and expected title is "+ driver.getTitle());
		}
		
	}

		@Test(priority=2)
		public static void tearDown() {
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
		
	}
	

}
