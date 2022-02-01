package assignment;
import java.util.*;
public class evenDemo {

	//public static void main(String[] args) {
		public static ArrayList<Integer> list = new ArrayList<Integer>();
		
		public ArrayList<Integer> saveEvenNumbers(int N) {
			list = new ArrayList<Integer>();
			
			for (int i = 2; i <= N; i++) {
				if (i % 2 == 0) {
					list.add(i);
			}
		}
		System.out.println("Even numbers  :"+list);
			
			return list;
		}
		
		public ArrayList<Integer> printEvenNumbers() {
			ArrayList<Integer> newList = new ArrayList<Integer>();
			
			for (int element: list) {
				newList.add(element * 2);
				//System.out.println(item * 2);
			}
			System.out.println("Multiple with 2 :"+newList);
			
			return newList;
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number:");
			int value=sc.nextInt();
			int obj=sc.nextInt();
			//ArrayList a1=new ArrayList();
			evenDemo asg = new evenDemo();
			asg.saveEvenNumbers(value);
			asg.printEvenNumbers();
			System.out.println("Enter The Number to search :");
			System.out.println(list.contains(new Integer(obj)));

		}

	

	}


