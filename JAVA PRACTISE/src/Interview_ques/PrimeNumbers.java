package Interview_ques;

public class PrimeNumbers {

	public static void main(String[] args) {
		int count, num;
		
		String Primenumber = "";
		for (int i = 1; i <= 100; i++) {
			count = 0;

			for (num = i; num >= 1; num--) {

				if (i % num == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				Primenumber = Primenumber + i + " ";
			}
		}
		System.out.println("The Prime Numbers are:");
		System.out.println(Primenumber);
	}

}
