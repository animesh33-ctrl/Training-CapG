package supercall;

public class Employee extends Human{
	int id;
	float salary;
	public Employee(String name, int age, char gender, int id, float salary) {
		super(name, age, gender);
		this.id = id;
		this.salary = salary;
	}
	
	public void display() {
		super.display(name, age, gender);
		System.out.println("Id : "+this.id);
		System.out.println("Salary : "+this.salary);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Aditya", 22, 'F', 1, 123);
		e.display();
	}
}
