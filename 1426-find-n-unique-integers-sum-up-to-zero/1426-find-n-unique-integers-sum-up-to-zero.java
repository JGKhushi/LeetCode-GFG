class Solution {
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        for(int i = 1 ; i<=n/2 ; i++){
            ans[i-1] = i;
        }
        for(int i = 1 ; i<=n/2 ; i++){
            ans[i-1+(n/2)] = -i;
        }

        if(n%2 != 0){
            ans[n-1] = 0;
        }
        
        
        return ans;

    }
}