package imp;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
	 int  n,i;
	 System.out.println("Enter the number to display the table");
	 

	  Scanner sc = new Scanner(System.in) ;
	  n=sc.nextInt();
	  
	  for (i=1 ;i<=10;i++) {

  System.out.println(n+"*"+i+"="+(n*i));
      
	}

}
} 
