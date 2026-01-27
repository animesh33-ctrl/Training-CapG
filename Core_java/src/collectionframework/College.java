package collectionframework;

interface Sports {
    void play();
}

public class College {

    String collegeName = "ABC Engineering College";
    static String city = "Kolkata";

    class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        void displayStudent() {
            System.out.println("Student ID   : " + id);
            System.out.println("Student Name : " + name);
            System.out.println("College      : " + collegeName);
        }
    }

    static class Department {
        String deptName;

        Department(String deptName) {
            this.deptName = deptName;
        }

        void displayDepartment() {
            System.out.println("Department   : " + deptName);
            System.out.println("City         : " + city);
        }
    }

    void showResult() {

        int passMarks = 40; // effectively final

        class Result {
            void checkResult(int marks) {
                if (marks >= passMarks)
                    System.out.println("Result       : PASS");
                else
                    System.out.println("Result       : FAIL");
            }
        }

        Result r = new Result();
        r.checkResult(65);
    }

    public static void main(String[] args) {

        College college = new College();

        College.Student s = college.new Student(101, "Rahul");
        s.displayStudent();

        System.out.println("--------------------------------");

        College.Department d = new College.Department("Computer Science");
        d.displayDepartment();

        System.out.println("--------------------------------");

        college.showResult();

        System.out.println("--------------------------------");

        Sports sports = new Sports() {
            public void play() {
                System.out.println("Sports       : Cricket");
            }
        };

        sports.play();
    }
}
