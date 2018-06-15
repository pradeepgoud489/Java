package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneKeyPad {

    static final HashMap<Character,String> map = new HashMap<Character,String>(){{
        put('1', "");
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
        put('0', "");
    }} ;
    public static List<String> letterCombinations(String digits) {
       ArrayList<String>first=new ArrayList<String>();
       ArrayList<String>second=new ArrayList<String>();
       first.add("");
       for(int i=0;i<digits.length();i++){
           String letters=map.get(digits.charAt(i));
           if(letters.length()==0){
               continue;
           }
           for(String str:first){
               for(int j=0;j<letters.length();j++){
               second.add(str+letters.charAt(j));
           }
           }
           first=second;
           second=new ArrayList<String>();
       } return first;
    }

    public static void main(String[] args) {
       List<String>x= letterCombinations("22");
        System.out.println(x);
    }
}
