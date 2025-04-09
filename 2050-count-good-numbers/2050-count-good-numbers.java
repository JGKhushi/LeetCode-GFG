class Solution {
    int mod = 1000000007;

    public int countGoodNumbers(long n) {
       

        long evenWays = fastPower(20, n/2);
       

if(n%2 == 1){
    evenWays*=5;
}
        return (int)((evenWays) % mod);
    }

    private long fastPower(long base, long power) {
        long result = 1;
   

        while (power > 0) {
            if (power % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            power /= 2;
        }

        return result;
    }
}
