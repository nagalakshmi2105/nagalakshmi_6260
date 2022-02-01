package SetDemo;
import java.util.*;
public class treeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a Set interface with reference to
        // TreeSet
        Set<String> ts1 = new TreeSet<>();
 
        // Elements are added using add() method
        ts1.add("silver");
        ts1.add("gold");
        ts1.add("platinum");
 
        // Duplicates will not get insert
        ts1.add("diamond");
 
        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts1);
    }


	}


