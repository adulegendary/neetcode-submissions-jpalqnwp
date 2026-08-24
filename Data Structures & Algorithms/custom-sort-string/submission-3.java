class Solution {
    public String customSortString(String order, String s) {
        
        if(order.length()==0) return s;
        Map<Character, Integer>store = new HashMap<>();
        for(int i=0; i<order.length();i++){
             store.put(order.charAt(i), i);
        }

        Map<Character, Integer> frequency = new HashMap<>();
        char [] orde = s.toCharArray();
        for(int i=0; i<orde.length;i++){
         frequency.put(orde[i], frequency.getOrDefault(orde[i], 0)+1);
        }
      
       
        int counter =27;
        TreeMap<Integer, Character> sorted = new TreeMap<>();
        for(char ch: orde){
            System.out.println(ch);
           if(store.containsKey(ch)){
               sorted.put(store.get(ch), ch);
           }else{
             sorted.put(counter++, ch);
           }
        }
       
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, Character> entry : sorted.entrySet()) {
             char count = entry.getValue();
             for(int i=0; i<frequency.getOrDefault(count,0); i++){
                   result.append(count);
                   
             }
              frequency.remove(count);
            
        }

        return result.toString();
    }
}