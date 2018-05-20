package Strings;

import java.util.Stack;

public class IsValid {


   public  static boolean isSame(String s) {
       char[]sarray=s.toCharArray();
       if(s.length()==0){
           return  true;
       }
       Stack<Character>stack=new Stack<Character>();
       for(int k=0;k<s.length();k++){
           if(sarray[k]=='(' || sarray[k]=='{' ||sarray[k]=='['){
               stack.push(sarray[k]);
           }
           if(sarray[k]==')' || sarray[k]=='}' || sarray[k]==']'){
               if(stack.empty()){
                   return false;
               }
              char temp=stack.pop();
               if((temp=='(' && sarray[k]==')')|| (temp=='{' && sarray[k]=='}' ) ||(temp=='[' && sarray[k]==']' )){
                   continue;
               }else{
                   return false;
               }
           }
       }
       if(!stack.isEmpty()){
           return false;
       } return true;

   }
    public static void main(String[] args) {
        System.out.println( isSame("()}"));
    }
}
