class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        

        if(nums.length == 0){
            return 0;
        }

        int result =Integer.MAX_VALUE;
        int left =0;
        int counter =0;
        for(int right=0; right<nums.length; right ++){
             counter += nums[right];
             while(counter >=target){
                 int window = right - left +1;
                 result = Math.min(result, window);
                 counter -= nums[left++];
             }
        }

      if(result == Integer.MAX_VALUE) return 0;
      return result;  
    }
}