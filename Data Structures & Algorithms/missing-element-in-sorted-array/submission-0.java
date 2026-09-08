class Solution {
    public int missingElement(int[] nums, int k) {
        
       

        int left =0;
        int right = nums.length-1;
        int index =nums.length-1;
        int valeDiff =0;
        while(left <= right){
            int mid = (left + right)/2;
        
            valeDiff = nums[mid] - nums[0] - mid;

            if(valeDiff >= k){
              right = mid-1;
              index = mid;
            
            }else{
               left = mid+1;
            }
        }
        int miss = nums[right] - nums[0] - right;
        int remain = k- miss; 
        return nums[right] + remain;

     /*   0      1     2
         [1  ,   2,    4], k = 3
                       lr
                       m 
        

        diff = 4-1-2= 1
        valedif = 2-1-1 =0
        0  1  2  3   4
        4, 7, 9, 10
           r

       
        7-4-1 = 2>3
        9 - 4-2 = 3 
         
     */






    }
}
