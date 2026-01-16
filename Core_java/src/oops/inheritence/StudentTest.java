package oops.inheritence;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();

        s.setId(101);
        s.setName("Rahul");
        s.setMarks(85);

        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}

