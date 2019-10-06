import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.qaclickacademy.com/practice.php");
driver.findElement(By.cssSelector("input#name")).sendKeys("Ronnie");
driver.findElement(By.cssSelector("#alertbtn")).click();
driver.switchTo().alert().accept();
driver.findElement(By.cssSelector(" input#confirmbtn")).click();
driver.switchTo().alert().dismiss();



	}

}
