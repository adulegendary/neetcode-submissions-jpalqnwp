class Solution {
    List<List<Integer>> result; 
    public List<List<Integer>> permuteUnique(int[] nums) {
        

        result = new ArrayList<>();
        boolean [] visted = new boolean[nums.length];
        Arrays.sort(nums);

        dfs(nums, new ArrayList<>(), visted);
        return result;
    }

    public void dfs(int[] nums, List<Integer> temp , boolean [] visted){
        if(temp.size() == nums.length){
             result.add(new ArrayList<>(temp));
             //return ;
        }

        for(int i=0; i<nums.length; i++){
            if(visted[i] || i > 0 && !visted[i-1] && i>0 && nums[i] == nums[i-1] ){
                 continue;
            }
     
            visted[i] = true;
            temp.add(nums[i]);
            System.out.println(temp);
            dfs(nums, temp,visted);
            temp.remove(temp.size()-1);
            visted[i] = false;
        }
    }
}