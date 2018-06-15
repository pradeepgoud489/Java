public class FibonacciSeries {

   public static int fibonaci(int n){
       if(n<=1){
           return n;
       } else
           return fibonaci(n-1)+fibonaci(n-2);
   }

   static int fibo(int n){
       int a=0,b=1;int c;
       if(n<=0){
           return n;
       }
       else{
           for(int i=2;i<n;i++){
               c=a+b;
               a=b;
               b=c;
           }
       }
       return b;
   }

    public static void main(String[] args) {
       int n=6;
       for(int i=1;i<=n;i++){
           System.out.println(fibo(i));
       }

        System.out.println(fibo(6));
    }
}
