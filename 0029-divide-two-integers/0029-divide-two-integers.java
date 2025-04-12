class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor){
            return 1;
        }

        // Determine the sign of the result
        boolean sign = (dividend < 0) == (divisor < 0);

        // Convert to positive values (long to avoid overflow)
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        long q = 0;

        // Bit manipulation loop
        while(n >= d){
            int cnt = 0;
            while(n >= (d << (cnt + 1))){
                cnt++;
            }
            q += 1L << cnt;
            n -= d << cnt;
        }

        // Handle overflow
        if(q > Integer.MAX_VALUE){
            return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return sign ? (int) q : (int)(-q);
    }
}
