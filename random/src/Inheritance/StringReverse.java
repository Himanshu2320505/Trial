package Inheritance;

public class StringReverse {

	public static void main(String[] args) {
		String text="HIMANSHU";
		String reverse = "";
		for (int i= text.length()-1;i>=0;i--)
		{
			reverse=reverse+text.charAt(i);
		}
System.out.println("Reversed string is: "+ reverse);
	}

}
