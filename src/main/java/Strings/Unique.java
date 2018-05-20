package Strings;

public class Unique {



    public static boolean xxx(String a){
        boolean[] char_set=new boolean[256];
        for(int i=0;i<a.length();i++){
            int value=a.charAt(i);
            System.out.println(value);
            if(char_set[value]){
                return false;
            }else{
                char_set[value]=true;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println( xxx("abbc"));
    }
}
