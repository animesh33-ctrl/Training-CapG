package collectionframework;

public class Employee {
	int id;
	String name;
	float salary;
	
	
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "id : "+id+" name : "+name+" salary : "+salary;
	}

}
