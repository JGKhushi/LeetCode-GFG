class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals, (x, y) -> Integer.compare(x[0],y[0]));
        int end = intervals[0][1];
        int start = intervals[0][0];
        for(int i =  1; i < n ; i++){
           if(intervals[i][0] <= end) {
            end = Math.max(intervals[i][1],end);
           }else{
            ans.add(new int[]{start , end});
            start =  intervals[i][0];
             end =  intervals[i][1];
           }
        }

        ans.add(new int[]{start , end});
        return ans.toArray(new int[ans.size()][]) ;
    }
}