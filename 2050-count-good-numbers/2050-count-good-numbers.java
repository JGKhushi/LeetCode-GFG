class Solution {
    int mod = 1000000007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;  // even indices
        long oddCount = n / 2;         // odd indices

        long evenWays = fastPower(5, evenCount);
        long oddWays = fastPower(4, oddCount);

        return (int)((evenWays * oddWays) % mod);
    }

    private long fastPower(long base, long power) {
        long result = 1;
        base = base % mod;

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
