package assignment;

import java.util.*;

public class EmployeeDemo {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		private int id;
		private String name;
		private String address;
		private Double salary;
		
		public EmployeeDemo(int id, String name, String address, Double salary) {
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
	

	//public class Assignment {

		public static void main(String[] args) {
			List<Employee> list = new ArrayList<>();
			
			list.add(new Employee(101, "hasini", "124 street, India", 20000.0));
			list.add(new Employee(102, "krish", "254 street, India", 30000.0));
			list.add(new Employee(103, "niji", "395 street, India", 25000.0));
			list.add(new Employee(104, "Sindhu", "406 street, India", 40000.0));
			
			Iterator<Employee> it = list.iterator();
			int searchId = 103;
			while (it.hasNext()) {
				Employee emp = it.next();
				if (emp.getId() == searchId)
					System.out.println(emp);
			}
		}

	
	}


