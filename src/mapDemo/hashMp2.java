package mapDemo;
import java.util.*;
import java.util.Map.Entry;
public class hashMp2 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		public static void main(String[] args) {
			Map<String, String> map = new HashMap<String,String>();
			
			map.put("India", "Delhi");
			map.put("Japan", "Tokyo");
			map.put("Bangladesh", "Dhaka");
			System.out.println("size of the map "+map.size());
			// a) Check if a particular key exists or not 
			
			Set<Entry<String, String>> set = map.entrySet();
			Iterator<Entry<String, String>> it = set.iterator();
			
			while (it.hasNext()) {
				Map.Entry<String, String> me = it.next();
				
				if (me.getKey().equals("Japan")) {
					System.out.println("Key Japan exists");
					break;
				}
			}
			
			// b) Check if a particular value exists or not 
			System.out.println("To check particular string  :");
			System.out.println();
			set = map.entrySet();
			it = set.iterator();
			
			while (it.hasNext()) {
				Map.Entry<String, String> me = it.next();
				
				if (me.getValue().equals("Delhi")) {
					System.out.println("Value Delhi exists");
					break;
				}
			}
			
			// c) Use Iterator to loop through the map key set
			
			set = map.entrySet();
			it = set.iterator();
			System.out.println(" ");
			while (it.hasNext()) {
				Map.Entry<String, String> me = it.next();
				System.out.println(me);
				System.out.println("Key: " + me.getKey() + ", Value: " + me.getValue());
			}
	}

}
