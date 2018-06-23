package LeetCodeRepeats;

public class MaxSubArrayOfK {


    static int findMaxAverage(int a[], int n, int k)
    {
        if(k>n){
            return -1;
        }
        int sum=a[0];int maxSum, index;
       for(int i=1;i<k;i++){
           sum+=a[i];
       }
       maxSum=sum;
        int maxEnd=k-1;
        for(int i=k;i<n;i++){
            sum=sum+a[i]-a[i-k];
            if(sum>maxSum){
                maxSum=sum;
                maxEnd=i;
            }
        }
        return maxEnd-k+1;
    }
    public static void main(String[] args) {
        int a[]={1,12,-5,-6,50,3};
        int k=4;
        int n=a.length;
        System.out.println(findMaxAverage(a,n,k));
    }
}
