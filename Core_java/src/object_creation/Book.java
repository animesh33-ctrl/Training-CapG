package object_creation;

 public class Book {
    String title;
    String author;
    static BankAccount b11;
    BankAccount b12;
    void show() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Basics";
        b1.author = "James";
        b1.show();
        System.out.println(b11);
        System.out.println(b1.b12);
    }
}
