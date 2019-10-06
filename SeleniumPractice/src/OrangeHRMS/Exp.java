package OrangeHRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Exp extends E2E {
 @Test
	public static void mouseOver() {
		startUp();
		Actions a = new Actions(driver);
	WebElement we	=driver.findElement(By.linkText("Admin"));
	a.moveToElement(we).build().perform();
	
	tearDown(); 
		
	}

}
