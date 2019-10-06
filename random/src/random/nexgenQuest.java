package random;

public class nexgenQuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=1; i <= 100 ; i++) {
	if ((i%3==0 && i%5==0)) {
	System.out.print("pmg"+" ");  
}
	else if (i%5==0)  {
	System.out.print("buzz" + " ");
	}
	else if (i%3==0)  {
		System.out.print("fizz" + " ");
	}
	
	else {
		System.out.print(i + " ");
	}

}
	
}
}