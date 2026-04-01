class Solution {
    public int maxProduct(int[] nums) {

        int []dp = new int [nums.length];
        int []dpmin = new int [nums.length];
        if(nums.length<=1){
            return nums[0];
        }
        dp[0] = nums[0];
        dpmin[0] = nums[0];
        int result =0;
        for(int i=1; i<nums.length; i++){
               int valemax = nums[i] * dp[i-1];
               int valesmin = nums[i] * dpmin[i-1];
               if(valemax >= valesmin){
                  dp[i] = Math.max(nums[i], valemax);
                  dpmin[i] = Math.min(nums[i], valesmin);
                  result = Math.max(dp[i], result);
               }else{
                  dp[i] = Math.max(nums[i], valesmin);
                  dpmin[i] = Math.min(nums[i], valemax);
                  result = Math.max(dp[i], result);
               }
             
            
        }
        System.out.println(Arrays.toString(dp));

        return result;
        
    }
}
