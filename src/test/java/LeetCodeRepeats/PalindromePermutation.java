package LeetCodeRepeats;

import java.util.HashMap;

public class PalindromePermutation {

    static boolean check(String s1){
        char []c=s1.toCharArray();int count=0;
        HashMap<Character,Integer>map=new HashMap<Character, Integer>();
        for(int i=0;i<c.length;i++){
            if(map.containsKey(c[i])){
                map.put(c[i],1+map.get(c[i]));
            }else
            {
                map.put(c[i],i);
            }
        }
        for(Integer i:map.values()){
            if(i%2!=0){
                count++;
            }
        } if(count>1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="boo";
        System.out.println(check(s1));
    }
}
