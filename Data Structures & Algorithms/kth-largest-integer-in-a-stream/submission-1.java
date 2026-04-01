class KthLargest {
      PriorityQueue<Integer> heapFromArray;
      int largest;
    public KthLargest(int k, int[] nums) {
        largest = k;
        heapFromArray = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
             heapFromArray.add(nums[i]);
           if(heapFromArray.size()> k){
              heapFromArray.poll();
           }
         
        }
        
    }
    
    public int add(int val) {
        int values =0;
        heapFromArray.add(val);
        if(heapFromArray.size() > largest){
            heapFromArray.poll();
        }
       

         return heapFromArray.peek();
    }
}
