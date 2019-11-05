package montyPractise;

public class ReverseWords {

	public static void main(String[] args) {
		String s = "Java is my favorit lang";
		String temp = "";
		String[] t = s.split(" ");
		for (int i = t.length - 1; i >= 0; i--) {
			temp = temp + t[i] + " ";

		}
		System.out.println(temp);

	}

}
