class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int []dp = new int[cost.length+1];
        
        if(cost.length <=2){
            return Math.min(cost[0], cost[1]);
        }
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2; i<cost.length; i++){
            dp[i] = Math.min(cost[i] + dp[i-2], dp[i-1]+ cost[i]);
        }
        System.out.println(Arrays.toString(dp));
        dp[cost.length] = Math.min(dp[cost.length-1], dp[cost.length-2]);
        return dp[cost.length];
        
    }
}
