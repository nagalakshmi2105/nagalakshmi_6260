package assignment;
import java.util.*;
public class Linkelist {

		

		public static LinkedList<Integer> list = new LinkedList<Integer>();
		
		public LinkedList<Integer> saveEvenNumbers(int N) {
			list = new LinkedList<Integer>();
			
			for (int i = 2; i <= N; i++) {
				if (i % 2 == 0) {
					list.add(i);
			}
			}
			System.out.println("Even Numbers");
			return list;
		}
		
		public LinkedList<Integer> printEvenNumbers() {
			LinkedList<Integer> newList = new LinkedList<Integer>();
			
			for (int item : list) {
				newList.add(item * 2);
				System.out.println(item * 2);
			}
			System.out.println("Multiply with 2 :"+newList);
			return newList;
		}

		public static void main(String[] args) {
			Linkelist asg = new Linkelist();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number:");
			int value=sc.nextInt();
			int obj=sc.nextInt();
			//ArrayList a1=new ArrayList();
			//evenDemo asg = new evenDemo();
			asg.saveEvenNumbers(value);
			asg.printEvenNumbers();
			System.out.println("Enter The Number to search :");
			System.out.println(list.contains(new Integer(obj)));
			

		}

	
	}


