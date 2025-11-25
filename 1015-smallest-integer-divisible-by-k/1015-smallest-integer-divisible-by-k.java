class Solution {
    public int smallestRepunitDivByK(int k) {        
        int n = 0 ;
        int length = 1 ;
        for(length = 1 ; length <= k ; length++){
            n  = (n * 10 + 1) % k ;
            if(n % k == 0 ){
                return length ;
            }
        }
        return -1;
        
    }
}