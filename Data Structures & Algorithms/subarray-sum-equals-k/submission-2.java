class Solution {
    public int subarraySum(int[] nums, int k) {


       int sum =0;
       int [] pref = new int[nums.length+1];
       pref[0] = 0;
       for(int i=1; i<pref.length; i++){
           pref[i] = pref[i-1] + nums[i-1];
       }

      Map<Integer, Integer> map = new HashMap<>();
      map.put(0,1);
      System.out.println(Arrays.toString(pref));
      for(int i=1; i<pref.length; i++){
           int temp = pref[i] - k;
           if(map.containsKey(temp)){
                sum += map.get(temp);
           }
           map.put(pref[i], map.getOrDefault(pref[i], 0)+1);
      }
       return sum;

    }
}