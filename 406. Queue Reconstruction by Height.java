public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
        List<int[]> list = new ArrayList<>();
        Arrays.sort(people, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]==b[0]?a[1]-b[1]:b[0]-a[0];
            }
            });
        
        for(int[] e: people){
            list.add(e[1], e);
        }
        
        return list.toArray(new int[list.size()][2]);
    }
}
//refer to discussion forum;
