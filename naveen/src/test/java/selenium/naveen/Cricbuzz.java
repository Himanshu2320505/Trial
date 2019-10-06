package selenium.naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HIMANSHU SEKHARDAS\\WORKAA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22673/snp-vs-jt-7th-match-caribbean-premier-league-2019");
	//int score =	driver.findElements(By.className("cb-col cb-col-8 text-right text-bold")).size();
	String batsman = driver.findElement(By.xpath("//div[@id='innings_1']/div/div[3]/div[1]")).getText();
	int x = driver.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]/div")).size();
	
	for (int i=2;i < x-2;i++) {
		
		String score = driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]/div["+i+"]/div[3]")).getText();
		System.out.println(score);
	}
	
	
	


	}

}
