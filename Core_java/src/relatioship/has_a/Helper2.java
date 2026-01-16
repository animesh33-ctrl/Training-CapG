package relatioship.has_a;

public class Helper2 {
	public static void main(String[] args) {
		College cl = new College();
		Student st = new Student();
		Trainer tr = new Trainer();
		
		cl.setName("IEM");
		cl.setLocation("Saltlake");
		cl.setStudent(st);
		cl.setTrainer(tr);
		
		st.setId(1);
		st.setName("Animesh");
		
		tr.setName("Sandeep Chavan");
		tr.setSubject("Java");
		tr.setStudent(st);
		
		cl.display();
	}
}