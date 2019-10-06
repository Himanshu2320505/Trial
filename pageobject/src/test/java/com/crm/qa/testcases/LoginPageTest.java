package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homepage;

	public LoginPageTest() {
		super(); // to call the parent class constructor -TestBase()
	}

	@BeforeMethod
	public void setUp() {

		initialization(); // from testbase class
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void LoginPageTestmethod() { // constructor
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");

	}

	@Test(priority = 2)
	
	public void loginTest() {
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
