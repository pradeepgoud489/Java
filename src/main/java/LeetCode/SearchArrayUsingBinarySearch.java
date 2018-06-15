package LeetCode;

public class SearchArrayUsingBinarySearch {

    public static int search(int []a,int b){
        int i=0;
        int j=a.length-1;

        while(i<=j){
            int mid=(i+j)/2;
        if(a[mid]==b){
            return mid;
        }else if(b<a[mid]){
            j=mid-1;
        }else if(b>a[mid]){
            i=mid+1;
        }

    }
    return i;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,7};
        System.out.println(search(a,6));
    }
}
