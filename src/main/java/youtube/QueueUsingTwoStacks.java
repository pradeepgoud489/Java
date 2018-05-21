package youtube;

import java.util.Stack;

public class QueueUsingTwoStacks {

    Stack<Integer>s1=new Stack<Integer>();
    Stack<Integer> s2= new Stack<Integer>();

    int getSize(){
        return s1.size()+s2.size();
    }

    void enqueue(int x){
        s1.push(x);
    }

    void dequeue(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        System.out.println(s2.size());
        s2.pop();
        System.out.println(s2.size());

    }
    public static void main(String[] args) {
        QueueUsingTwoStacks q= new QueueUsingTwoStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.getSize());
             q.dequeue();
             q.enqueue(2);
        System.out.println(q.getSize());

    }
}
