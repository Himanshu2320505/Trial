package random;



public class Palindrome {

	public static void main(String[] args) {
	String s ="madam" ;
	String t = "" ;
	
	for (int i=s.length()-1 ; i>=0 ;i--) {
     t=t+s.charAt(i);
	}
	if(t.equals(s)) {
		System.out.println("its a fucking palindrome");
}
	else {
		System.out.println("its not a palindrome");
	}
}
}
