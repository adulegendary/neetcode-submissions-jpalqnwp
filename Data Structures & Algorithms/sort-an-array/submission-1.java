class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
       
        PriorityQueue<Integer> p = new PriorityQueue<>();
        
        for(int i : nums){
            p.add(i);
        }
        
 
        int index = 0;
       while(!p.isEmpty()){
         nums[index ++] = p.poll();
        }
        return nums;
    }
}