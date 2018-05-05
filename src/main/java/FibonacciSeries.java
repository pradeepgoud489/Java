public class FibonacciSeries {

   public static int fibonaci(int n){
       if(n<=1){
           return n;
       } else
           return fibonaci(n-1)+fibonaci(n-2);
   }

    public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++){
           System.out.println(fibonaci(i));
       }
    }
}
