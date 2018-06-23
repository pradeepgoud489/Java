package LeetCodeRepeats;

import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {

        Stack<Integer>s=new Stack<Integer>();
        s.push(2);
        System.out.println( s.peek());
        s.push(4);
        s.pop();
        System.out.println(s.peek());
    }
}
