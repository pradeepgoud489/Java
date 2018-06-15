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

    static int[] check(int []digits){
       for(int i=digits.length-1;i>=0;i--){
           if(digits[i]<9){
               digits[i]++;
               return digits;
           }
           else{
               digits[i]=0;
           }
       }
       digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }


    public static void main(String[] args) {
        Vector<Integer>v=new Vector<Integer>();
        v.add(9);
        v.add(9);
        v.add(9);
        v.add(9);
       // adding(v);
        int[]b={1,9,9};
        int[]c=check(b);
        for(int m:c){
            System.out.println(m);
        }

//        for(int j=0;j<v.size();j++){
//            System.out.println(v.get(j));
//        }
    }
}
