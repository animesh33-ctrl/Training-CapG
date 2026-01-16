package relatioship.has_a;

public class College {

	private String name;
	private String location;
	private Student student;
	private Trainer trainer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
	public void display() {
		System.out.println("--------College Information----------");
		System.out.println("Name : "+this.name);
		System.out.println("Location : "+this.location);
		System.out.println("\n--------Trainer Information----------");
		System.out.println("Name : "+this.trainer.getName());
		System.out.println("Subject : "+this.trainer.getSubject());
		System.out.println("\n--------Student Information----------");
		System.out.println("Id : "+this.student.getId());
		System.out.println("Name : "+this.student.getName());
	}
	
}
