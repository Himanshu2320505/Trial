package Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Pencho");
		a.add("kutreya");
		a.add("camilio");
		System.out.println(a);
		a.add(1, "makichu");
		a.add("camilio");
		System.out.println(a);
		//a.remove(3);
		//a.remove("kutreya");
		System.out.println(a);
		System.out.println(a.get(3));
		System.out.println(a.contains("java"));
		System.out.println(a.contains("Pencho"));
	System.out.println(	a.indexOf("kutreya"));
	System.out.println(a.size());
		a.clear();
	//	System.out.println(a);//Deletes all the element
		
	}

}
