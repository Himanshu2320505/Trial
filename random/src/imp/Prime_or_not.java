package imp;

import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		int i,n;
		boolean prime;
		System.out.println("Enter the number to check it is peime or not : ");
		Scanner sc =new Scanner(System.in);
		 n=sc.nextInt();
		 
		 for(i=1;i<n;i++) {
			 if(n%i==0) {
				 prime=false;
				// System.out.println("number is not prime");
			 }
				 if(prime=true) {
					 System.out.println("its prime");
					 break;
				 }
				 else {
					 System.out.println("its not prime");
					 break;
				 }
			 }
		 }

	}


