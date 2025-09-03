class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int ans = 0 ;
        for(int i = 0 ; i< n ; i++){
            int[] f = new int[26];
            for(int j = i ; j<n ; j++){
                String substr = s.substring(i , j+ 1);
                int mini = Integer.MAX_VALUE ; 
                int maxi = Integer.MIN_VALUE;

                
                    f[s.charAt(j)-'a']++;
                

                for(int  k  = 0 ; k < 26 ; k++){
                    if(f[k] != 0){
                    mini = Math.min(mini , f[k]);
                    maxi = Math.max(maxi , f[k]);

                    }
                }

                ans += maxi - mini ;

            }
        }


        return ans;
    }
}