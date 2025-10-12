class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt = 0 ;
        int n = g.length , m = s.length , i=0 ,j = 0 ;
        while(i < n && j < m ){
            if(s[j] >= g[i] ){
                i++;
                j++;
                cnt++;
            }else{
                j++;
            }
        }
        return cnt;
    }
}