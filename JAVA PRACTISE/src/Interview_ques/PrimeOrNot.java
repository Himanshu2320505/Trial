package Interview_ques;

import java.util.Scanner;

public class PrimeOrNot {

	public static boolean main(int num) {
		
		int count;
		
	
		//System.out.println("Enter the number:");
		//Scanner sc=new Scanner(System.in);
		//n=sc.nextInt();
			
				for(int i=2;i<num;i++) {
			 //count=0;	
				while(num%i==0) {
					
					System.out.println("not a prime");
					
					return false;
					
					
				}
				
				
		
			//if (count==2) {
				//System.out.println("Its prime");
			
		//	else {
			//	System.out.println("prime");
			//}

	}
		
		System.out.println("prime");
		return true;

}
	public static void main (String args[]) {
		System.out.println("2 is prime " + main(2));
		System.out.println("3 is prime " + main(3));
		System.out.println("4 is prime " + main(4));
		System.out.println("5 is prime " + main(5));
	}
}

