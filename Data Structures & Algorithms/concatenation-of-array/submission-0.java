class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        if(n ==0){
            return new int[]{};
        }
        int [] ans = new int[2*nums.length];
        for(int i=0; i<ans.length; i++){
            ans[i] = nums[i%n];
        }
        
        return ans;
    }
}