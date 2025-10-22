class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        int mx = Arrays.stream(nums).max().getAsInt();
        int n= mx + k + 1;
        int f[] = new int[n];
        for(int num : nums)f[num]++ ;
        int cf[] = new int[n];
        cf[0]=Math.max(0,f[0]);
        for(int i = 1 ; i< n ; i++){
            cf[i]= cf[i-1]+f[i];
        }

        int ans = 0 ;
        for(int i =0 ; i<n; i++ ){
            int l = Math.max(i-k , 0 );
            int r = Math.min(i + k , n-1);
            int freq = 0 ;
            if(l>0)
             freq = cf[r] - cf[l-1] ; //total frequency
            else {
              freq = cf[r] ;
            }
            int need = freq - f[i]; //need to be adjusted ;
            int possible = Math.min(numOperations , need); //possible to adjust 
            int total =  f[i] + possible ; //total frequency after applying operations
            ans = Math.max(total , ans);
        }

        return ans ;
    }
}