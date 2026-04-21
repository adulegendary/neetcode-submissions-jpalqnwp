class Solution {
    int result;
    int [] dp;
    public int numDecodings(String s) {

       
        result =0;
        dp = new int[s.length()];
        if(s.charAt(0) == '0') return 0;

        Arrays.fill(dp, -1);

        dfs(s, 0);
        return result;
        
        
    }

    public void dfs(String s, int index){
       
        if(index >= s.length()){
            result +=1;
            return ;
        }
        
        if(s.charAt(index) == '0'){
            return ;
        }

        if(dp[index] != -1){
             result += dp[index];
             return;
        }

        dfs(s, index + 1);

        if(index + 1 < s.length()){
            int number = (s.charAt(index) - '0') * 10 +  (s.charAt(index+1) - '0');
            System.out.println(number + " this number");
            if(number >=10 && number<=26){
                dfs(s, index +2);
            }
        }
        //  System.out.println(index + " this number");
        //   System.out.println(Arrays.toString(dp) + " this before");
        //    System.out.println(result + " this result");
        dp[index] = result;
        // System.out.println(Arrays.toString(dp) + " this after");
        return ;

    }
}
