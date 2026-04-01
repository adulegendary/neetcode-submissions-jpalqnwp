class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        boolean [] visted = new boolean[nums.length];
        dfs(result, visted, nums, new ArrayList<>());

        return result;
        
    }

    public void dfs(List<List<Integer>> result,  boolean [] visted, int[] nums, List<Integer> temp){
        if(temp.size() == nums.length){
            result.add(new ArrayList(temp));
        }

        for(int i=0; i< nums.length; i++){
            if(visted[i] == true){
                continue;
            }
            visted[i] = true;
            temp.add(nums[i]);
            dfs(result, visted, nums,  temp);
            temp.remove(temp.size()-1);
            visted[i] = false;
        }
    }
}
