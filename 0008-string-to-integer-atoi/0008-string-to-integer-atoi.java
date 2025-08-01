class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        boolean isNegative = false;
        String res = "";

        // 1. Ignore leading whitespaces (ASCII of ' ' is 32)
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Handle sign
        if (i < n && s.charAt(i) == '-') { // '-' => ASCII 45
            isNegative = true;
            i++;
        } else if (i < n && s.charAt(i) == '+') { // '+' => ASCII 43
            i++;
        }

        // 3. Ignore leading zeroes (optional)
        while (i < n && s.charAt(i) == '0') { // '0' => ASCII 48
            i++;
        }

        // 4. Take numeric digits only
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') { // between '0' and '9'
            res += s.charAt(i);
            i++;
        }

        // 5. If res is empty, return 0
        if (res.length() == 0) return 0;

        // 6. Convert string to number safely using try-catch to avoid overflow
        long num = 0;

// String ko digit by digit number banao
for (int j = 0; j < res.length(); j++) {
    num = num * 10 + (res.charAt(j) - '0'); // '0' ka ASCII 48
    if (num > Integer.MAX_VALUE) {
        break; // overflow hone lage toh ruko
    }
}

// Negative sign handle karo
if (isNegative) {
    num = -num;
}

// Clamp result within integer range
if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;

return (int) num;

    }
}
