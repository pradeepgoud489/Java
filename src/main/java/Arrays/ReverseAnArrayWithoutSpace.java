package Arrays;

public class ReverseAnArrayWithoutSpace {
    static int[] reverse(int a[]){
        int start=0;
        int end=2;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        return a;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int b[]=reverse(a);
        for(int x:b){
            System.out.println(x);
        }
    }
}
