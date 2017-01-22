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
    public int eraseOverlapIntervals(Interval[] intervals) {
        Arrays.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval a, Interval b){
                return a.start-b.start;
            }
            });
            
        int res=0;   
        for(int i=1; i<intervals.length; i++){
            if(intervals[i].start<intervals[i-1].end){
                res++;
                intervals[i].end=Math.min(intervals[i-1].end, intervals[i].end);
            }
        }
        return res;
    }
}
