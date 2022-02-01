package assignment;
import java.util.*;
//public class arraylist2 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		class MyArraylist <Integer> extends ArrayList<Integer> {
	

			@Override
			public boolean add(Integer e) {
				if (e instanceof Integer || e instanceof Float || e instanceof Double) {
					super.add(e);
					return true;
				} else {
					throw new ClassCastException("Only Integer, Float, and Double are supported.");
				}
			}
		}

public class arraylist2 {

			public static void main(String[] args) {
				List<Object> list = new MyArraylist<>();
				
				try {
					list.add(15);
					list.add(1.2F);
					list.add(3.1415D);
					list.add("Test");
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(list);
				}
}
			
