class Solution {
    public void wiggleSort(int[] nums) {
        

        /*
          0 1 2 3 4 5
         [3,5,1,6,2,4]
                   
          if its even less than next val
          if its odd its great than  next val

        */

        for(int i=0; i<nums.length-1; i++){
            if(i%2 ==0){  // even 
                if(nums[i] > nums[i+1]){
                     swap(nums, i, i+1);
                }
            }else{
                if(nums[i] < nums[i+1]){
                     swap(nums, i, i+1);
                }
            }
        }
    }

    public void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
