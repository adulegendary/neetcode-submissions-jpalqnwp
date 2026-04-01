class Solution {
    public boolean validPalindrome(String s) {
     
       int left = 0;
       int right = s.length()-1;

       while(left < right){
          if(s.charAt(left) != s.charAt(right)){
                 
                 if(isPalindrome(s, left, right-1)){
                    return true;
                 }if(isPalindrome(s, left+1, right)){
                    return true;
                 }
                 return false;
            }
            left +=1;
            right -=1;
       }
       
        return true;
    }

    public boolean isPalindrome(String s,int left, int right){

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                 return false;
            }
            left +=1;
            right -=1;
        }

        return true;
    }
}