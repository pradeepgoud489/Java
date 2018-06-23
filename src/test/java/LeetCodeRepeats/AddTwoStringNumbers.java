package LeetCodeRepeats;

public class AddTwoStringNumbers {



    static String add(String num1,String num2){
        if (num1 == null || num1.length() == 0){
            return num2;
        }
        if (num2 == null || num2.length() == 0){
            return num1;
        }
       int add=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        StringBuilder sb= new StringBuilder();
        while(i>=0 && j>=0){
            int sum=(num1.charAt(i)-'0')+(num2.charAt(j)-'0')+add;
            int digit=sum%10;
             add=sum/10;
             sb.insert(0,digit);
            i--;j--;
        }
        while (i >= 0){
           int sum=num1.charAt(i)-'0'+add;
           int digit=sum%10;
           add=sum/10;
           sb.insert(0,digit);
           i--;
        }
        while (j >= 0){
            int sum=num2.charAt(i)-'0'+add;
            int digit=sum%10;
            add=sum/10;
            sb.insert(0,digit);
        }
        if (add == 1) {
            sb.insert(0, add);
        }
        return sb.toString();

    }


    public static void main(String[] args) {
        System.out.println( add("9479","621"));

    }
}
