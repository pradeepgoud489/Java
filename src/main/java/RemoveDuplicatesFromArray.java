import java.util.HashSet;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int a[]={1,2,3,5,1};
        HashSet<Integer> b= new HashSet();
        for(int i=0;i<a.length;i++){
            b.add(a[i]);
        }
        System.out.println(b);
    }
}
