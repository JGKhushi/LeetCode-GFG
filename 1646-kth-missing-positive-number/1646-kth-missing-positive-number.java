class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length ;
        int missing = 0;
        int ans = 1;
        int i = 1;
        while (i<=n){
            if(arr[i-1] == ans){
                i++;
            }else{
                k--;
            }
            
            if( k == 0){
                return ans;
            }
            ans++;
        }

        return arr[n-1] + k;
    }
}