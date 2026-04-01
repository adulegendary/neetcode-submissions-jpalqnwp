class Solution {
    public boolean isStrobogrammatic(String nums) {
        int left =0;
        int right =nums.length()-1;
     
        while(left <= right){
            if(nums.charAt(left) == '9' && nums.charAt(right) == '6' ||nums.charAt(left) == '6' && nums.charAt(right) =='9'){
                 left +=1;
                 right -=1;
                  continue;
            }
            if(nums.charAt(left) =='8' && nums.charAt(right) =='8'){
                   left +=1;
                   right -=1;
                 continue;
            } if(nums.charAt(left) =='0' && nums.charAt(right) =='0'){
                  left +=1;
                   right -=1;
                 continue;
            }if(nums.charAt(left) =='1' && nums.charAt(right) =='1'){
                  left +=1;
                   right -=1;
                 continue;
            }
            else {
                return false;
            }
         
        }

        return true;
    }
}
