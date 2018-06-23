package LeetCodeRepeats;

import java.util.Stack;

public class NextGreaterElement {

    static void getGreater(int a[],int n){
        Stack stack=new Stack();
        stack.push(a[0]);int next,element;
        for(int i=1;i<n;i++){
            next=a[i];
            if(!stack.isEmpty()){
              // element= stack.pop();
            }
        }
    }

    static void nextGreater(int a[],int n){
        int max=a[n-1];
        for(int i=n-2;i>=0;i--){
            if(a[i]<max){
                a[i]=max;
            }else{
                max=a[i];
            }
        }
        for(int y:a){
            System.out.println(y);
        }

    }

    static void greater(int a[],int n){
    int next,i,j;
    for(i=0;i<n;i++){
        next=-1;
        for(j=i+1;j<n;j++){
            if(a[i]<a[j]){
                next=a[j];
                break;
            }

        }            System.out.println(a[i]+"---"+next);

    }
    }

    public static void main(String[] args) {
        int a[]={11,13,21,3};
       // getGreater(a,a.length);
       // nextGreater(a,a.length);
        greater(a,a.length);
    }
}
