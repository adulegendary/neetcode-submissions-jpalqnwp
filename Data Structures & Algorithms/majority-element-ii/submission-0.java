class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length /3;
        Map<Integer, Integer> store = new HashMap<>();
        for(int i : nums){
            store.put(i, store.getOrDefault(i, 0) +1);
        }

        for(Integer val : store.keySet()){
             if(store.get(val) > n){
                result.add(val);
             }
        }

        return result;


    }
}