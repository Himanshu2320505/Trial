package Interview_ques;

public class GreatestNumber {

	public static void main(String[] args) {
		int arr[] = {14,58,75,15,65,41,54,48} ;
		int val=arr[0];
		System.out.println(val);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>val) {
				val=arr[i];
			}
		}
		System.out.println(val);
	}

}

