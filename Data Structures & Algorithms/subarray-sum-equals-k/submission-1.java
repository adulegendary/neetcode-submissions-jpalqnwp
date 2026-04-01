class Solution {
    public int subarraySum(int[] nums, int k) {


       int sum =0;
       for(int i=0; i<nums.length; i++){
        int temp =0;
        for(int j=i; j<nums.length; j++){
             temp +=nums[j];
             if(temp == k){sum+=1;}
        }
       }

       return sum;

    }
}