class Solution {

    public int gcd(int n , int m ){
        if(n%m == 0 ){
            return m ;
        }

        return gcd(m , n%m);
    
    }
    public int minOperations(int[] nums) {
       int n = nums.length;
       int num1 = 0 ;
        int g = 0 ;
        for(int x : nums){
            if(x == 1){
                num1++;
            }
            g = gcd(g , x );
        }

        if(num1 > 0 ){
            return n - num1 ;
        }

        if(g > 1){
            return -1;
        }

        int minlen = n;

        for(int i = 0 ; i< n ; i++){
            int cg = 0 ;
            for(int j = i ;  j< n ; j++){
                cg = gcd(cg , nums[j]);
                if(cg == 1){
                    minlen = Math.min(minlen , j-i + 1);
                    break;
                }
            }
        }
        return minlen + n - 2;
    }
}