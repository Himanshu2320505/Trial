package learningoops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SeleniumComponents {
	/*
	 * static SeleniumComponents First = new SeleniumComponents();
	 * 
	 * public void seleniumIde() {
	 * 
	 * String s = this.getClass().getSimpleName(); System.out.println(s +
	 * " - PerformRecord and Palyback"); }
	 * 
	 * public void seleniumWebdriver() {
	 * System.out.println("To develop Automation Scripts"); }
	 * 
	 * public void seleniumGrid() {
	 * System.out.println("To execute Scripts in Multiple Browsers and Systems"); }
	 * 
	 * public void p100() { p25(); p25(); p25(); p25(); }
	 * 
	 * public void p25() { p5(); p5(); p5(); p5(); p5(); }
	 * 
	 * public void p5() { p1(); p1(); p1(); p1(); p1(); }
	 * 
	 * public void p1() { System.out.println("Manish"); }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		First.seleniumIde();
//		First.seleniumWebdriver();
//		First.seleniumGrid();
//
//		String s1 = "Manish";
//		String s5 = s1 + s1 + s1 + s1 + s1;
//		String s25 = s5 + s5 + s5 + s5 + s5;
//		String s100 = s25 + s25 + s25 + s25;
		// System.out.println(s100);

		// First.p100();

		// System.out.println(String.format("%01000d",0).replace("0", "Manish "));

		/*
		 * for (int i = 0; i < 10; i++) { System.out.println("Java is very easy"); }
		 * 
		 * for (int i = 1; i <= 20; i++) { if (i % 2 != 0) { System.out.println(i); } }
		 */

		
		 Scanner in = new Scanner(System.in); 
		 int x = in.nextInt(); 
		 // nextInt is a pre-defined function which is used to accept only integer values 
		 int y = in.nextInt(); 
		 int z = x + y;
		 System.out.println("Sum of entered integers = "+ z); in.close();
		 

		/*
		 * System.out.println("enter the word"); Scanner nameinput = new
		 * Scanner(System.in);
		 * 
		 * String inputvalue= nameinput.nextLine(); 
		 * String reversevalue = ""; 
		 * int charactercount = inputvalue.length(); 
		 * for (int i =charactercount-1 ; i >= 0; i--) 
		 * { reversevalue = reversevalue + inputvalue.charAt(i);
		 * 
		 * } System.out.println(reversevalue); nameinput.close();
		 */

		
		 /*for (int i = 0; i < i+1; i++) { System.out.println("enter the number");
		  
		  Scanner in = new Scanner(System.in); int x = in.nextInt(); 
		  // nextInt is a pre-defined function which is used to accept only integer values
		 
		  int z = x % 2;
		  
		  if (z == 0) { System.out.println("the given number is EVEN"); } 
		  else {
		  System.out.println("the given number is ODD"); } //in.close(); i=i+1; }
		 }*/

//		Scanner inputno = new Scanner(System.in);
	//	String str = inputno.nextLine();

		/*
		 * int cnt = 0; char[] inp = str.toCharArray();
		 * System.out.println("Duplicate Characters are:");
		 *  for (int i = 0; i < str.length(); i++) { 
		 *  
		 *   for (int j = i + 1; j < str.length(); j++) {
		 *   
		 *    if (inp[i] == inp[j]) {
		 *    
		 *     System.out.println(inp[j]); cnt++; break; }
		 *      }
		 * 
		 * }
		 */
	/*	Map<Character, Integer> mymap = new HashMap<Character, Integer>();
		char[] input = str.toCharArray();

		for (char c : input) {
			if (mymap.containsKey(c)) {
				mymap.put(c, mymap.get(c) + 1);
			} else {
				mymap.put(c, 1);
			}
		}
		System.out.println(mymap);
		Set<Character> keys = mymap.keySet();
		for(char c :keys) {
			
			if(mymap.get(c)>1) {
				System.out.println(c +"="+mymap.get(c)+ "times");
			}
		}*/
		
        String strings = "99,42,55,81,79,64,22";
        String str[] = strings.split(",");
        
        ArrayList<String> arr = new ArrayList<String>();
        for(String s: str){
            System.out.println(s);
            arr.add(s);
        }
        System.out.println(arr);
    
		
	System.out.println("manish");
	String input = "manish";
	int count =input.length();
		
	String rev = "";
	
	for (int i=count-1;i>=0; i--) {
		
		rev= rev+input.charAt(i);
		
	}
	
	System.out.println(rev);
	if (input.equals(rev)) {
		System.out.println("pass");
	}
	System.out.println("fail");
	

	}
}