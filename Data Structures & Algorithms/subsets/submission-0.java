class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
       // result.add(new ArrayList<>());

        dfs(result, new ArrayList<>(), nums, 0);

        return result;
        
    }

    public void dfs( List<List<Integer>> result, List<Integer> temp, int[]nums, int index){

        if(index == nums.length){
            result.add(new ArrayList<>(temp));
           
            return ;
        }

        
        temp.add(nums[index]);
        dfs(result, temp, nums, index+1);
        temp.remove(temp.size()-1);

         dfs(result, temp, nums, index + 1); 
        

    }
}
