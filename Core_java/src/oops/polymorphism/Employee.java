package oops.polymorphism;

public class Employee {
	
	int id;
	String name;
	int salary;
	String dept;
	
	public Employee(int id) {
		this.id = id;
	}
	public Employee(int id,String name) {
		this(id);
		this.name = name;
	}
	public Employee(int id,String name,int salary) {
		this(id,name);
		this.salary = salary;
	}
	public Employee(int id,String name,int salary,String dept) {
		this(id,name,salary);
		this.dept = dept;
	}
	
	
	public void display() {
		System.out.println("ID : "+this.id);
		System.out.println("NAME : "+this.name);
		System.out.println("SALARY : "+this.salary);
		System.out.println("DEPARTMENT : "+this.dept);
		System.out.println("------------------------------");
	}
	
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(2,"Animesh");
		Employee e3 = new Employee(3,"Animesh",12000);
		Employee e4 = new Employee(4,"Animesh",12000,"IT");
		e1.display();
		e2.display();
		e3.display();
		e4.display();
	}
	
}
