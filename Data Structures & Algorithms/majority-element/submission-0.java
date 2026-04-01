class Solution {
    public int majorityElement(int[] nums) {
          
       int n = nums.length /2 ;
       int result = Integer.MIN_VALUE;
       Map<Integer, Integer> store = new HashMap<>();
       for(int i : nums){
          store.put(i, store.getOrDefault(i,0) +1);
       }

       for(Integer val : store.keySet()){
           if(store.get(val) > n && result < store.get(val)){
                result = val;
           }
       }

       return result;


    }
}