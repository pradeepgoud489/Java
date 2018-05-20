package LeetCode;

import java.util.Vector;

public class IncrementVector {

   static void adding(Vector<Integer>a){
       int l=a.size();
        a.set(l-1,a.get(l-1)+1);
        int carry=a.get(l-1)/10;
        a.set(l-1,a.get(l-1)%10);

        for(int i=l-2;i>=0;i--){
            if(carry==1){
                a.set(i,a.get(i)+1);
                carry=a.get(i)/10;
                a.set(i,a.get(i)%10);
            }
        }

        if(carry==1){
            a.add(0,1);
        }
    }

    public static void main(String[] args) {
        Vector<Integer>v=new Vector<Integer>();
        v.add(9);
        v.add(9);
        v.add(9);
        v.add(9);
        adding(v);

        for(int j=0;j<v.size();j++){
            System.out.println(v.get(j));
        }
    }
}
