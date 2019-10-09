package Interview_ques;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Please enter the number for multiplication table:");
		
		int n ;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		
		for (int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+(i*n));
		}

	}

}
