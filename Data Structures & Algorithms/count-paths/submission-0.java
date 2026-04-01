class Solution {
    public int uniquePaths(int m, int n) {

        int [][]dp = new int[m+1][n+1];
       

        for(int i=0 ; i<=n; i++){
            dp[m][i] =0;

        }
        
        for(int i=0 ; i<=m; i++){
            dp[i][n] =0;
        }
      
        System.out.println(Arrays.toString(dp[m]));
        for(int i=m-1; i>=0; i--){
           for(int j=n-1; j>=0; j--){
             if(j == n-1 && i == m-1){
                 dp[m-1][n-1] = 1;
             }else{
                 dp[i][j] = dp[i+1][j] + dp[i][j+1];
             }
             
         }
         System.out.println(Arrays.toString(dp[i]));
        }

        return dp[0][0];   
        
    }
}
