package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//annotations starting with @Before - prerequisite conditions
//annotations starting with @After - post conditions
public class TestNGPrc {
	
	
	WebDriver driver;
	
	@BeforeSuite
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
		driver.get("http://www.google.com");
		}

	

	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch browser-@BeforeClass");
	}

	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter URL-@BeforeMethod");
	}

	@BeforeTest
	public void login() {
		System.out.println("Pleasde login gt app-@BeforeTest");
	}

	@Test(groups="NF")
	public void googleTitleTet() {
		System.out.println("google Title test-@Test");
	}
	
    @Test(groups="functional")
    public void googleTitleTest() {
   	String title= driver.getTitle();
   	System.out.println(title);
    }  	
    
    
    @Test(groups="NF")
    public void imageValidation() {
   	WebElement we = driver.findElement(By.xpath("//img[@id='hplogo']")) ;
boolean b= we.isDisplayed();
System.out.println(b);
   	 
    }

	@Test(groups="functional")
	public void searchTest() {
		System.out.println("searchTest-@Test");
	}

	@Test(groups="logo")
	public void logout() {
		System.out.println("logout completed-@AfterMethod");
	}

	@Test(groups="logo")
	public void deleteAllCookies() {
		System.out.println("deleteAllCookies-@AfterTest");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("closeBrowser-@AfterClass");
	}

	@AfterSuite
	public void generateTestReport() {
		System.out.println("generate test report-@AfterSuite");
	}
}
