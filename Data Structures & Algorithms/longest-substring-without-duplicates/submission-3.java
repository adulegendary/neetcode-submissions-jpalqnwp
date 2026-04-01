class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int result =0; 
        Set<Character> store = new LinkedHashSet<>();
        for(int i=0; i<s.length(); i++){
          
            if(!store.contains(s.charAt(i))){
                 result = Math.max(result, i-left+1);
                 store.add(s.charAt(i));
            }else{
               while (store.contains(s.charAt(i))) {
                     store.remove(s.charAt(left));
                     left +=1;
                   }

                     
                    // or perform any other operation
               }
                // System.out.println(left); 
               store.add(s.charAt(i));              
            }
            return result;
        }
    }
