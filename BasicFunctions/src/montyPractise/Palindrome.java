package montyPractise;

public class Palindrome {

	public static void main(String[] args) {
	String s="Madam";
	String t="";
       for(int i=s.length()-1;i>=0;i--) {
    	  t=t+s.charAt(i);
    	  
    	  }
       System.out.println(t);
       if(t.equalsIgnoreCase(s)) {
 		  System.out.println("palindrome");
    	   
       }
       else {
    	   System.out.println("not palindrome");
       }
	}

}
