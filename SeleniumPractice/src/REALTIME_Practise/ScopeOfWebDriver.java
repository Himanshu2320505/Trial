package REALTIME_Practise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeOfWebDriver {

	public static void main(String[] args) throws InterruptedException {
		// 1. to find the number of links in the webpage
		// 2. to find the number of link in the footer section
		// 3. to find the number of link in the 1st coloumn of the footer section

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(
				By.cssSelector("#gf-BIG")); /* LIMITING WEB DRIVER SCOPE,IT WILL ONLY DETECT THE FOOTER SECTION */
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		WebElement coloumndriver = driver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());

		for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
		}
		Set<String> a = driver.getWindowHandles();
		Iterator<String> it = a.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}
}
