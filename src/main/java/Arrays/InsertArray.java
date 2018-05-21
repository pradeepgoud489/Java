package Arrays;

import java.util.Vector;

public class InsertArray {

    public static void main(String[] args) {
        Vector<Integer> a=new Vector<Integer>();
        a.add(1);
        a.add(2);
        for(int b:a){
            System.out.println(b);
        }
        a.add(4);
        for(int b:a){
            System.out.println(b);
        }
    }
}
