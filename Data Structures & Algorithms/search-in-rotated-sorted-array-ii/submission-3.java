class Solution {
    public boolean search(int[] nums, int target) {
        

        int left =0;
        int right =nums.length-1;

        while(left <= right){
            int middle = (left + right)/2;
            if(nums[middle] == target) return true;
           

            if(nums[left] == nums[middle] && nums[middle] == nums[right]){
                left +=1;
                right -=1;
            }else if(nums[left] > nums[middle]){
               
                if(nums[middle] > target){
                    left = middle + 1;
                }else if(nums[middle] < target) {
                    right = middle -1;
                }
                 System.out.println("this should be first " + right);
            
            }else{
              //  System.out.println("this should be first " + left);
                if(nums[left] <= target && target < nums[middle]){
                    right = middle -1;
                }else {
                    left = middle +1;
                }
                System.out.println("this should be first " + left);
            }
        } 




        return false;
    }
}