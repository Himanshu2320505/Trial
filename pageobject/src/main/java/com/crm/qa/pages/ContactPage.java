package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase {
	@FindBy(xpath="//div[text()='Contacts']")
	WebElement contactLabel;
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	} 
	
	public boolean verifyContactLabel() {
		return contactLabel.isDisplayed();
		
	}
	
	public void createNewContact() {
		driver.findElement(By.xpath("//button[contains(text(),'New')]"));
	}
}
