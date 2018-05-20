public class Factorial {

    public static int fact(int n){
        int a=0;
        if(n==0){
            a= 1;
        }
       if(n>0) {
           a= n * fact(n - 1);
       }
       return a;
    }

    public static void main(String[] args) {
        System.out.println(fact(7));
    }
}
