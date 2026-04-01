class Solution {
    public int findKthLargest(int[] nums, int k) {

    PriorityQueue<Integer>  maxHeap  = new PriorityQueue<Integer>(Collections.reverseOrder());
       for(int i=0; i<nums.length; i++){
          maxHeap.add(nums[i]);
       }
       int index =0;

       while(index<k-1){
         maxHeap.poll();
         index +=1;
       }
       return maxHeap.peek();
        
    }
}
