package ActionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size()); //to getthe size
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions a=new Actions(driver);
		WebElement source =driver.findElement(By.cssSelector("#draggable"));//for the object t br dragged
		WebElement target = driver.findElement(By.cssSelector("#droppable"));// for the object where it is supposed to be dragged
		a.dragAndDrop(source, target).build().perform();//will drag and  drop the element in the 
		driver.switchTo().defaultContent();// to come to te default content

	}

}
