package supercall;

public class Human {
	String name;
	int age;
	char gender;
	public Human(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void display(String name,int age,char gender) {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
	}
}
