package LeetCodeRepeats;

import java.util.HashMap;
import java.util.Map;

public class OddOccurancesOfNumber {

    static void printUsingMap(int a[]){
        HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i]+1));
            }else{
                map.put(a[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> xx : map.entrySet()){
            if(xx.getValue()%2!=0){
                System.out.println(xx.getKey());
            }
        }
    }

    static void printUsingXor(int a[]){
        int result=0;
        for(int i=0;i<a.length;i++){
            result=result^a[i];
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int a[]={2,3,3,4,5,4,5,2,2};
        printUsingXor(a);
    }
}
