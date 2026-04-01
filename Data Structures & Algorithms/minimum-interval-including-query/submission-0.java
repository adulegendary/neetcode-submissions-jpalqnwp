class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int [] result = new int[queries.length];


       Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
       PriorityQueue<int[]> minheap = new PriorityQueue<>(queries.length, (a,b) -> Integer.compare(a[0],b[0]));
       PriorityQueue<int[]> active = new PriorityQueue<>(queries.length, (a,b) -> Integer.compare(a[0],b[0]));

        for(int i=0; i<queries.length; i++){
              int []temp = {queries[i], i};
              minheap.add(temp);
        }

       int i =0;
        while(!minheap.isEmpty()){
            int [] temp = minheap.poll();
            while(i< intervals.length && intervals[i][0]<= temp[0]){
                  int size = intervals[i][1] - intervals[i][0] +1;
                  int [] checker = {size, intervals[i][1]};
                  active.add(checker);
                  i +=1;
            }

            while(!active.isEmpty() && active.peek()[1] < temp[0]){
                active.poll();
            }
           if(active.isEmpty()){
              result[temp[1]] = -1; 
           }else {
              result[temp[1]] = active.peek()[0]; 
           }
            
    


        }

       System.out.println(Arrays.toString(minheap.peek()));
        return result;



    }
}
