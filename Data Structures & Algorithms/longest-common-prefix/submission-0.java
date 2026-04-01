class Solution {
    public String longestCommonPrefix(String[] strs) {
        
       if(strs.length ==1){return strs[0];}
       Arrays.sort(strs, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
       System.out.println(Arrays.toString(strs)); 
       StringBuilder result = new StringBuilder();
       boolean check  = false;
       for(int i=0; i<strs[0].length(); i++){
          for(int j=1; j<strs.length; j++){
               if(strs[0].charAt(i) != strs[j].charAt(i)){
                  check  = true;
                   break;
               }
          }
          if(check){break ;}
          else if(!check){result.append(strs[0].charAt(i)) ;}
       }
        
       return result.toString();
    
    }
}