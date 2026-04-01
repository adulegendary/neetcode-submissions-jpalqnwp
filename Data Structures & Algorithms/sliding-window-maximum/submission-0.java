class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       
        if(nums.length <=1 || k==1){
            return nums;
        }
       List<Integer> result = new ArrayList();
    
        int left =0;
       
        int index =0;  

        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0; i<nums.length; i++){
            
            
            while(!dq.isEmpty() && dq.getLast() < nums[i]){
                    dq.removeLast();
            }
            dq.addLast(nums[i]);
            
            if(i-left+1 ==k){
               int maxValue = dq.getFirst();
               result.add(maxValue);
               
               if(maxValue == nums[left]){
                  dq.removeFirst();
               }
               left +=1;
              
            }
        }
        int [] finalResult = new int[result.size()];
      
        for(int in : result){
           finalResult[index ++] = in;
        }

        return finalResult;
        
    }
}