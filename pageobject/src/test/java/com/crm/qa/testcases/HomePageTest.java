package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();// to access loginPage class methods
		contactPage= new ContactPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password")); // to get to the
																								// homepage we need to
																								// login first

	}
	// Test cases should be independent -- independent of each other
	// before each test cases-- launch the browser and login
	// @Test -- execute the test case
	// after each test case--close the browser

	@Test(priority = 1)
	public void verifyHomePageTitle() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM", "Home Page title not mathed");
	}

	@Test(priority = 2)
	public void verifyUserName() {
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}

	@Test(priority = 3)
	public void verifyContactsLinkTest() {
		contactPage=homePage.clickOnContactsLink();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
