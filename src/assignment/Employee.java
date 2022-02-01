package assignment;
import java.util.*;
public class Employee {

	//public static void main(String[] args) {
		private int id;
		private String name;
		private String address;
		private Double salary;
		
		public Employee(int id, String name, String address, Double salary) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.salary = salary;
		}	
		
		public int getId() {
			return id;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
		
	}

	//public class Employee {

		public static void main(String[] args) {
			Vector<Employee> list = new Vector<Employee>();
			
			list.add(new Employee(101, "niji", "123 street, India", 25000.0));
			list.add(new Employee(102, "krish", "234 street, India", 30000.0));
			list.add(new Employee(103, "safi", "345 street, India", 25000.0));
			list.add(new Employee(104, "Santhiya", "456 street, India", 40000.0));
			
			Iterator<Employee> it = list.iterator();
			while (it.hasNext()) 
				System.out.println(it.next());
		}
}


