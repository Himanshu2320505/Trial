package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_demo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap <Integer,String>();
		hm.put(1, "RMA");
		hm.put(2, "RMA");
		hm.put(3, "juve");
		hm.put(4, "barca");
		hm.put(5, "Manu");
		hm.put(6, "munich" + " liverpool");
				 
		hm.put(7, "arsenal");
		hm.put(8, "chelsea");
		hm.put(9, "psg");
		hm.put(10, "RMA");
		
		System.out.println(hm);
		Set sn =hm.entrySet();	
		Iterator it = sn.iterator();
		while(it.hasNext()) {
			Map.Entry mp =(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
