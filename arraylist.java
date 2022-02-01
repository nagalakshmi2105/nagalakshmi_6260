package assignment;
import java.util.*;

public class arraylist {

	public static void main(String[] args) {
		

		List<String> list =  new ArrayList<String>();
		list.add("purple");
		list.add("blue");
		list.add("black");
		list.add("pink");
		
		printAll(list);
	}
		
	

	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}
	
