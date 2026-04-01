class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int index =0;
        while(index <intervals.length && intervals[index][1] < newInterval[0]){
            result.add(new int[]{intervals[index][0], intervals[index][1]});
            index +=1;
        }
        
        while(index< intervals.length && newInterval[1] >= intervals[index][0] ){
             int newEnd = Math.max(newInterval[1], intervals[index][1]);
             int newStart = Math.min(newInterval[0], intervals[index][0]);

             newInterval[0] = newStart;
             newInterval[1] = newEnd;
             index ++;
        }

        result.add(new int[]{newInterval[0], newInterval[1]});

        while(index < intervals.length){
             result.add(new int[]{intervals[index][0], intervals[index][1]});
             index +=1;
        }

        return  result.toArray(new int[result.size()][2]);
        

    }
}
