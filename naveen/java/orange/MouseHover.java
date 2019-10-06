package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHover extends Login{
	public static void main(String[] args) {
		MouseHover mv=	new MouseHover();
		mv.startup();
		mv.mousehover();
		mv.teardown();
		
	}
	public void mousehover() {
		
	WebElement obj=driver.findElement(By.linkText("Admin"));	
	Actions a= new Actions(driver);
	a.moveToElement(obj).perform();
	
WebElement obj1=	driver.findElement(By.linkText("Company Info"));
a.moveToElement(obj1).perform();

driver.findElement(By.linkText("General")).click();
driver.switchTo().frame("rightMenu");
driver.findElement(By.id("editBtn")).click();
driver.findElement(By.id("txtCompanyName")).sendKeys("Himans");
driver.switchTo().defaultContent();
		
		
	}
	
	

}
