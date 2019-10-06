package TestNG;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void login() {
		System.out.println("I am logged in");
		int i = 9/0; 
	}

	
	@Test(dependsOnMethods="login")
	public void HomePageTest() {
		System.out.println("Homepage is displayed");
	}
	
	@Test(dependsOnMethods="login")
	public void RegPage() {
		System.out.println("Reg page is displayed");
}
	@Test(dependsOnMethods="login")
	public void searchPage() {
		System.out.println("Search page is displayed");
}
}
