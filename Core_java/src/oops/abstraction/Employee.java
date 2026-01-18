package oops.abstraction;

public abstract class Employee {
	int id;
	String name;
	
	public Employee() {}
	public Employee(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public abstract void display();
	
	public static void main(String[] args) {
		Raju r = new Raju(10,"Raju",12000.0);
		r.display();

		Employee e = new Raju(10,"Raju",12000.0);
		e.display();
	}
}


class Raju extends Employee {
	double sal;
	public Raju(int id,String name,double sal) {
		super(id,name);
		this.sal = sal;
	}
	
	@Override
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
		System.out.println("--------------------------");
	}
}