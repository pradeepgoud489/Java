package LeetCodeRepeats;

public class AllPalindromePartitions {
    public static boolean ispalin(String s,int start,int end) {
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void printpart(String s,String output,int start,int end) {
       if(start==end){
           System.out.println(output);
           return;
       }
       int n=s.length();
     //  String delimetr="-";
       for(int i=start;i<end;i++){
           if(ispalin(s,start,i)){
//               if(i+1==n){
//                   delimetr="";
//               }
               printpart(s,output+s.substring(start,i+1)+" ",i+1,end);
       }}
    }

    public static void main(String[] args) {
        String input = "pradeed";
        String output = "";
        int begin = 0;
        int end = input.length();
        printpart(input, output, begin, end);
    }
}