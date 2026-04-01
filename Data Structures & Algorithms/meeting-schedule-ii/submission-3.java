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
    public int minMeetingRooms(List<Interval> intervals) {
    Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

       //System.out.println(intervals.get(0).end);
    if(intervals.size() ==1){
        return 1;}
    if(intervals.size() ==0){ return 0;}

   
    int days =0;
    List<List<Integer>> see = new ArrayList<>();
    boolean [] visted = new boolean[intervals.size()];
    for(int i=0;i <intervals.size(); i++){
         Interval check = intervals.get(i);
         if(visted[i] == true){
            continue;
         }
         List<Integer> room = new ArrayList<>();
         room.add(check.start);
         room.add(check.end);
         see.add(room);
         for(int j =i+1; j<intervals.size(); j++){
         
           Interval temp = intervals.get(j);
           if(!visted[j] && temp.start >= check.end){
             visted[j] = true;
             room.add(temp.start);
             room.add(temp.end);
             check = temp;
           }
             
         }
       
    }
       return see.size();
    }
}
