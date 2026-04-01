class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
       if(stones.length ==2){return Math.abs(stones[0]- stones[1]); }
        for(int i : stones){
            maxHeap.add(i);


        }
        
        while(maxHeap.size() >1){
         
          
             int big =    maxHeap.poll();
             int small =  maxHeap.poll();
             int diff = big - small;
             if(diff > 0){
               maxHeap.add(diff);
             }
            

        }
      
        System.out.println(maxHeap);
        if(maxHeap.size() ==0){return 0;}
        return maxHeap.peek();
    }
}
