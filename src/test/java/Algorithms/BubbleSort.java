package Algorithms;

public class BubbleSort {

    static void sort(int a[],int n){
int temp;boolean swapped;
for(int i=0;i<n-1;i++){
    swapped=false;
    for(int j=0;j<n-i-1;j++){
        if(a[j]>a[j+1]){
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
            swapped=true;
        }
    }
    if(swapped==false){
        break;
    }
}
    }
    //n2

    public static void main(String[] args) {
        int a[]={64,34,25,12,55,10,2};
        for(int i:a){
            System.out.print(i+",");
        }
        System.out.println("   ");
         sort(a,a.length);
        for(int i:a){
            System.out.print(i+",");
        }
    }
}
