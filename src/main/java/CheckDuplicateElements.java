import java.util.HashSet;
import java.util.Set;

public class CheckDuplicateElements {


    public static void duplicates(int[] a){
        Set c= new HashSet();
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c.add(a[i]);
                }
            }
        }
        System.out.println(c);

    }
    public static void main(String[] args) {
        int []b={1,2,5,9,1,2};
        duplicates(b);
    }
}
