package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		
		Xls_Reader reader = new Xls_Reader ("C:\\Users\\HIMANSHU SEKHARDAS\\eclipse-workspaceNEW\\SeleniumPractice\\src\\com\\testdata\\XYZ.xlsx");
		 
		  String firstName=   reader.getCellData("TestData", "firstname", 2);
		  System.out.println(firstName);
		  
		  String lastname=   reader.getCellData("TestData", "lastname", 2);
		  System.out.println(lastname);
		  
		  String emailid=   reader.getCellData("TestData", "emailid", 2);
		  System.out.println(emailid);
		  
		  String password=   reader.getCellData("TestData", "password", 2);
		  System.out.println(password);
		  
		  
		  
		  
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://reg.ebay.in/reg/PartialReg");

		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailid);
		driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys(password);
	
	
	
	
	}

}
