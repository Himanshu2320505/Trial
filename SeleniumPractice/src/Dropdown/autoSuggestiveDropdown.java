package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://makemytrip.com");
		WebElement source = driver.findElement(By.xpath("//input[@id='fromCity']"));
		Thread.sleep(2000L);
		//source.clear();  //not getting cleared
		source.click();//after clicking not able to find the xpath of the displayed field
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mum");/*taken xpath from browser tool 
		which displays the field to enter the city...Is the xpath valid ??*/
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click(); 
		
	}

}
