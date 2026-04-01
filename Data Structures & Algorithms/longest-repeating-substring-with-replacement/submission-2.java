class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> store = new HashMap<>();
        int left =0;
        int result =0;
        int temp =k;
        int maxOne =0;
        for(int i=0; i<s.length(); i++){
           Character ch = s.charAt(i);
           store.put(ch, store.getOrDefault(ch,0) +1);
           maxOne = Math.max(maxOne, store.getOrDefault(ch,0));
           //result = Math.max(result, (i-left +1));
           while((i-left +1) - maxOne > k){
              store.put(s.charAt(left), store.getOrDefault(s.charAt(left),0) -1);
              left +=1;
           }
           result = Math.max(result, (i-left +1));
          
        }
    return result;

    }
}
