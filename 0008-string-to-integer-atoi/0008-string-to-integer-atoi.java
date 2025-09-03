class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;

        int n = s.length();
        int sign = 1;
        int i = 0;
        long ans = 0;

        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        for (; i < n; i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                ans = ans * 10 + (s.charAt(i) - '0');

                // overflow handling
                if (sign == 1 && ans > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (sign == -1 && -ans < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            } else {
                break;
            }
        }

        return (int) ans * sign;
    }
}
