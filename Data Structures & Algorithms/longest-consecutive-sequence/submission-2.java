class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = Integer.MIN_VALUE;
        if(nums.length==0){return 0;}
        Set<Integer> store = new HashSet<>();
        for(int i: nums){
            store.add(i);
        }

        for(int i : nums){
            int count =1;
            int val =i;
            while(store.contains(val + 1)){
                 val = val + 1;
                 count +=1;
            }
            int vales =i;
             while(store.contains(vales-1)){
                 vales = vales-1;
                 count +=1;
                
            }
             ans = Math.max(ans, count);
        }

     return ans;   
    }
}
