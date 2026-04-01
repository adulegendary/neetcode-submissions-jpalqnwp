class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> vales = new HashSet();
       for(Integer num: nums){
           if(vales.contains(num)){
              return true;
           }
           vales.add(num);
       }
       return false;
    }
}
