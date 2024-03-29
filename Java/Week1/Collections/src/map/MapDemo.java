package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer, String>();
		
		map.put(99, "Bhumi");
		map.put(102, "Madhuri");
		map.put(109, "Madhav");
		map.put(102, "Ram");
		map.put(13,  "Janaki");
		
		System.out.println(map);
		
		Set<Integer> set = map.keySet();
		
		Iterator<Integer> it = set.iterator();
		
		while (it.hasNext()) {
			Integer k = it.next();
			System.out.println(k + " " + map.get(k));
			
		}
		
		Map<Integer,String> map2 = new LinkedHashMap<Integer, String>();
		
		map2.put(99, "Bhumi");
		map2.put(102, "Madhuri");
		map2.put(109, "Madhav");
		map2.put(102, "Ram");
		map2.put(13,  "Janaki");
		map2.put(117, "Balram");
		
		System.out.println(map2);
		
		
		
		

	}

}
