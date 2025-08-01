class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        boolean isNegative = false;
        String res = "";

        // 1. Ignore leading whitespaces (ASCII of ' ' is 32)
        while (i < n && s.charAt(i) == 32) {
            i++;
        }

        // 2. Handle sign
        if (i < n && s.charAt(i) == 45) { // '-' => ASCII 45
            isNegative = true;
            i++;
        } else if (i < n && s.charAt(i) == 43) { // '+' => ASCII 43
            i++;
        }

        // 3. Ignore leading zeroes (optional)
        while (i < n && s.charAt(i) == 48) { // '0' => ASCII 48
            i++;
        }

        // 4. Take numeric digits only
        while (i < n && s.charAt(i) >= 48 && s.charAt(i) <= 57) { // between '0' and '9'
            res += s.charAt(i);
            i++;
        }

        // 5. If res is empty, return 0
        if (res.length() == 0) return 0;

        // 6. Convert string to number safely using try-catch to avoid overflow
        try {
            int num = Integer.parseInt(res);
            return isNegative ? -num : num;
        } catch (NumberFormatException e) {
            // Handle overflow
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
