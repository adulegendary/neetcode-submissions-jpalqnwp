class Solution {
    public int findJudge(int n, int[][] trust) {
        
      List<List<Integer>> graph = new ArrayList<>();
      for(int i=0; i<n+1; i++);
     
      int [] nums = new int[n+1];
      for(int [] temp: trust){
         int a = temp[0];
         int b = temp[1];
         if(nums[a] != 0) nums[a] -=1;
         nums[b] +=1;
      }
      int result =-1;
       System.out.println(Arrays.toString(nums));
      
      for(int i=0; i <nums.length; i++){
         if(nums[i] == n-1) return i;
      }
      return result;
    }
}