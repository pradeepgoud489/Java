import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CountSetBits {


    static long countBits(long n){
        int count =0;
        while(n>0){
            count++;
            n &=n-1;
        }
        return count;
    }

    static int method2(int n){
        int count =0;
        while(n>0){
            if(n%2==1){
                count++;
            }
            n=n/2;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println( countBits(7));
        System.out.println(method2(4));
        Queue<Integer>queue=new LinkedList<Integer>() ;
        LinkedList<Integer>list=new LinkedList<Integer>();
        Stack<Integer>stack=new Stack<Integer>();


    }
}
