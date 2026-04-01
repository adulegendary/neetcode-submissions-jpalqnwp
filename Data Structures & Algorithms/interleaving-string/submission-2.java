class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        
        int x = s1.length();
        int y = s2.length();
        
        if(s3.length() > (x+y) || s3.length()<(x+y)){return false;}

        boolean [][]dp = new boolean[x+1][y+1];
        dp[0][0] = true;

        for(int i=1; i<=x; i++){
            dp[i][0] = dp[i-1][0] && (s3.charAt(i-1) == s1.charAt(i-1));
        }
        for(int i=1; i<=y; i++){
            dp[0][i] = dp[0][i-1] && (s3.charAt(i-1) == s2.charAt(i-1));
        }

       //System.out.println(Arrays.toString(dp[0]));
       for(int i=1; i<=x; i++){
        for(int j=1; j<=y; j++){
            boolean row = dp[i][j-1] && (s3.charAt(j+i-1) == s2.charAt(j-1));
            boolean col = dp[i-1][j] && (s3.charAt(j+i-1) == s1.charAt(i-1));
            dp[i][j] = row || col;
        }
        System.out.println(Arrays.toString(dp[i]));
       }

        return dp[x][y];

    }
}
