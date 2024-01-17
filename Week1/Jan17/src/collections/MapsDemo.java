package collections;



import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Mahesh", 600);
		m.put("Chiranjeevi",900); 
		m.put("Balaiah",500); 
		m.put("Venkatesh",600); 
		m.put("Nagarjuna",800);
		System.out.println(m);
		Set<String> set = m.keySet();
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			String s = i.next();
			System.out.println(s + " " + m.get(s));
		}
		
		Map<String, Integer> m2 = new TreeMap<String, Integer>();
		m2.put("Mahesh", 600);
		m2.put("Chiranjeevi",900); 
		m2.put("Balaiah",500); 
		m2.put("Venkatesh",600); 
		m2.put("Nagarjuna",800);
		System.out.println(m2);
		Set<String> set2 = m2.keySet();
		Iterator<String> it = set2.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str + " " + m2.get(str));
		}
		
		Map<String, Integer> m3 = new Hashtable<String, Integer>();
		m3.put("Mahesh", 600);
		m3.put("Chiranjeevi",900); 
		m3.put("Balaiah",500); 
		m3.put("Venkatesh",600); 
		m3.put("Nagarjuna",800);
		System.out.println(m3);
		Set<String> set3 = m3.keySet();
		Iterator<String> itr = set3.iterator();
		while(itr.hasNext()) {
			String s3 = itr.next();
			System.out.println(s3 + " " + m3.get(s3));
		}

	}

}
