public class LCMOf {

    public static void main(String[] args) {
        int a=9;int b=3;
        for(int i=1;i<=a*b;i++){
            if(i%a==0 && i%b==0){
                System.out.println("lcm is "+i);
                break;
            }
        }
    }
}
