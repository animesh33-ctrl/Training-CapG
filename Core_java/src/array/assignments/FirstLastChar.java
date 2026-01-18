package array.assignments;

public class FirstLastChar {
    public static void main(String[] args) {
        String[] a = {"apple","banana","cat"};
        for(String s:a){
            System.out.println(s.charAt(0)+" "+s.charAt(s.length()-1));
        }
    }
}

