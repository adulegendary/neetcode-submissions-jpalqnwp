class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);

        Map<Integer, Integer> store = new HashMap<>();
        for(int i : nums){
            store.put(i, store.getOrDefault(i, 0)+1);
        }   
        int index =0;
        for(int i =0; i<=2; i++){
          if(store.containsKey(i)){
            for(int j=0; j<store.get(i); j++){
                nums[index ++] = i;
            }
          }  
       
        }
    }
}