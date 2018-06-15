package Strings;

public class RunLengthEncoding {

    public static String runLength(String s){
        if(s == null || s.length() == 0)    return "";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            if(count>1){
            sb.append(s.charAt(i)).append(count);}
            else{
                sb.append(s.charAt(i));
            }
            count = 1;
        }
        return sb.toString();
    }

    static String abbrevation(String str){
        if(str.length()==0){
            return "";
        }
        StringBuilder s=new StringBuilder();
        int b=str.length()-2;
        s.append(str.charAt(0)).append(b).append(str.charAt(str.length()-1));
        return s.toString();
    }
    public static void main(String[] args) {
        System.out.println(runLength("aaaaabbbbc"));
        System.out.println(abbrevation("abcd"));
    }
}
