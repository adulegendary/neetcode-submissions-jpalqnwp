class Solution {
    public int pivotIndex(int[] nums) {

         int []pref = new int[nums.length+1];
         pref[0] = 0;
         for(int i=1; i<pref.length; i++){
            pref[i] = pref[i-1] + nums[i-1];
         }

         int large = pref[nums.length];
System.out.println(large);
         for(int i=1; i<pref.length; i++){
            int left = pref[i-1];
            int compare = pref[i];
            int vale = large - compare ;
        
             if(vale == left){
                return i-1;
             }  
         }

         return -1;   
 


    }
}