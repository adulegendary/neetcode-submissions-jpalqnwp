class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        

        /*
        [5:0, 1:1,  ,]
        nums = [23,2,4,6,7], k = 6
                current = 29%6 = 
                if length is greater or equal to 2:
                   
        
        */

        Map<Integer, Integer> store = new HashMap<>();
        store.put(0, -1);
        int current = 0;
        for(int i=0; i<nums.length; i++){
            current = current + nums[i];
            int remainder = current%k;
            if(store.containsKey(remainder)){
                  int window = i - store.get(remainder);
                  if(window >= 2){
                     return true;
                  }
            }else{
                  store.put(remainder, i); 
            }
          //[0:-1, 2:0, ]
           // System.out.println(store);
        }
     

        return false;
    }
}