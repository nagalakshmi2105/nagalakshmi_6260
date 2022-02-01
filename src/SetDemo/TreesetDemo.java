package SetDemo;
import java.util.*;
public class TreesetDemo {

	public static void main(String[] args) {
		
HashSet<String> set = new HashSet<>();
		
		set.add("cadburys");
		set.add("kitkat");
		set.add("munch");
		set.add("perk");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}



	}


