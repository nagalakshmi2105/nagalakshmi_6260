package SetDemo;
import java.util.*;
public class stroingString {


		
		public static void main(String[] args) {
			TreeSet<String> set = new TreeSet<>();
			//Collection<String> set = new TreeSet<>(Collections.reverseOrder());
			set.add("apple");
			set.add("papaya");
			set.add("grapes");
			set.add("pineapple");
			// reverse
			System.out.println("REVERSE TREESET ");
			TreeSet<String>list1=(TreeSet<String>)set.descendingSet();
			Iterator<String>itr=list1.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
		}
			//iteration
			System.out.println("Iteration TREESET ");
		Iterator<String> it = set.iterator();
			String query = "orange";
			boolean result = false;
			
			while (it.hasNext()) {
				if (it.next().equals(query)) {
					result = true;
					break;
				}
			}
			//searching
			if (result) System.out.println(query + " exists");
			else System.out.println(query + " doesn't exist");

		}

}


