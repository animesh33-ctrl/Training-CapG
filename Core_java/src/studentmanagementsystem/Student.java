package studentmanagementsystem;

public class Student extends Person {
	private int roll;
	private char grade;
	private Course course;
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public char getGrade() {
		return grade;
	}
	
	public void setCourse(Course c) {
		this.course = c;
	}
	
	public Course getCourse() {
		return course;
	}
}
