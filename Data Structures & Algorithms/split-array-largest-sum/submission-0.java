class Solution {
    public int splitArray(int[] nums, int k) {

        if(nums.length==0) return 0;

        int right = 0;
        for(int i: nums) right +=i;
        int left =0;
        for(int i: nums) left = Math.max(left, i);

        int ans = right;
        System.out.println(left + " " + right);
        while(left <= right){
            int middle = (left + (right -left)/2);
            System.out.println(middle + " middle");
            int split =1;
            int currentSum= 0;
            for(int i: nums) {
               currentSum +=i;
               if(currentSum > middle){
                    currentSum = i;
                    split +=1;
               }
            }

            if(split <= k){
                 ans = middle;
                 right = middle -1;

            }else{
                left = middle +1;
            }
        }

        return ans;

    }
}