class Solution {
    public int[][] merge(int[][] intervals) {
        
    
  
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    if (intervals.length == 0) return new int[0][];

    int start = intervals[0][0];
    int end = intervals[0][1];

    List<int[]> answer = new ArrayList<>();

    for (int i = 1; i < intervals.length; i++) {
        int cur_start = intervals[i][0];
        int cur_end = intervals[i][1];

        if (end >= cur_start) {
            end = Math.max(end, cur_end);
            start = Math.min(start, cur_start);
        } else {
            answer.add(new int[]{start, end});
            start = cur_start;
            end = cur_end;
        }
    }

    answer.add(new int[]{start, end});

    return answer.toArray(new int[answer.size()][]);
      
    }
}
