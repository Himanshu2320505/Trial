package REALTIME_Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.cssSelector("#travel_date")).click();
	while(!driver.findElement(By.cssSelector("[class='datepicker-switch'][class='datepicker-switch']")).getText().contains("October")) {
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		
	}

		List<WebElement> l = driver.findElements(By.cssSelector(".day"));
		int count = driver.findElements(By.cssSelector(".day")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if (text.equalsIgnoreCase("14")) {
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}

	}

}
