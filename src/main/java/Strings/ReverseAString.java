package Strings;

public class ReverseAString {

    public void reverse(String str){
  if(str.length()<=1||str.isEmpty()){
      System.out.println(str);
  }
  else {
      for (int i = str.length()-1;i>=0; i--) {
          System.out.print(str.charAt(i));
      }
  }

    }
    public static void main(String[] args) {
        String a="hello";
        //using for loop
        ReverseAString r=new ReverseAString();
        r.reverse(a);
        //using string builder
        StringBuilder s=new StringBuilder();
        s.append(a);
        System.out.println(s.reverse());

    }
}