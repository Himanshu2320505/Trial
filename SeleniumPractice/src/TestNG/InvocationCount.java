package TestNG;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test (invocationCount=10) // to repeat a test case number of time to generate data
	public void sum() {
		int a =10;
		int b =20;
		int c= a+b;
		System.out.println("The sum is : " +c);
	}

}
