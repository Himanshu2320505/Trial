package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();// to access loginPage class methods
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password")); // to get to the  homepage we need to  login first
																						
	}
	
	@Test
	public void verifyHomePageTitle() {
	String homePageTitle=	homePage.verifyHomePageTitle();
	Assert.assertEquals(homePageTitle, "Cogmento CRM" , "Home Page title not mathed");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
