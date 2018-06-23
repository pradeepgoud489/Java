package LeetCodeRepeats;

public class ValidAbbrevation {

    static boolean valid(String word,String abbr){

        if(word==null || abbr==null ){
            return word==abbr;
        }
        int i=0;
        int j=0;
        while(i<word.length()&& j<abbr.length()){
            if(word.charAt(i)==abbr.charAt(j)){
                i++;
                j++;
            }
            else if(abbr.charAt(j)>'0' && abbr.charAt(j)<='9'){
               int k=j+1;
               while(k<abbr.length()&& Character.isDigit(abbr.charAt(k))){
                   k++;
               }
               int len=Integer.parseInt(abbr.substring(j,k));
               j=k;
               i=i+len;
            } else{
                return false;
            }
        }

        if(i==word.length() && j==abbr.length()){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(valid("internationalization","i12iz4n"));
    }
}
