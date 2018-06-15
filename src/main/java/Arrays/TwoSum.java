package Arrays;

import java.util.HashMap;

public class TwoSum {

    static int[]TwoSum(int[]a,int target){
        int[]result=new int[2];
        HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
        for(int i=0;i<a.length;i++){
            int diff=target-a[i];
                if(!map.containsKey(diff)){
                    map.put(a[i],i);

            } else{

                    System.out.println(map.get(diff));
                    System.out.println(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a[]={2,4,5,6,7,1,9};
        TwoSum(a,10);
    }

}
