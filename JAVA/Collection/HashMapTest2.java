package collectionFrame;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		
		
		
		Map map = new HashMap();
		map.put("감자밭",new Integer(90));
		map.put("감자밭",new Integer(90));
		map.put("딸기밭",new Integer(100));
		map.put("사과밭",new Integer(110));
		map.put("포도밭",new Integer(120));
		map.put("블루베리밭",new Integer(130));		
		map.put("용과밭",new Integer(110));
		
		Set set;
		
		// key
		set = map.keySet();
		System.out.println(set);
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println("key : " + key + " , " + map.get(key) );
		}
		
		// value
		int sum=0;
		map.values().iterator();
		Iterator it1 = map.values().iterator();
		while(it1.hasNext()) {
			Integer i = (Integer)it1.next();
			sum += i;
			System.out.println(i);
		}
		System.out.println(sum);
		
		// key, value
		
		Iterator it3 = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();// 반환하는게 Map.entry ...interface 
			System.out.println("이름 : "+ e.getKey() + ", 점수 : "+ e.getValue());
			
		}
		
		
	}

}
