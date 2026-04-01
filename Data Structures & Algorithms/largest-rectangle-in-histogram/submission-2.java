class Solution {
    public int largestRectangleArea(int[] heights) {
        int result =Math.max(heights[0], 0);
        
        
        for(int i=0; i<heights.length; i++){
           int right = i+1;
           int left=i-1;
           int counter=heights[i];
             System.out.println(heights[i]);
           while(left >=0){
            System.out.println("Didd it getting here");
             if(heights[left] >= heights[i] ){
                     counter +=heights[i];
                     left -=1;
               }else {
                   break;
               }
               
              
           }
           while(right <=heights.length-1){
             System.out.println("Didd it getting here");
                if(heights[right] >= heights[i]){
                     counter +=heights[i];
                      right +=1;
               }else {
                   break;
               }
               
           }
           System.out.println(counter);
           result = Math.max(result, counter);   
        }
        result =Math.max(heights[heights.length-1], result);

        return result;
    }
}
