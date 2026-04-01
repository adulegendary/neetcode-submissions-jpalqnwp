class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        for(int i=0; i<=nums.length; i++){
              if(i == nums.length){
                int n = nums[i-1] ^ i;
                if(n != 0){return i;}
              }
              int n = i ^ nums[i];
              if(n != 0) {return i;}     
        }


        return 0;
        
    }
}
