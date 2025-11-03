class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        char prev = colors.charAt(0);
        int pi = 0 ;int ans = 0 ;
        for(int i = 1 ;i< n ; i++){
        char curr = colors.charAt(i);
            if(curr == prev ){
                ans += Math.min(neededTime[i] , neededTime[pi]);
                if(neededTime[i] > neededTime[pi]){
                pi = i ;
                }
            }else{
                prev = curr;
                pi=i;
            }        
        }

        return ans ; 
    }
}