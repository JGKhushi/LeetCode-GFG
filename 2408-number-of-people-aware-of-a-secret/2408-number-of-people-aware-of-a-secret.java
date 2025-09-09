class Solution {
    static final int MOD = 1000000007;

    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long[] dp = new long[n + 1]; // dp[i] = new people on day i
        dp[1] = 1;
        long share = 0; // running sum of sharers

        for (int day = 2; day <= n; day++) {
            // add sharers who can start sharing today
            if (day - delay >= 1) {
                share = (share + dp[day - delay]) % MOD;
            }
            // remove sharers who forget today
            if (day - forget >= 1) {
                share = (share - dp[day - forget] + MOD) % MOD;
            }
            // new people who learned today
            dp[day] = share;
        }

        // count people who still remember secret at day n
        long ans = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            if (i >= 1) ans = (ans + dp[i]) % MOD;
        }

        return (int) ans;
    }
}
