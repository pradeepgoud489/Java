package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="deep";
        String s2="peed";
        char[]c1=s1.toCharArray();
        char[]c2=s2.toCharArray();
           Arrays.sort(c1);
           Arrays.sort(c2);
       for(char c:c1){
           System.out.println(c);
       }
        for(char c:c2){
            System.out.println(c);
        }
        String a=new String(c1);
        String b=new String(c2);
        if(a.equalsIgnoreCase(b)){
            System.out.println("anagram");
        } else{
            System.out.println("not");
        }
    }
}
