class Solution {
    public int shortestWay(String source, String target) {
        
        // if(source.length() > target.length()){
        //     return -1;
        // }

       
        int right =0;
        int counter =0;
        while(right < target.length()){
          int prev = right;
          for(int left =0; left <source.length(); left ++){
if(right < target.length() && source.charAt(left) == target.charAt(right)){
                right +=1;
            }
          }
            if(prev == right) return -1;
            counter +=1;
    
        }
    return counter;
}
    }
