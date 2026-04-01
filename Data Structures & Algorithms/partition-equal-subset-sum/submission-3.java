class Solution {
    public boolean canPartition(int[] nums) {

        int total =0;
        for(int i : nums){total += i;}

        if(total %2 !=0){ return false;}

        boolean [][]dp = new boolean[nums.length+1][total+1];
        dp[0][0] = true;
        total = total/2;
        for(int i=0 ; i< total+1; i++){
             dp[0][i] = false;
        }
         for(int i=0 ; i< nums.length+1; i++){
             dp[i][0] = true;
        }
        
        for(int i=1; i<=nums.length; i++){
            for(int j= total; j>=0; j--){
                
               if (j - nums[i-1] >= 0) {
                  dp[i][j] = dp[i-1][j] || dp[i-1][j - nums[i-1]];
} else {
    dp[i][j] = dp[i-1][j];
}


            }
        }

System.out.println(Arrays.toString(dp[2]));

        return dp[nums.length][total];
        
    }
}
