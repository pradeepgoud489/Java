package LeetCodeRepeats;

public class PeekFromArray {

    static int peek(int a[],int start,int end,int n){

            int mid=start+(end-start)/2;
            if( (mid==0||a[mid-1]<=a[mid]) && (mid==n-1 ||a[mid+1]<=a[mid]) ){
                return a[mid];
            }
            else if(mid>0&&a[mid-1]>a[mid]){
               return peek(a,start,mid-1,n);
            }
            else{
                return peek(a,mid+1,end,n);
            }
    }
    public static void main(String[] args) {
        int a[]={3,7,5,4,2};
        int x=peek(a,0,a.length-1,a.length);
        System.out.println(x);
    }
}
