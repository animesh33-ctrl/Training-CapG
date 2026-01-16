package supercall;

public class Student extends Human{
	float percentage;

	public Student(String name,int age,char gender,float percentage) {
		super(name,age,gender);
		this.percentage = percentage;
	}
	
	public void display() {
		super.display(name, age, gender);
		System.out.println("Percentage : "+this.percentage);
	}
	
	public static void main(String[] args) {
		Student s = new Student("Animesh", 23, 'M', 99.99f);
		s.display();
	}
	
}
