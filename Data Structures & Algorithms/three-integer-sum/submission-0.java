class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Set<List<Integer>> result = new HashSet();
      Arrays.sort(nums);
      System.out.println(Arrays.toString(nums))  ;
      for(int i =0; i< nums.length; i++){
          int left = i+1;
          int right = nums.length-1;
          while(left <right) {
            if(nums[i] + nums[left] + nums[right] == 0) {
               List<Integer> values = new ArrayList();
               System.out.println(i +  "this is the index");
               values.add(nums[i]);
               values.add(nums[left]);
               values.add(nums[right]);
               result.add(values);
               left +=1;
               right -=1;
            }else if(nums[i] + nums[left] + nums[right] > 0){
                right -=1;
            }else if(nums[i] + nums[left] + nums[right] < 0){
                left +=1;
            }
          }
          
     }

    List<List<Integer>> final_result = new ArrayList<>();

        for (List<Integer> innerSet : result) {
            final_result.add(new ArrayList<>(innerSet));
        }
     return final_result;
}
    
    }


   
