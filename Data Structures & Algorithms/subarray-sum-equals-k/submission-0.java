class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> store = new HashMap<>();
        int []pref = new int[nums.length+1];
        for(int i=0; i< nums.length; i++){
            pref[i+1] = pref[i] + nums[i];
        }

        store.put(0,1);
        int result =0;
        for(int i=0; i< nums.length; i++){
            int val = pref[i+1];
            result += store.getOrDefault(val-k, 0);
            store.put(val, store.getOrDefault(val, 0) +1);
        }

        return result;
        
    }
}