package Arrays.Medium;

public class BuyAndSellStocks {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];

        int maxProf = Integer.MIN_VALUE;

        for(int i=1; i<prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }else{
                int currProf = prices[i] - buy;
                maxProf = Math.max(currProf, maxProf);
            }
        }
        if(maxProf < 0)
            return 0;
        else
            return maxProf;
    }
    public static void main(String[] args){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
