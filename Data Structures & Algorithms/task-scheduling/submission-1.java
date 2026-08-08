class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        Map<Character, Integer> map = new HashMap<>();

        for (char ch: tasks){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int val: map.values()){
            max.add(val);
        }
       Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        int timer = 0;
        while(!q.isEmpty() || !max.isEmpty()){
            timer ++;
            if(!max.isEmpty()){
                 int leftOver = max.poll()-1;
                 if (leftOver > 0){
                      q.add(new Pair<>(leftOver, timer + n));
                 }
            }
            if(!q.isEmpty() && q.peek().getValue() == timer){
                 Pair<Integer, Integer> temp = q.poll();
                 max.add(temp.getKey());
            }
        }
        System.out.println(max);

        return timer;
    }
}
