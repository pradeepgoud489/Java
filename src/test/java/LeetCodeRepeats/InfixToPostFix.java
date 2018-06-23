package LeetCodeRepeats;

import java.util.Stack;

public class InfixToPostFix {

    static String convert(String s){
        String result="";
//        Stack<Character>stack=new Stack<Character>();
//        for(int i=0;i<s.length();i++){
//        if(s.charAt(i)>='a' && s.charAt(i)<='z'){
//            result +=s.charAt(i);
//        }
//        else{
//            while(!stack.isEmpty() && highPrec(s.charAt(i),stack.peek())){
//                result += stack.peek();
//                stack.pop();
//            }
//            stack.push(s.charAt(i));
//        }
//        }
//
//
//
        return result;
    }

    public static void main(String[] args) {
        String s="a+b*c-d*e";
       //
        // convert(s);
        System.out.println(Character.isLetterOrDigit('-'));
    }
}
