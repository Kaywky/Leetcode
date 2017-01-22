public class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length<=1)
            return points.length;
        
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
        
        
        int res=1;
        for(int i=1; i<points.length; i++){
            if(points[i][0]<=points[i-1][1]){
                points[i][0]=Math.min(points[i-1][0],points[i][0]);
                points[i][1]=Math.min(points[i-1][1],points[i][1]);
            }
            else{
                res++;
            }
        }
        
        return res;
        
    }
}

