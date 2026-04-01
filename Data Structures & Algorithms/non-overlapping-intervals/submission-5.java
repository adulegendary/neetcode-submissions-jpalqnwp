class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));  
    for (int[] interval : intervals) {
        System.out.println(Arrays.toString(interval)); // Prints [1, 5], [2, 2], etc.
    }
    PriorityQueue<int[]> minHeap = new PriorityQueue<>(intervals.length, (a,b) -> Integer.compare(b[1],a[1]));
    int first = intervals[0][0];
    int last =  intervals[0][1];
    int result =0;
    for(int i=1; i<intervals.length; i++){
         int start = intervals[i][0];
         int end =  intervals[i][1];
         

         
        if(start < last){
            last = Math.min(last,end);
            result +=1;
         }else {
             last = end;    
         }
        
          

      }
    
        for (int[] interval : minHeap) {
            System.out.println(Arrays.toString(interval)); // Prints [1, 5], [2, 2], etc.
        }
        
   
     


      return result;
        
    }
}
