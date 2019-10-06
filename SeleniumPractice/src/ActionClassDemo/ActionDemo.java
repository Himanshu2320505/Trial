package ActionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver ();
		driver.get("http://www.amazon.com/");
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).contextClick().build().perform();//moves to specific element
		
		WebElement move =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("shoes").doubleClick().
		build().perform();
		

	}

}
