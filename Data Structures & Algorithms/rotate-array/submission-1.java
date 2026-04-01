class Solution {
    public void rotate(int[] nums, int k) {
        
        
        int left = 0;
        int right = nums.length-1;
        reverse(nums, left, right); 
        right =  k%nums.length;
        reverse(nums, 0, right-1);
        reverse(nums, right, nums.length-1);

    }

    public void reverse(int[] nums, int left, int right){
        
        while(left < right){
            System.out.println(left);
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left +=1;
            right -=1;
        }
    }
}