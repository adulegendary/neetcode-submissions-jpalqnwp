class Solution {
    public int lengthOfLIS(int[] nums) {

        int []dp = new int[nums.length+1];
        Arrays.fill(dp, 1);
        int result =0;
        for(int i=0; i< nums.length; i++){
             int left =0;
             while(left < i){
                if(nums[left] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[left] +1);
                }
                left +=1;
             }
             result = Math.max(result, dp[i]);

        }

        return result;
        
    }
}
