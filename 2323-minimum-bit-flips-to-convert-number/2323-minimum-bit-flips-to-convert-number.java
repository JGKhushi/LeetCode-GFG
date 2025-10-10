class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal  , cnt = 0 ;int i = 1;
        while(i<=xor){
            if((xor & i) != 0)cnt++;
            i = i<<1;
        }

        return cnt ;
    }
}