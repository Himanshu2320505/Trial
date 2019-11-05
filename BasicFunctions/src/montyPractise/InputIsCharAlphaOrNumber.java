package montyPractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class InputIsCharAlphaOrNumber {

	public static void main(String[] args) {
		/*System.out.println("enter the character to be determined:");
		char ch;
		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			System.out.println("its an alphabet");
		}

		else if (ch >= '0' && ch <= '9') {
			System.out.println("its a number");
		}

		else {
			System.out.println("its a special character");
		}*/
		
		ArrayList<String> al=new ArrayList<String>();
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		al.add("ManishBhadwa");
		al.add("Amal");
		al.add("Rahull");
		al.add("Butts");
		int i=1;
		//int count = al.size();
		//for(int i=1;i<=count;i++) {		
		//hmap.put(i, al.get(i-1));
		
		for(String moon: al ) {
			
			hmap.put(i, moon);
			i++;
		}
		
	//	}
		
		
		System.out.println(hmap);
		
		System.out.println(al);
		//System.out.println(hmap);
				
	}

}
