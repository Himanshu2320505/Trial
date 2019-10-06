package selenium.naveen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/zoopla.co.uk");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.findElement(By.id("search-input-location")).sendKeys("London");
	 driver.findElement(By.id("search-input-location")).sendKeys(Keys.ENTER);
	 System.out.println("london");
	// driver.findElement(By.id("search-submit")).click();
	 System.out.println("lega mu me");
	 int count = driver.findElements(By.xpath("//div[@class='listing-results-right clearfix']/a")).size();
	 System.out.println(count);
	List<Integer> l=new ArrayList<Integer>();
	 for(int i =1;i<=count;i++) {
		 
		 String temp= driver.findElement(By.xpath("(//div[@class='listing-results-right clearfix']/a)["+i+"]")).getText();
		 String temponlyamt = temp.replaceAll("[^0-9]", "");
		 int temponlyamtint =Integer.parseInt(temponlyamt);
		 l.add(temponlyamtint);
	 }
	 
	 Collections.sort(l, Collections.reverseOrder());
	 System.out.println(l);
	 
	System.out.println(driver.findElement(By.xpath("(//div[@class='listing-results-right clearfix']/a)[5]")).getText());
	driver.findElement(By.xpath("(//a[@class='photo-hover'])[5]")).click();
String monty =	driver.findElement(By.className("ui-agent__name")).getText();
	driver.findElement(By.className("ui-agent__name")).click();
	System.out.println(monty);
	
	 
	 
	 
	}

}
