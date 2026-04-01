class Solution {
    public int longestConsecutive(int[] nums) {
        int first =0;
        int index =0;
        Set<Integer> store = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            store.add(nums[i]);
        }
       int result =0;
        for(int i=0; i<nums.length; i++){
            int counter =0;
            if(!store.contains(nums[i]-1)){
                 counter +=1;
                 int values = nums[i];
                 while(store.contains(values + 1)){
                     System.out.println(values + "  this is the values");
                    values +=1;
                    counter +=1;
                 }
                 System.out.println(counter);
                 result = Math.max(counter, result);
              }
        }


        System.out.println(store);

        return result;
    }
}
