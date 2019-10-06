package TestNG;

import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
		driver.get("http://www.google.com");
		}
     @Test
     public void googleTitleTest() {
    	String title= driver.getTitle();
    	System.out.println(title);
     }  	
     
     
     @Test
     public void imageValidation() {
    	WebElement we = driver.findElement(By.xpath("//img[@id='hplogo']")) ;
 boolean b= we.isDisplayed();
 System.out.println(b);
    	 
     }
    	
    @AfterMethod
    public void tearDown() {
    	driver.quit();
    }
    			
    	
     }
     

