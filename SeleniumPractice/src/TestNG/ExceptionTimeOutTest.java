package TestNG;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	@Test(timeOut=4000) // the infinite loop will run for 4 secs and then terminate

	public void infiniteLoop() {
		int i =1;
		while(i==1) {
			System.out.println(i);
		}
	}

}
