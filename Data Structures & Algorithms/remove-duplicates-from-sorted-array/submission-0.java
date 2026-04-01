class Solution {
    public int removeDuplicates(int[] nums) {
        
        Set<Integer> store = new HashSet<>();
        List<Integer> k = new ArrayList<>();
   

        int left =0; 
        for(int i=0; i<nums.length; i++){
           if(nums[left] != nums[i]){
               
               k.add(nums[left]);
               left =i;
           }
        }
        k.add(nums[nums.length-1]);
        int index =0;
        for(int temp : k){
          nums[index++] = temp;
        }
       
        System.out.println(k);

        return k.size();

        
    }
}