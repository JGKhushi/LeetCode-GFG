class Solution {
    public double myPow(double x, int n) {
        long N = n; // Convert to long to handle Integer.MIN_VALUE

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return power(x, N);
    }

    public double power(double x, long n) {
        if (n == 0) return 1;

        double temp = power(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * x;
        }
    }
}
