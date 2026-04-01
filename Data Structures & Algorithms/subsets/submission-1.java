class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
       // result.add(new ArrayList<>());

        dfs(result, new ArrayList<>(), nums, 0);

        return result;
        
    }

    public void dfs( List<List<Integer>> result, List<Integer> temp, int[]nums, int index){

    
        result.add(new ArrayList<>(temp));
        System.out.println(result);
        for(int i= index; i<nums.length; i++){
           temp.add(nums[i]);
           System.out.println(temp + "before");
           dfs(result, temp, nums, i+1);
           
           temp.remove(temp.size()-1);
            System.out.println(temp + "after");

          
        }
       
    }
}
