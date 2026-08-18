class Solution {
    public int minSubarray(int[] nums, int p) {

        /*
        
        [3]
        [3,1]
        [3,1,4]
        [3,1,4,2]

        [1]
        [1,4]
        [1, 4, 2]

        [4]
        [4,2]

        [2]

        [   3, 1, 4, 2]
        [0, 3, 4, 8, 10]
        right - left = 1
        10-3 = 7%6 
        
                  
        
       */
        long total =0;
        for(int i=0; i<nums.length; i++){
            total += (long)(nums[i]);
        }

        
        if(total %p ==0){return 0;}
        int targetMode = (int)(total %p);
        long current = 0L;
       int result = 1000000000;
       Map<Long, Integer> store = new HashMap<>(); 
       store.put(0L, -1);
       System.out.println(targetMode +  " this is TARGGET");
       for(int i=0; i<nums.length; i++){
           current = (long)((current + nums[i])%p);
           long pref = ((current - targetMode + p))%p;
          
           if(store.containsKey(pref)){
              int window = i- store.get(pref);
              result = Math.min(window, result);
           }
           store.put(current, i);
       }
        return result == nums.length? -1: result;

    }
}