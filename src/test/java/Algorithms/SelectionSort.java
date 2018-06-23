package Algorithms;

public class SelectionSort {



    static void sort(int a[],int n){

        for(int i=0;i<n-1;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[index]){
                    index=j;

                    int temp=a[index];
                    a[index]=a[i];
                    a[i]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[]={64,25,12,22,11};
        sort(a,a.length);
        for(int x:a){
            System.out.print(x+",");
        }
    }
}
