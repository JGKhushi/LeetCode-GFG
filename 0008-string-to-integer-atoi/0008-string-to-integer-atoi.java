class Solution {

    public int myAtoi(String s) {
        return parse(s, 0, 0, false, false);
    }

    private int parse(String s, int i, long num, boolean isNegative, boolean signSeen) {
        int n = s.length();
        
        // Base case: end of string
        if (i >= n) {
            return (int) clamp(num, isNegative);
        }

        char ch = s.charAt(i);

        // 1. Ignore leading spaces
        if (ch == ' ' && num == 0 && !signSeen) {
            return parse(s, i + 1, num, isNegative, false);
        }

        // 2. Handle sign only once
        if ((ch == '+' || ch == '-') && num == 0 && !signSeen) {
            return parse(s, i + 1, num, ch == '-', true);
        }

        // 3. Process digit
        if (ch >= '0' && ch <= '9') {
            num = num * 10 + (ch - '0');

            // Handle overflow early
            if (!isNegative && num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (isNegative && -num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            return parse(s, i + 1, num, isNegative, true);
        }

        // 4. Any other character: stop parsing
        return (int) clamp(num, isNegative);
    }

    private long clamp(long num, boolean isNegative) {
        num = isNegative ? -num : num;

        if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return num;
    }
}
