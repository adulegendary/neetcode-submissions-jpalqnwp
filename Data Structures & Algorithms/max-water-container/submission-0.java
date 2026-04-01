class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int result = 0;
        while(left < right){
              int area = Math.min(heights[left], heights[right]);
              System.out.println(area + "this is area");
              int total = (right-left)*area;
              System.out.println(total + "this is area");
              result = Math.max(result, total);
              if(heights[left] < heights[right]){
                left +=1;
              }else{
                right -=1;
              }
        }

    return result;
    }
}
