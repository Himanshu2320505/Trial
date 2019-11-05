package montyPractise;

public class StringReverseEliminatingDuplicate {

	public static void main(String[] args) {
	String s="brilliant";
	String sb= "";
	for(int i=s.length()-1;i>=0;i--) {
		String st =s.substring(i,i+1);
		
		if(sb.indexOf(st)==-1) {
			sb.concat(st);
			System.out.println(sb);
		}
	}
	
System.out.println(sb); 

   String a="java";
   String b="sel";
   a=a.concat(b);//javasel
   b=a.substring(0,(a.length()-b.length()));//java
   a=a.substring(b.length());
   System.out.println(a);
   System.out.println(b);

	}

}
