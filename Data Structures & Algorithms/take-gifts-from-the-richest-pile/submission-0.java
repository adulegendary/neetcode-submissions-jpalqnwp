class Solution {
    public long pickGifts(int[] gifts, int k) {
        
     PriorityQueue<Integer> pq = new PriorityQueue<>();
     for(int num : gifts){
        pq.add(-num);
     } 

     while(k >0){
        int largeNumber = -pq.poll();
        int sqr = (int) Math.sqrt(largeNumber);
        pq.add(-sqr);
        k-=1;
     }

     long total =0;
     while(!pq.isEmpty()){
        total +=-pq.poll();
        
     }

     return total;
    }
}