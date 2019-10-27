package Interview_ques;

public class NumberOfAlphabetsandnumbers {

	public static void main(String[] args) {
		
		String test = "AD6SD;GLHKJPORQ5W3Dpgl 1 2f3qe3rewDDVVS#$%^&* (AD6FAD6D65CSD";
		

	char[]ch=test.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < test.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
		System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
			
		}
				

	}



