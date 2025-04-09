class Solution {
    public double myPow(double x, int n) {
        long N = n; // Convert to long to avoid overflow for Integer.MIN_VALUE

        if (N == 0) {
            return 1;
        }

        double temp = myPow(x, (int)(N / 2));  // store the half power

        if (N < 0) {
            x = 1 / x;
            N = -N; // make n positive
            temp = myPow(x, (int)(N / 2));
        }

        if (N % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * x;
        }
    }
}
