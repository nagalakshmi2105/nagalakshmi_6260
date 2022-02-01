package assignment;
import java.util.*;
public class vectorDemo {

	
		private static Vector<Integer> list1 = new Vector<Integer>();
		
		public Vector<Integer> saveEvenNumbers(int N) {
			list1 = new Vector<Integer>();
			
			for (int i = 2; i <= N; i++) {
				if (i % 2 == 0) {
					list1.add(i);
			}
			}
			System.out.println("even numbers :"+list1);
			return list1;
		}
		
		public Vector<Integer> printEvenNumbers() {
			Vector<Integer> newList = new Vector<Integer>();
			
			for (int item : list1) {
				newList.add(item * 2);
				//System.out.println(item * 2);
			}
			System.out.println("Even numbers :"+newList);
			return newList;
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number:");
			int value=sc.nextInt();
			
			//ArrayList a1=new ArrayList();
			evenDemo asg = new evenDemo();
			asg.saveEvenNumbers(value);
			asg.printEvenNumbers();
			System.out.println("Enter The Number to search : ");
			int value1=sc.nextInt();
			System.out.println(list1.contains(new Integer(value1)));

			

		}

	

	}


