class Solution {
    public int singleNonDuplicate(int[] nums) {
        

      for(int i=1; i<nums.length; i++){
         
          if(i+1 < nums.length && nums[i+1] != nums[i] && nums[i-1] != nums[i]){
             System.out.println(nums[i] + "where it is");
             return nums[i];
          }else if(i+1 >= nums.length && nums[i-1] != nums[i]){
            System.out.println(nums[i] + "where it is");
                   return nums[i];
       }

      }
 System.out.println( "final it is");
      return nums[0];
   
   } 
}
//    right - left +1

//    right - mid  +1

// if mid -1 or mid +1 

