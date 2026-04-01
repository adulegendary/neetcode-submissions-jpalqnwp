class Solution {
    public boolean isSubsequence(String s, String t) {
        int left =0;
        int right =0;
      //  if(s.length() ==0 ) return false;

        while(left <s.length() &&  right < t.length()){
            if(s.charAt(left) == t.charAt(right)){
                left +=1;
                right +=1;
            }else{
                right +=1;
            }
            
        }
        System.out.println(left);

        return (left == s.length());

      
    }
}