package LeetCodeRepeats;

import java.util.HashMap;

public class TwoSum {

    static void getTwoNumbers(int []a,int x){
        HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
        for(int i=0;i<=a.length-1;i++){
            int diff=x-a[i];
            if(map.containsKey(diff)){
                System.out.println(i+" "+map.get(diff));
                return;
            } else{
                map.put(a[i],i);
            }
        }

    }

    public static void main(String[] args) {
        int a[]={6,5,2,7,11,15};
        int b=9;
        getTwoNumbers(a,b);
    }
}
