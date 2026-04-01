class Solution {
    public int[] productExceptSelf(int[] nums) {
        
      int []pref =  new int[nums.length];
      pref[0] = 1;
      for(int i=1; i<pref.length; i++) {
         pref[i] = pref[i-1] * nums[i-1];
      }
      int [] post =  new int[nums.length];
      post[nums.length-1] = 1;
      for(int i=nums.length-2; i>=0; i--) {
         post[i] = post[i+1] * nums[i+1];
      }

      int [] result =  new int[nums.length];
      for(int i=0; i<pref.length; i++) {
         result[i] = pref[i] * post[i];
      }

      return result; 
    }
}  
