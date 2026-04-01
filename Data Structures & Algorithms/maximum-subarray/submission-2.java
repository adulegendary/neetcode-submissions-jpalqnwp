class Solution {
    public int maxSubArray(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        int []dp = new int[nums.length];
        int result =Integer.MIN_VALUE;
        dp[0] = nums[0];

        result = Math.max(result, dp[0]);
        for(int i=1; i<nums.length; i++){
           dp[i] = Math.max(nums[i], dp[i-1] + nums[i]);
           result = Math.max(result, dp[i]);
        }
        return result;




        
    }
}
