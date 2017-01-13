/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if(intervals.size()<1){
            intervals.add(newInterval);
            return intervals;
        }
        
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval a, Interval b){
                return a.start-b.start;
            }
        });
        
        int i=0;
        while(i<intervals.size() && intervals.get(i).start<newInterval.start){
            i++;
        }
        
        intervals.add(i, newInterval);
        
        i=Math.max(i-1, 0);
        
        while(i<intervals.size()-1){
            if(intervals.get(i).end>=intervals.get(i+1).start){
                intervals.set(i, new Interval(intervals.get(i).start, Math.max(intervals.get(i).end, intervals.get(i+1).end)));
                intervals.remove(i+1);
                continue;
            }
            else
                i++;
        }
        
        return intervals;
       
    }
}
