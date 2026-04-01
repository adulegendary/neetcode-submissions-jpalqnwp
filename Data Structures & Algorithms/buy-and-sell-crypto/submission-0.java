class Solution {
    public int maxProfit(int[] prices) {
        
        int result =0; 
        int left =0;
        for(int i =1; i < prices.length; i+=1){
            if(prices[left] > prices[i]){
                left =i;
            }else {
                result = Math.max((prices[i]-prices[left]), result);
            }
        }

        return result;
    }
}
