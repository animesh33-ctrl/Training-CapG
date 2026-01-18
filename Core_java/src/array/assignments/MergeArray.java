package array.assignments;

public class MergeArray {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        int[] c=new int[a.length+b.length];
        int k=0;

        for(int x:a) c[k++]=x;
        for(int x:b) c[k++]=x;

        for(int x:c) System.out.print(x+" ");
    }
}
