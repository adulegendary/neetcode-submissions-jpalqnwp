class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        int left = 0;
        Map<Integer, Integer> store = new HashMap<>();

        for(int i=0; i<nums.length; i++){
           if(store.containsKey(nums[i])){
               int vales = store.get(nums[i]);
               if(Math.abs(i-vales) <= k){return true;}
               store.put(nums[i], i);
           }else {
            store.put(nums[i], i);
           }    
        }

        return false;
    
    }
}