package LeetCodeRepeats;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonString {


    static List<String>findString(String s1,String s2){
        ArrayList<String>result=null;int max=0;
        Integer match[][]=new Integer[s1.length()][s2.length()];
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    if(i==0||j==0){
                        match[i][j]=1;
                    }
                    else {
                        match[i][j]=1+match[i-1][j-1];
                    }
                    if(match[i][j]>max){
                        max = match[i][j];
                        result=new ArrayList<String>();
                        result.add(s1.substring(i-max+1,i+1));
                    }else if(match[i][j]==max){
                        result.add(s1.substring(i-max+1,i+1));
                    }
                } else
                    match[i][j]=0;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(findString("clcl","lclc"));
    }
}
