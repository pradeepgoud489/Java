import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {



    static void duplicateextra(int[]a){
        int[]temp=new int[a.length];int j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[j]=a[i];
                j++;
            }
        }
        temp[j]=a[a.length-1];
    }

    static char[] duplicateNoXtra(char []a){
        int j=0;
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                a[j]=a[i];
                j++;
            }
        }
       // a[j]=a[a.length-1];

        return a;
    }

    public static void main(String[] args) {

        int a[]={1,2,3,5,1};
        HashSet<Integer> b= new HashSet();
        for(int i=0;i<a.length;i++){
            b.add(a[i]);
        }
        System.out.println(b);
        String s="pradeep";
        char[]c=s.toCharArray();
      //  int x=duplicateNoXtra(c);
      //  for (char z:e){
       //     System.out.println(z);
       // }
    }



}
