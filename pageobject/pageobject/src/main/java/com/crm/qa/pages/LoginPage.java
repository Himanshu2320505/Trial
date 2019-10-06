package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factories or Page repositories
	@FindBy(name="email")
	WebElement username ;
	
	@FindBy(name="password")
	WebElement password ;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement SignUpBtn ;

	//initializing the page objects 
	public LoginPage() { //constructor
		PageFactory.initElements(driver, this);// thhrough initElements we initiazlize page factories
	}
	
	//actions(different features available on login page)
	public String validateLoginPageTitle() {
		return driver.getTitle();
		
	}
	
	public HomePage login(String un, String pw) {
		username.sendKeys(un);
		password.sendKeys(pw);
		loginBtn.click();
		
		return new HomePage() ;
	}
}
