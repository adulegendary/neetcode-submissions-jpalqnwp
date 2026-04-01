class Solution {
    int result;
    public int subsetXORSum(int[] nums) {
        
     // int result = 4 ^ 2;
      result =0;
      dfs(nums, 0, 0);
      return result;
    
    }

    public void dfs(int [] nums, int current, int index){
       
       for(int i=index; i<nums.length; i++){
          int vales = current ^ nums[i];
          result +=vales;
          System.out.println(result);
          dfs(nums, vales, i+1);
          //current
       }

    }
}