class Solution {
      int [][]dp;
    public int change(int amount, int[] coins) {

       int n = coins.length;
       dp = new int[n+1][amount+1];
       for(int i=0; i<=n; i++){
           Arrays.fill(dp[i], 0);
       }

       return dfs(amount, coins, 0, 0);
        
    }


    public int dfs(int target, int [] coins, int index, int counter){
        
        if(index == coins.length){
            return 0;
        }
        if(counter > target){
            return 0;
        }
        if(counter == target){
            return 1;
        }
       if(dp[index][counter] != 0){
            return dp[index][counter];
        }
  
        dp[index][counter] = dfs(target, coins, index, counter + coins[index]) + dfs(target, coins, index+1, counter);
        

        return dp[index][counter];
    }
}
