class Solution {
    
    public int countSubstrings(String s) {
       

        if(s.length()==0) return 0;
        int finalResult = 0;
        for(int i=0; i<s.length(); i++){
               finalResult += valid(s, i, i);
               finalResult += valid(s, i, i+1);
        }

        return finalResult;
     
    }

    public int valid(String s, int start, int end){
        int result =0;
        while(start >= 0 && end <s.length()){
            if(s.charAt(start) == s.charAt(end)){
                start -=1;
                end +=1;
                result +=1;
            }else {
                return result;
            }
        }
        return result;
        
    }
}