import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe"); //to set system property 
     WebDriver driver = new ChromeDriver();// to create webdriver object
     driver.get("http://google.com");// to invoke browser
     
  System.out.println(driver.getTitle());
driver.get("http://facebook.com");
driver.navigate().back(); // to navigate to back/forward page
driver.close();// it closes current browser window
driver.quit(); //it closes all the browsers opened by selenium script

	}

}
