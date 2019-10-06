package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitMechanism {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver =new ChromeDriver();
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.cssSelector("#FH-origin")).sendKeys("NYC");
		driver.findElement(By.cssSelector("#aria-option-0")).click();

	}

}
