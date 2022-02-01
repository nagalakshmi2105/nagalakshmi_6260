package mapDemo;
import java.util.HashMap;
import java.util.Scanner;
public class nameAndnum {

	public static void main(String[] args) {
	

		HashMap<String,String> Details=new HashMap<String,String>();
		
		Details.put("HASINI", "83876 09876");
		Details.put("KRISH", "93076 09876");
		Details.put("NIJIRSHANA", "73876 87876");
		Details.put("BALAJI", "75876 09876");
		
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the name =");
		String name=sc.next().toUpperCase();
		
		if(Details.containsKey(name)) 
		{
			System.out.println(name +"= "+Details.get(name));
		}
		
	}

}
