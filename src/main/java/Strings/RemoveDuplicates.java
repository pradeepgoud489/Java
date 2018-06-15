package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public void duplicate(String str) {
        char[] c = str.toCharArray();
        HashSet<Character> s = new LinkedHashSet<Character>();
        for (char cc : c) {
            s.add(cc);
        }
        for (char ca:s) {
           // System.out.print(ca);
        }
    }

    static int removeDuplicates(int a[],int val){
        int i=0;
        if(a.length==0){return 0;}
        for(int j=0;j<a.length;j++){
            if(a[j]!=val){
                a[i]=a[j];
                i++;
            }

        }
        return i;
    }
    static int removeDuplicates(char a[]){
        int i=0;
        if(a.length==0){return 0;}
        for(int j=0;j<a.length;j++){
            if(a[j]!=a[i]){
                a[i]=a[j];
                i++;
            }

        }
        return i;
    }


    public static void main(String[] args) {
        RemoveDuplicates r=new RemoveDuplicates();
        r.duplicate("deep");
        int[]a={1,2,2,3,4,1};
        String str="pradeep";
        char[]c=str.toCharArray();
        int n=r.removeDuplicates(c);
        System.out.println();
        for(int i=0;i<n;i++){
           System.out.println(c[i]);
        }
    }
}
