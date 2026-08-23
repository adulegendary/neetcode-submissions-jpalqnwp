class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        PriorityQueue<Pair<String, Integer>> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.getValue(), b.getValue()));
     
        for(int i=0; i<names.length; i++){
            Pair<String, Integer> temp =new Pair<>(names[i], -heights[i]);
            pq.add(temp);
            
        }
        String [] result = new String[names.length];
        int index = 0;
        while(!pq.isEmpty()){
            result[index++] = pq.poll().getKey();
        }
        return result;
    }
}