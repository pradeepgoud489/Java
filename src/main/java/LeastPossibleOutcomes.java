public class LeastPossibleOutcomes {


    static int minways(int [] a,int sum){
        if(sum==0){
            return 1;
        }
        if(sum<0){
            return 0;
        }
        int result=0;
        for(int i=0;i<a.length;i++){

                 result +=minways(a,sum-a[i]);
//                if(sub_result!=Integer.MAX_VALUE && sub_result+1<result){
//                    result=sub_result+1;


        }
      return  result;
    }
    public static void main(String[] args) {
        int a[]={1,2};
        int sum=4;
        System.out.println(minways(a,sum));
    }
}
