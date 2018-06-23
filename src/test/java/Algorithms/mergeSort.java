package Algorithms;

//nlogn and space o(n)
public class mergeSort {
   static int []temp;
    static void mergeHalves(int a[],int start,int mid,int end){
        int n1=mid-start+1;
        int n2=end-mid;
        int first[]=new int [n1];
        int second[]=new int[n2];

        for(int i=0;i<n1;i++){
            first[i]=a[i+start];
        }

        for(int j=0;j<n2;j++){
            second[j]=a[mid+1+j];
        }

        int i=0,j=0,k=start;
        while(i<n1 && j<n2){
            if(first[i]<=second[j]){
                a[k]=first[i];
                k++;i++;
            } else{
                a[k]=second[j];
                k++;j++;
            }
        }
        while(i<n1){
            a[k]=first[i];k++;i++;
        }
        while ((j<n2)){
            a[k]=second[j];k++;j++;
        }
    }

    static void mergeMethod2(int a[],int start,int end){
       int leftEnd=(start+end)/2;
       int rightStart=leftEnd+1;

       int left=start;
       int right=rightStart;
       int index=start;

       while (left<=leftEnd && right<=end){
           if(a[left]<=a[right]){
               temp[index]=a[left];index++;left++;
           } else
           {
               temp[index]=a[right];index++;right++;
           }
       }
    }


    static void sort(int a[],int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            sort(a,start,mid);
            sort(a,mid+1,end);
            mergeHalves(a,start,mid,end);
        } else{
            return;
        }
    }

    public static void main(String[] args) {
        int a[]={12,11,13,5,6,7};
        int n=a.length-1;
        temp= new int[n+1];

        for(int i:a){
            System.out.print(i+",");
        }
        System.out.println("   ");
        sort(a,0,n);
        for(int i:a){
            System.out.print(i+",");
        }
    }
}
