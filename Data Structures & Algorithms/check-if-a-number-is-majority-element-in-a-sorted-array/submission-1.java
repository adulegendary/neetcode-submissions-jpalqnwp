class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        
        int majority = nums.length/2;

        int left =0; 
        int right = nums.length-1;
        int index = binary(left, right, nums, target);
        System.out.println(index);
        int leftSide =index;
        int rightSide = index;
        if(index == -1) return false;
        while(leftSide >= 0 && nums[leftSide] == target){
             leftSide --;
        }
        while(rightSide < nums.length && nums[rightSide] == target){
             rightSide ++;
        }
        System.out.println(leftSide +  " this left");
        System.out.println(rightSide + " this right");
        int window = (rightSide-1) - (leftSide +1)+1;
        if(window > majority){return true;}

        return false;

       
    }       

    public int binary(int left, int right, int [] nums, int target){
        while(left <= right ){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                     right = mid-1;
            }
            else{
                left = mid +1;
            }
        }

        return -1;
    }
}
