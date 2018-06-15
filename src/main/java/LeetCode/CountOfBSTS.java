package LeetCode;

public class CountOfBSTS {


    static int countOfBST(int n){
        int[]a=new int[n+1];
        a[0]=a[1]=1;
        if(n==1 || n==0){
            return a[n];
        }
        for(int i=2;i<=n;i++){
            a[i]=0;
            for(int j=0;j<i;j++){
                a[i]+=a[j]*a[i-j-1];
            }
        }
        return a[n];
    }
    public static void main(String[] args) {
        System.out.println(countOfBST(5));
    }
}
