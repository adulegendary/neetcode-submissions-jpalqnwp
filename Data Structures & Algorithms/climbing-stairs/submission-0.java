class Solution {
    int []memo;
    public int climbStairs(int n) {
         memo= new int[n+1];
         memo[0] = 0;
         memo[1] = 1;
        Arrays.fill(memo,0);
        int result = helper(n);
        return result;


        
    }

    public int helper(int n){
        if(n<=1){
            return 1;
        }

        if(memo[n] != 0){
            return memo[n];
        }
        
        
        memo[n] = helper(n-1) + helper(n-2);
       // System.out.println(Arrays.toString(memo));

        return memo[n]; 
    
    } 
}
