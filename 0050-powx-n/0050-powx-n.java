class Solution {
    public double myPow(double x, int n) {
        // Convert to long to avoid overflow
        long power = n;
        
        // Handle negative powers
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        return fastPower(x, power);
    }

    private double fastPower(double x, long n) {
        if (n == 0) return 1;

        double temp = fastPower(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * x;
        }
    }
}
