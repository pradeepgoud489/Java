package LeetCodeRepeats;

public class FindMissingNumberInTwoArrays {


    static void missingNumberInDuplicateArray(int a[],int b[]){
        if(a==null&&b==null){
            return;
        }
        if(a==null){
            if(b.length==1){
                System.out.println(b[0]);
            }else{
                return;
            }
        } else if(b==null) {
            if (a.length == 1) {
                System.out.println(a[0]);
            } else {
                return;
            }
        }
            if(a.length>b.length){
                usingXor(a,b);
            }else {
                usingXor(b,a);
            }


    }

    static void findznumber(int a[],int b[]){
        int result=0;
        for(int i=0;i<a.length;i++){
            result=result+a[i];
        }
        for (int i=0;i<b.length;i++){
            result -=b[i];
        }
        System.out.println(result);
    }

    static void usingXor(int a[],int b[]){
        int result =0;
        for(int i=0;i<a.length;i++){
            result ^=a[i];
        }
        for (int i=0;i<b.length;i++ ){
            result ^=b[i];
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int[] array1 = {9, 7, 8, 5, 4, 6, 2, 3, 1};
        int[] array2 = {2, 3, 4, 9, 1, 8, 5, 6};
        missingNumberInDuplicateArray(array1, array2);

    }
}
