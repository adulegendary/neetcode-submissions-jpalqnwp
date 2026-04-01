class Solution {
    
    int[][] dp; 
    public int findTargetSumWays(int[] nums, int target) {
          int sum = 0;
          for (int x : nums) sum += x;
          dp = new int[nums.length][2 * sum + 1];
          for (int i = 0; i < nums.length; i++) {
          Arrays.fill(dp[i], -1); // mark as "uncomputed"
          }
         return dfs(nums, target, 0, 0, sum);
    }


    public int dfs(int [] nums, int target, int counter, int index, int offset){
        
        if(counter == target && index == nums.length){
            return 1;
        }
        if(counter != target && index == nums.length){
            return 0;
        }
        if(dp[index][counter + offset] != -1){
            return dp[index][counter + offset];
        }

      
        dp[index][counter+ offset]= dfs(nums, target, counter+ nums[index], index+1, offset) + dfs(nums, target, counter - nums[index], index+1, offset); 
    

        return dp[index][counter + offset];


    }
}
