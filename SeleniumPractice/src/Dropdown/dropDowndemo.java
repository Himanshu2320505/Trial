package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDowndemo {
	//this is for static dropdown 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/practice.php");
      //  Select s = new Select(driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]")));
        Select s = new Select(driver.findElement(By.xpath("html/body/div/div[3]/fieldset/select")));/*Absolute xpath to select the field
        so that dropdown appears*/

        s.selectByIndex(2);
        s.selectByValue("option1");
	}

}
