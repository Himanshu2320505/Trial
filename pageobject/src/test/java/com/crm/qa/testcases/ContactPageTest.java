package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.utilities.TestUtil;

public class ContactPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homepage;
	TestUtil testUtil;
	ContactPage contactPage ;

	public ContactPageTest() {
		super(); // to call the parent class constructor -TestBase()
	}
	
	@BeforeMethod
	public void setUp() {

		initialization(); // from testbase class
		
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		homepage=new HomePage();
		contactPage= new ContactPage();
		homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnContactsLink();
	}
	
	@Test
	public void verifyContactpageLabel() {
		Assert.assertTrue(contactPage.verifyContactLabel() , "contact label is missing on the page");
	
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}



}
