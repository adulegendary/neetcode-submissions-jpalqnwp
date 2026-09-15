class Solution {
    public int minimizeMax(int[] nums, int p) {
        
        int left =Integer.MAX_VALUE, right = Integer.MIN_VALUE;
        for(int i: nums){
             left = Math.min(left, i);
             right = Math.max(right, i);
        }
        right = right -left;
        left =0;
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        while(left <= right){  // 10 . 1 = 5, [1, 2, 2, 2, 3, 3, 4]
       //                                        
            int mid = left + (right -left)/2; // 4 +1 /2 = 2
            int count =0;                      // 1+1/2 = 1
            for(int i=0; i<nums.length-1; i+=1){
                
                int val = Math.abs(nums[i]- nums[i+1]);
                if(val <= mid){
                     count +=1;
                     i+=1;
                }


            }
            if(count >= p){
                right = mid -1;
            }else{
                left = mid +1;
            }

        }

        return  left;
    }
}