package Interview_ques;

public class StringReverse {

	public static void main(String[] args) {

      String s= "Himanshu" ;
      String t="";
      for(int i=s.length()-1;i>=0;i--) {
    	  t=t+s.charAt(i);
    	 
      }
      System.out.println(t);
      if(s.equals(t)) {
    	  System.out.println("its palindrome");
      }
      
      else {
    	  System.out.println("nope its not a palindrome");
      }
	}

}
