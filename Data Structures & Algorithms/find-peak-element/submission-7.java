class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length ==1) return 0;

        int left  =0;
        int right = nums.length-1;
        while(left <= right){
           int mid = (left + right)/2;
        //    if(mid-1 >=0 && nums[mid-1] < nums[mid] && mid +1 < nums.length && nums[mid] > nums[mid+1]){
        //        return mid;
        //    }

        //    if((mid-1 <0 && nums[mid] > nums[mid+1])||(mid +1 >= nums.length && nums[mid] > nums[mid-1])){
        //        return mid;
        //    }

           if(mid +1 < nums.length && nums[mid] < nums[mid+1]){
                left = mid+1;
           }else if (mid-1>=0 && nums[mid-1] > nums[mid]){
              right = mid -1;
           }else{
              return mid;
           }
        }


        return -1;


       /*
        0 1 2 3
        1,2,3
            lr

        0 1 2 3 4 5 6
       [1,2,1,3,4,5,0]
        l     m      r 
       
                   5
                 4
              3
         1
       */ 
    }
}