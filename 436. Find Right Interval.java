/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
import java.util.*;

public class Solution {
    public int[] findRightInterval(Interval[] intervals) {
        
        NavigableMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<intervals.length; i++){
            map.put(intervals[i].start, i);
        }
        
        int[] res = new int[intervals.length];
        for(int i=0; i<intervals.length; i++){
            if(map.ceilingKey(intervals[i].end)==null)
                res[i]=-1;
            else
                res[i]=map.get(map.ceilingKey(intervals[i].end));
        }
        
        return res;
    }
}
