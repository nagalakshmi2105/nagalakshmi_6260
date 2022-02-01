package mapDemo;

import java.util.Hashtable;

public class hashtable {

	public static void main(String[] args) {
		
		// No need to mention the
        // Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();
  
        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2
            = new Hashtable<Integer, String>();
  
        // Inserting the Elements
        // using put() method
        ht1.put(01, "santhiya");
        ht1.put(02, "safi");
        ht1.put(03, "sona");
  
        ht2.put(04, "haasi");
        ht2.put(05, "krish");
        ht2.put(06, "niji");
  
        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);

	}

}
