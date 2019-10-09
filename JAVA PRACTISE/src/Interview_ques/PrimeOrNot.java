package Interview_ques;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=200;i++) {
			int count=0;
			for(n=i;n<=1;n++) {
				if(i%n==0) {
					count=count+1;
				}
		}
			if (count==2) {
				System.out.println("Its prime");
			}

	}

}
}
