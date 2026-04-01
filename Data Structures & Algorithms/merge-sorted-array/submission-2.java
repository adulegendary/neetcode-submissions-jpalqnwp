class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
       
        reverse(nums1, 0, nums1.length-1);
        reverse(nums1, 0, n-1);
        reverse(nums1, n, nums1.length-1);
        int i =0;
        while(i < nums2.length){
            nums1[i] = nums2[i];
            i += 1;
        }
       
        Arrays.sort(nums1);
        
    }
    public void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[left] = nums[right];
            nums[right] = temp;
            left +=1;
            right -=1;
        }
    }
}