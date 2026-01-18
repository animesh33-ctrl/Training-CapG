package array.assignments;

public class PairSum {
    public static void main(String[] args) {
        int[] a={1,5,7,2,4,3};
        int target=6;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    System.out.println(a[i]+","+a[j]);
                }
            }
        }
    }
}
