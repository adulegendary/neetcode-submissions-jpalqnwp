class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
            
        if(k> nums.length) return 0.0;
 
        double left =0;
        double right=0;  
        for(int temp : nums){
             left = Math.min((double)temp, left);
             right = Math.max((double)temp, right);
        }               
       
       while(right -left >1e-5){

        double mid = (left + right)/2.0;
        double current = 0;
        int counter =0;
        if(check(nums, mid, k)){
            left = mid;
        }else{
            right = mid;
        }

       }
            
    return left;
    }

    public boolean check(int [] num, double mid, int k){
          double sum =0;
           // First k elements
          for (int i = 0; i < k; i++) {
             sum += num[i] - mid;
           }

           if(sum >=0) {return true;}

           double prev =0;
           double minprev =0;
           for(int i=k; i<num.length; i++){
                sum += num[i] - mid;
                
                prev +=num[i-k] - mid;
                minprev = Math.min(prev, minprev);
                if(sum - minprev>=0) return true;

           }  
     
         return false;

    }
}
