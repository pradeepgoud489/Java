package Strings;

public class PalindromeString {


    public static boolean ispalindrome(String x){
  StringBuilder z=new StringBuilder(x);
  StringBuilder y=z.reverse();
        if(x.equalsIgnoreCase(y.toString())){
            System.out.println("yes");
            return true;
        }
        System.out.println("nno");
        return false;
    }

    public static void main(String[] args) {
        ispalindrome("boo");
    }
}
