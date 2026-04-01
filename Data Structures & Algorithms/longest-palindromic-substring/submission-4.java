class Solution {
    public String longestPalindrome(String s) {
        if(s.length() ==1){
            return s;
        }
        if(s.length()==2){
            if(s.charAt(0) == s.charAt(1)){
                return s;
            }
            return String.valueOf(s.charAt(0));
        }

        StringBuilder  result = new StringBuilder();
        int n = s.length();
        boolean [][]dp = new boolean[n+1][n+1];

        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                  if(i == j){

                    dp[i][j] =true;
                  }
            }
        }
        int begin =0;
        int dis =0;
         for(int j =1; j<n; j++){
                if(s.charAt(j) == s.charAt(j-1)){
                      dp[j-1][j] = true;
                      begin =j-1;
                      dis =2;
                }
              
                
            }
            System.out.println(begin);

 
        for(int end=2; end<n; end++){
            for(int start =0; start<end; start++){
                
                if(s.charAt(start) == s.charAt(end) && dp[start+1][end-1]){
                      dp[start][end] = true;
                      int len = end -start +1;
                      if(len > dis){
                         begin = start;
                         dis =len;
                      }
                     
                  }
            }
        }

        return s.substring(begin, begin + dis);
                
            



        
    }
}
