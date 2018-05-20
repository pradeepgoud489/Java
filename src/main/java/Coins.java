public class Coins {




    static int minCoins(int coins[],int l,int sum){
        if(sum==0){
            return 0;
        }
        int result=Integer.MAX_VALUE;
        for(int i=0;i<l;i++){
            if(coins[i]<=sum){
                int x=minCoins(coins,l,sum-coins[i]);
                if(x!=Integer.MAX_VALUE && x+1<result){
                    result=x+1;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int coins[]={9,6,5,1,4};
        int l=coins.length;
        int sum=11;

        System.out.println(minCoins(coins,l,sum));
    }
}
