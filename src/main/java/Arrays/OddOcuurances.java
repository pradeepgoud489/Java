package Arrays;

public class OddOcuurances {
    public static void main(String[] args) {
        int a[]={1,2,3,1,4,2,4};int c=0;
        c=a[0];
        for(int i=1;i<a.length;i++){
             c^=a[i];
        }
        System.out.println(c);
    }
}
