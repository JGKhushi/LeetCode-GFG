class Solution {
    public int minBitFlips(int start, int goal) {
        int n = start ^ goal ;
        int count = 0 ;
        while(n>0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1 ;
        }

        return count ;
    }
}