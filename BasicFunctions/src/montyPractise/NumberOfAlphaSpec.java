package montyPractise;

public class NumberOfAlphaSpec {

	public static void main(String[] args) {
		String s="g4h 65j6hj4KSKSSKSKh35j4 5j4gh 3j&@&^%&#^@&#";
		int num=0;
	//	int alpha=0;
		int space=0;
		int upperCase=0;
		int lowerCase=0;
		int special=0;
         for(int i=0;i<=s.length()-1;i++) {
        	 if(Character.isDigit(s.charAt(i))) {
        		 num++;
        	 }
        //	else if(Character.isAlphabetic(s.charAt(i))) {
        		 
        //		 alpha++;
        	
        //	}
        	 else if(Character.isUpperCase(s.charAt(i))) {
        		 upperCase++;
        	 }
        	 
        	 else if(Character.isLowerCase(s.charAt(i))) {
        		 lowerCase++;
        	 }
        	 else if(Character.isSpaceChar(s.charAt(i))) {
        		 space++;
        	 }
        	 else {
        		 special++;
        	 }
        	 
         }
         System.out.println("Number : "+num);
      //   System.out.println("Character : "+alpha);
         System.out.println("Space: "+space);
         System.out.println("Sym : "+special);
         System.out.println("LC:"+lowerCase);
         System.out.println("UC:"+upperCase);
	}

}
