package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Permutations {


    private static ArrayList<String> list = new ArrayList<String>();
    private static void findPermutations(String s, String prefix){
        int len=s.length();
        if(len==0){
            System.out.print(prefix+" ");
//            list.add(prefix);
            return;
        }
        for(int i=0;i<len;i++){
            findPermutations(s.substring(0,i)+s.substring(i+1,len),prefix+s.charAt(i));
        }
    }
    public static void main (String[] args) {
        //code
//        int T;
//        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");
//        T = Integer.parseInt(scanner.next());
//        int count=T;
//        while(T>0){
//            if(T!=count){
//                System.out.println();
//            }
         //   String input = scanner.next();
            findPermutations("abc","");
            //Collections.sort(list);
            for(int i=0;i<list.size();i++){
               // System.out.print(list.get(i)+" ");
            }
            list.clear();
        //    T--;
        }
    }

