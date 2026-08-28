class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        

        int left =0;
        int result = 0 ;
        Map<Character, Integer> store = new HashMap<>();
        for(int right =0; right < s.length(); right++){
            char ch = s.charAt(right);
            store.put(ch, store.getOrDefault(ch, 0)+1);
            while(left < s.length() && store.size() > 2){
               
                  char ch2 = s.charAt(left);
                  store.put(ch2, store.getOrDefault(ch2, 0)-1);
                  if(store.getOrDefault(ch2, 0) == 0){
                      store.remove(ch2);
                  }
               
                  left +=1;
            }
            

            result = Math.max(right-left+1, result);
             
        }

        return result;
    }
}