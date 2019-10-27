package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.utilities.TestUtil;

public class TestBase {

public static	 WebDriver driver;
public	static Properties prop;

	public TestBase()
	{
		
		try {
			
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\HIMANSHU SEKHARDAS\\git\\repository\\pageobject\\src\\main\\java\\com\\crm\\config\\config.properties");
			prop.load(fis);
			
			}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
			}

	public static void initialization() {
		String browsername =	prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
			 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT , TimeUnit.SECONDS); // .utilities class
			 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT , TimeUnit.SECONDS); //utilities class
			driver.get(prop.getProperty("url"));
			
		}
		
		
		
		
	}