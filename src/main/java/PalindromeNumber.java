public class PalindromeNumber {


    public static void isPalindrome(int a){
        int reverse=0;
        int b=a;
      while(b!=0){
          int reminder=b%10;
          reverse=reverse*10+reminder;
          b=b/10;
      }

        if(reverse==a){
            System.out.println("yes"+reverse);
        } else{
            System.out.println("No"+reverse);
        }
    }

    public static void main(String[] args) {
        isPalindrome(232);
    }
}
