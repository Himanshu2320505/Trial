package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropDown {

	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver ();
driver.get("https://www.spicejet.com/?utm_source=google&utm_medium=cpc&utm_campaign=spicejetsaleaug2019&gclid=Cj0KCQjw753rBRCVARIsANe3o45YVrkZyzlqm55sdjtPNK-6W3NlrEK6K86Q7scRwpLCk9Gxq11mkBsaAjU8EALw_wcB");
System.out.println(driver.findElement(By.cssSelector("input[name*='IndArm']")).isSelected());
driver.findElement(By.cssSelector("input[name*='IndArm']")).click();
System.out.println(driver.findElement(By.cssSelector("input[name*='IndArm']")).isSelected());

//To check the number of checkboxes in the webpage:
System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());//size() not woking

driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_ddl_originStation1_CTXT')]")).click();
driver.findElement(By.xpath("//a[contains(@value,'BLR')]")).click();// for "TO" field
//driver.findElement(By.xpath("//a[contains(@value,'MAA')[2]")).click();//for "FROM" field using index concept
driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[contains(@value,'MAA')]")).click();
// for "FROM" field using parent child xpath relation ship
	}

}
