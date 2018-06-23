package LeetCodeRepeats;

public class RemoveSpaces {


    static void removeSpace(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String s="helooo hi how are you";
        removeSpace(s);
    }
}
