class Solution {
    public int maxCoins(int[] nums) {
        
        int n = nums.length;
        int [] newNum = new int[n+2];
        newNum[0] = newNum[n+1] = 1;
        for(int i=0; i<n; i++){
            newNum[i+1] = nums[i];
        }

        System.out.println(Arrays.toString(newNum));

        int [][]dp = new int[n+2][n+2];

        for(int i=0; i<=n+1; i++){
            for(int j=0; j<=n+1; j++){
                dp[i][j] = -1;
            }
        }

        return dfs(newNum, 1, newNum.length-2, dp);

    }

    public int dfs(int []newNum, int left, int right, int [][]dp){

        if(left > right){
            return 0;
        }
        if(dp[left][right] != -1){
            return dp[left][right];
        }

        dp[left][right] = 0; 
        for(int i=left; i<=right; i++){
          int cost = newNum[left-1] * newNum[i] * newNum[right+1];
            cost += dfs(newNum, i +1, right, dp) + dfs(newNum, left, i-1, dp);
            dp[left][right] = Math.max(dp[left][right], cost);
        }

        return dp[left][right];  
    }
}
