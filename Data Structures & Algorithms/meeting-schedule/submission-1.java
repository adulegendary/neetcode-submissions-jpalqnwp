/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        
         Collections.sort(intervals, (p1, p2) -> Integer.compare(p1.start, p2.end));
       if(intervals.size()<=1){return true;}
       Interval vale = intervals.get(0);
       for(int i=1; i<intervals.size(); i++){
            Interval temp = intervals.get(i);
            if(vale.end > temp.start){
                return false;
            }
            vale = temp;
       }
        return true;

    }
}
