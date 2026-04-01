
class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(tasks.length == 0){
            return 0;
        }
        Map<Character, Integer> store = new HashMap<>();
        for(char ch : tasks){
            store.put(ch, store.getOrDefault(ch, 0) +1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int val : store.values()){
            pq.add(val);
            
        }
        System.out.println(pq);
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        
        int timer =0;
        int counter =0;
        while(!q.isEmpty() || !pq.isEmpty()){
           timer +=1;
           if(!pq.isEmpty()) {
               int val = pq.poll()-1;
                if (val > 0) {
                  q.add(new Pair<Integer, Integer>(val, timer + n));
                }
           }
           
           if(!q.isEmpty() && q.peek().getValue() == timer){
              Pair<Integer, Integer> temp = q.poll();
              pq.add(temp.getKey());
           }

           
        }
       
         
        
      return timer;
    }
}
