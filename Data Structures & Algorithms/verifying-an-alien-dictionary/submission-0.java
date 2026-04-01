class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> store = new HashMap<>();
        for(int i=0; i<order.length(); i++){
            store.put(order.charAt(i), i);
        }
  
        if(words.length ==1){return true;}
        StringBuilder  holder = new StringBuilder(words[0]);
        for(int i=1; i<words.length; i++){
            int index =0;
            System.out.println(holder);
            for(int j = 0; j<holder.length(); j++){
                int temp = store.get(holder.toString().charAt(j)); 
                if(index ==0 && temp < store.get(words[i].charAt(index))){
                    break;
                }
                else if(index >= words[i].length()){return false;}
                else if(temp > store.get(words[i].charAt(index))){return false;}
                else if(temp < store.get(words[i].charAt(index))){break;}
                else if(temp == store.get(words[i].charAt(index))){index++;}
            }
            holder = new StringBuilder(words[i]);
        }

        return true;
    }
}