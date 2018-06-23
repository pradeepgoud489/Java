package LeetCodeRepeats;

public class LongestPalindromeSubSequence {


    static int getSequence(String s){
        int maxLength=1;
        int start=0;
        int len=s.length();
        int low,high;

        for(int i=1;i<len;i++){
            low=i-1;
            high=i;
            while(low>=0&&high<len && s.charAt(low)==s.charAt(high)){
                if(high-low+1>maxLength){
                    start=low;
                    maxLength=high-low+1;
                }
                low--;
                high++;
            }
            low=i-1;
            high=i+1;
            while(low>=0 && high<len && s.charAt(low)==s.charAt(high)){
                if(high-low+1>maxLength){
                    start=low;
                    maxLength=high-low+1;
                } low--;
                high++;
            }
        }
        System.out.println(s.substring(start,start+maxLength));
        return maxLength;
    }
    public static void main(String[] args) {
int x=getSequence("forgeeksskeegfor");
        System.out.println(x);
    }
}
