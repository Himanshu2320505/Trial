package imp;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		
		int n;//number to be entered
		System.out.println("Please enter the number to dispay the table:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	
		
		for (int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
		

	}

}
