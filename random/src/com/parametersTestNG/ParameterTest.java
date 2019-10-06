package com.parametersTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver ;
	
	@Test
	@Parameters({"browser","url","emailid"})
	public void yahooLoginTest(String browser ,String url , String emailid ) {
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
     driver=new ChromeDriver(); 
     }
     driver.get(url);
     driver.findElement(By.id("login-username")).clear();
     driver.findElement(By.id("login-username")).sendKeys(emailid);
     driver.findElement(By.id("login-signin")).click();
     
}
}
