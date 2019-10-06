package Practicerandom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox searchCity inactiveWidget')]//label")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).clear();	
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='To']")).clear();	
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("GOA ");
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(1500L);
		String date ="26";
		String monthTobeselected="November 2019";
		
		for(int i=1; i<=12;i++) {
		String month =	driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText();
		
		if(month.equals(monthTobeselected)) {
			driver.findElement(By.xpath("(//div[@class='dateInnerCell'])["+date+"]")).click();
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[5]/div/p[1]")).click();
			break;
					
		}
		else {
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		
		}
		

			
		Thread.sleep(10000L);
		driver.close(); 
		

	}

}
