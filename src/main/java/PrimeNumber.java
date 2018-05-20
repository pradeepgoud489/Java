public class PrimeNumber {

    public static void prime(int n){
        for(int i=2;i<=n;i++){
            for(int j=2;j<=i;j++){
                if(j==i){
                    System.out.println(i);
                }
                if(i%j==0){
                    break;
                }
            }
        }
    }

    static boolean prime2(int n){
        boolean x=false;
        for(int j=2;j<=n/2;j++){
            if(n%j==0){
                x= false;
            }else {
               x= true;
            }
        }
        return x;
    }


    static boolean prime3(int x){
        for(int m=2;m<Math.sqrt(x);m++){
            if(x%m==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       prime(10);

        System.out.println(prime2(10));
        System.out.println(prime3(23));
    }
}
