package montyPractise;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int i,j;
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		//for(i=1;i<=100;i++) {
			int count=0;
			for(j=num;j>=1;j--) {
				if(num%j==0) {
					count++;
					
				}
				
				
			}
			if(count==2) {
				System.out.println("is a prime");
		}
			else {
				System.out.println("no is not prime");
			}
	}

}


