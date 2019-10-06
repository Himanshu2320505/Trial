import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchild_xpathdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\HIMANSHU SEKHARDAS\\\\WORKAA\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.xpath("//div[@id='ntp-contents']/div[2]/div/input")).sendKeys("Ronaldo");
		//driver.findElement(By.xpath("//div[@id='ntp-contents']/div[2]/div/div[3]/input")).sendKeys("Ronaldo");
	}

}
