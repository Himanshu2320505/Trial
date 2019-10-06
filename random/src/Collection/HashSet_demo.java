package Collection;

import java.util.HashSet;
import java.util.Iterator;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class HashSet_demo {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("camilio");
		h.add("emilio");
		h.add("messi");
		h.add("ronaldo");
		h.add("ramos");
		h.add("KOVA");
		System.out.println(h);
		h.add("camilio");
		System.out.println(h);
		System.out.println(h.size());	
		System.out.println(h.isEmpty());
		
		
		Iterator <String> i = h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		
	}

}
}
