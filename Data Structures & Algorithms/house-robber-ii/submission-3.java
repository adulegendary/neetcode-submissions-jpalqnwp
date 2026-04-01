class Solution {
    public int rob(int[] nums) {
        if(nums.length ==1){
            return nums[0];
        }
        int a = helper(nums, 0, nums.length-2);
        int b = helper(nums, 1, nums.length-1);
        
        return Math.max(a, b);
        
    }

    int helper(int []nums, int left, int right){
        int n = right-left+1;
        int []dp = new int[n];
        if(n==1){return nums[left];}
        dp[0] = nums[left];                                  // first in the subarray
        dp[1] = Math.max(nums[left], nums[left + 1]);        // best of first two

        for(int i=2; i<n; i++){
             dp[i]= Math.max(dp[i-1], nums[i+left] + dp[i-2]);
              
            
        }
        

        return dp[n-1];

    }
}
