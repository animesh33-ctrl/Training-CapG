package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDriver {
	
	public static void print(List<Employee> list) {
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println("=".repeat(40));
	}
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "ANimesh", 12000));
		list.add(new Employee(2, "Aditya", 13000));
		list.add(new Employee(3, "Sahil", 14000));

//		Collections.sort(list,(e1,e2)-> e1.salary - e2.salary); // if sal is int
		System.out.println("Sorted by id : ");
		Collections.sort(list, (e1, e2) -> e1.id - e2.id);
		print(list);
		
		System.out.println("Sorted by name : ");
		Collections.sort(list, (e1, e2) -> e1.name.compareTo(e2.name));
		print(list);
		
		System.out.println("Sorted by salary : ");
		list.sort((e1, e2) -> Float.compare(e1.salary, e2.salary));
		print(list);
		
		

	}
}
