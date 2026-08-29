class Solution {
    public String longestDiverseString(int a, int b, int c) {
        
PriorityQueue<Pair<Character, Integer>> pq =
        new PriorityQueue<>(
            (d, e) -> Integer.compare(e.getValue(), d.getValue())
        );


       StringBuilder result = new StringBuilder();

      if(a > 0) pq.add(new Pair<>('a', a));
      if (b >0) pq.add(new Pair<>('b', b));
      if(c >0) pq.add(new Pair<>('c', c));
       
       while(!pq.isEmpty()){
            
          Pair<Character, Integer> temp = pq.poll();
          if(result.length() >=2 && result.charAt(result.length()-1) == result.charAt(result.length()-2) && result.charAt(result.length()-1) == temp.getKey())  {
                     if(!pq.isEmpty()){
                        Pair<Character, Integer> temp2 = pq.poll();
                        int value = temp2.getValue() -1;
                        result.append(temp2.getKey());
                        if(value >0){
                            pq.add(new Pair<>(temp2.getKey(), value));
                        }

                     }else{
                         break;
                        // return result.toString();
                     }
                      


         pq.add(temp);
          }else {
                result.append(temp.getKey());
                int value = temp.getValue() - 1;
                if (value > 0) {
                    pq.add(new Pair<>(temp.getKey(), value));
                }
            }

       } 

       return result.toString();

    }
}