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
    public int minMeetingRooms(Interval[] intervals) {
        if(intervals.length<=1)
            return intervals.length;
        Arrays.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval a, Interval b){
                return a.start-b.start;
            }
        });
        List<Interval> list=new ArrayList<>();
        list.add(intervals[0]);
        for(int i=1; i<intervals.length; i++){
            int len=list.size();
            boolean b = true;
            for(int j=0; j<len; j++){
                if(intervals[i].start>=list.get(j).end){
                    list.set(j, intervals[i]);
                    b=false;
                    break;
                }
            }
            if(b)
            list.add(intervals[i]);
        }
        
        return list.size();
    }
}
