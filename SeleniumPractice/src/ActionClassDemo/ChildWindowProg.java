package ActionClassDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowProg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://support.google.com/mail/answer/8494?co=GENIE.Platform%3DDesktop&hl=en");
		driver.findElement(By.cssSelector("a.action-button")).click();
		System.out.println("before switching ");
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println("After Switching");
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println("Switching bak to parent class");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
