package collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + "  " + name + "  " + marks);
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 75));
        students.add(new Student(2, "Amit", 35));
        students.add(new Student(3, "Sneha", 82));
        students.add(new Student(4, "Neha", 40));
        students.add(new Student(5, "Rohit", 28));

        System.out.println("---- All Students ----");
        for (Student s : students) {
            s.display();
        }

        System.out.println("\n---- Passed Students ----");
        for (Student s : students) {
            if (s.marks >= 40) {
                s.display();
            }
        }

        Student topper = students.get(0);
        for (Student s : students) {
            if (s.marks > topper.marks) {
                topper = s;
            }
        }
        System.out.println("\n---- Topper ----");
        topper.display();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(searchName)) {
                System.out.println("Student Found:");
                s.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }

        int passCount = 0, failCount = 0;
        for (Student s : students) {
            if (s.marks >= 40)
                passCount++;
            else
                failCount++;
        }

        System.out.println("\n---- Result Count ----");
        System.out.println("Passed: " + passCount);
        System.out.println("Failed: " + failCount);

        sc.close();
    }
}
