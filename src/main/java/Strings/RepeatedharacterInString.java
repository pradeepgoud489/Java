package Strings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class RepeatedharacterInString {

    public static void main(String[] args) {

        String a="praddeep";
        repeated("pradepade");

//        for(int i=0;i<a.length();i++){
//            for (int j=i+1;j<a.length();j++){
//                if(a.charAt(i)==  a.charAt(j)){
//                    System.out.println(a.charAt(i));
//                }
//            }
//        }
    }

    public static void repeated(String a){
        char c[]=a.toCharArray();
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<Character,Integer>();
        ArrayList<Character>s=new ArrayList<Character>();
        for(int i=0;i<c.length;i++){
            if(map.containsKey(c[i])){
             //   System.out.println( c[i]);
                s.add(c[i]);
            }
            else {
                map.put(c[i],1);
            }
        }

        for(char x:s){
            System.out.println(x);
        }
    }
}
