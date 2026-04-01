class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []pref = new int[nums.length];
        pref[0] = 1;
        for(int i=1; i<nums.length; i++){
            pref[i] = nums[i-1] * pref[i-1];
        } 
        System.out.println(Arrays.toString(pref));
        int []post = new int[nums.length];
        post[nums.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--){
            post[i] = nums[i+1] * post[i+1];
        }

          System.out.println(Arrays.toString(post));
        int []result = new int[nums.length];
        for(int i=0;  i< nums.length; i++){
            result[i] = pref[i] * post[i];
        }
    return result;

    }
}  
