package LeetCodeRepeats;

public class FindMajorityElement {

    static void print(int a[],int n){

        int candidate=findCandidate( a,n);
        if(isMajority(a,n,candidate)){
            System.out.println(candidate);
        }else{
            System.out.println("no candidate");
        }
    }

    static  int findCandidate(int a[],int n){
        int maxIndex=0,count=1;
        for(int i=0;i<n;i++){
            if(a[maxIndex]==a[i]){
                count++;
            }else{
                count--;
            }
            if(count ==0){
                maxIndex=i;
                count=1;
            }
        }
        return a[maxIndex];
    }

    static boolean isMajority(int a[],int n,int c){
        int count=0;
        for(int i=0;i<n;i++){
            if(c==a[i]){
                count++;
            }
        }
        if(count>n/2){
            return true;
        } return false;
    }
    public static void main(String[] args) {
        int a[]={1,3,3,3,3,1,2};
print(a,a.length);
    }
}
