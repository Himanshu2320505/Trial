package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> rows = driver.findElements(By.xpath("// table[@id=\"customers\"]/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("total rows in the table :" + rowCount);

		System.out.println("*************");

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]
		// *[@id="customers"]/tbody/tr[4]/td[1]
		// *[@id="customers"]/tbody/tr[5]/td[1]
		String beforXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";

		for (int i = 2; i <= rowCount; i++) { // starting from 2 because the 1st rows are the fields
			String actualXpath = beforXpath + i + afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if (element.getText().equals("Laughing Bacchus Winecellars")) {
				System.out.println(element.getText() + "Element is found at: " + (i - 1));
				break;

			}

		}
		System.out.println("**************");

		// *[@id="customers"]/tbody/tr[2]/td[2]
		// *[@id="customers"]/tbody/tr[3]/td[2]
		String afterXpathContact = "]/td[2]";
		for (int i = 2; i <= rowCount; i++) { // starting from 2 because the 1st rows are the fields
			String actualXpath = beforXpath + i + afterXpathContact;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());

		}

		System.out.println("***************");

		// *[@id="customers"]/tbody/tr[2]/td[3]
		// *[@id="customers"]/tbody/tr[3]/td[3]
		// *[@id="customers"]/tbody/tr[4]/td[3]
		String afterXpathCountry = "]/td[3]";
		for (int i = 2; i <= rowCount; i++) {
			String actualXpath = beforXpath + i + afterXpathCountry;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());

		}
		// handle webtable coloumns
		// *[@id="customers"]/tbody/tr[1]/th[1]
		// *[@id="customers"]/tbody/tr[1]/th[2]
		// *[@id="customers"]/tbody/tr[1]/th[3]
		String beforeColoumn = "//*[@id=\'customers\']/tbody/tr[1]/th[";
		String AfterColoumn = "]";
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		int colCount = cols.size();
		System.out.println("The total number of coloumns are : " + colCount);
		System.out.println("**************************");
		System.out.println("Coloumn Values are :");
		for (int i = 1; i <= colCount; i++) {
			WebElement element = driver.findElement(By.xpath(beforeColoumn + i + AfterColoumn));
			String colText = element.getText();

			System.out.println(colText);
		}

	}

}
