package studentmanagementsystem;

public class StudentCourse {
	public static void showStudentCourseDetails(Student s) {
		System.out.println("------Student Information-------");
		System.out.println("Name : " + s.getName());
		System.out.println("Age : " + s.getAge());
		System.out.println("Roll : " + s.getRoll());
		System.out.println("Grade : " + s.getGrade());
		System.out.println("Course Id : " + s.getCourse().getCourseId());
		System.out.println("Course Name : " + s.getCourse().getCoursename());
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		Course c = new Course();
		
		c.setCourseId(3);
		c.setCoursename("Java");
		
		s.setName("Animesh");
		s.setAge(22);
		s.setRoll(2);
		s.setGrade('A');
		s.setCourse(c);
		
		showStudentCourseDetails(s);
		
	}
}
