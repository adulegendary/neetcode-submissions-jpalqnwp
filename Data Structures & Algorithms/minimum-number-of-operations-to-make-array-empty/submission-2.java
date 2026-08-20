class Solution {
    public int minOperations(int[] nums) {
         /*
         
         ums = [2,3,3,2,2,4,2,3,4]
         [2,2,2,2, 3,3,3, 4,4]
          0 1 2 3  4 5 6  7 8       
           2+1+               
         [2,1,2,2,3,3]
         [1, 2,2,2, 3,3]
         */

         Arrays.sort(nums);
         int result =0 ;
         int left = 0 ;
         int i =1;
         for(i=1; i<nums.length; i++){
              if(nums[i] != nums[i-1]){
                 // operation 
                 int window = i- left;
                 if(operation(window) == -1){
                     return -1;
                 }
                 result += operation(window);
                 left = i;
              }
         }
        int window = i- left;
        if(operation(window) == -1){
             return -1;
        }
        result +=operation(window);
         

        return result;
    }

    public int operation(int window){
         if(window == 1) return -1;
         return (int) Math.ceil((double) window / 3);
    }
}