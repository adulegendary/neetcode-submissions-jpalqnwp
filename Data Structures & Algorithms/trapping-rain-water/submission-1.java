class Solution {
    public int trap(int[] height) {
       int []left = new int[height.length];
       int []right = new int [height.length];

     
       int maxLeft =0; 
       int result =0;
       for(int i=0; i< height.length; i++){
           maxLeft = Math.max(maxLeft, height[i]);
           left[i] = maxLeft;
       }
       int maxRight=0;
       for(int i=height.length-1; i>0; i--){
            right[i] = maxRight;
            maxRight = Math.max(maxRight, height[i]);
            
       }

       for(int i=0; i<height.length; i++){
          int vales = Math.min(left[i], right[i]);
          result += Math.max(0, vales - height[i]);
     
       }


        return result;
        
    }
}
