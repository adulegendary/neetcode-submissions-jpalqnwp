class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> check = new HashSet<>(wordDict);
        System.out.println(check);

        boolean [] dp = new boolean[s.length()+1];
        dp[0] = true;

        for(int i=0; i<= s.length(); i++){
            for(int j=0; j<=i; j++){
                if(dp[j] && check.contains(s.substring(j,i))){
                    dp[i] = true;
                }
            }
        }

        return dp[s.length()];



        



    
        
        
    }
}
