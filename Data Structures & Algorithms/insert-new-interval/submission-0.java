class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> vales = new ArrayList<>();
        int i =0;
        while(i<intervals.length && intervals[i][1] <newInterval[0]){
            int [] temp = intervals[i];  
            vales.add(temp);
            i++;
        }
    

       
        while(i<intervals.length && newInterval[1] >= intervals[i][0]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        vales.add(newInterval);

        while(i<intervals.length){
            vales.add(intervals[i]);
            i++;
        }

        int [][]result = new int[vales.size()][2];
        int index =0;
        for(int [] temp : vales){
            result[index ++] = temp;
        }

        return result;
    }
}
