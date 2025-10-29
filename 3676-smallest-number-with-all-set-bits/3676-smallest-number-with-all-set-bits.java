class Solution {
    public int smallestNumber(int n) {
        int  num = n ;
        int l = 0 ;
        while(num > 0 ){
            num = num / 2 ;
            l++ ;
        }
        l=l-1;
        int ans = 1 ;
        while(l > 0){
            ans = ans + (int)Math.pow(2 , l);
            l--;
        }

        return ans ;
    }
}