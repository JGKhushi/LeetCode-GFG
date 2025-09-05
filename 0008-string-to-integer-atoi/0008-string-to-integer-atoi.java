class Solution {

    public long fn(int i ,long ans , int sign , String s , int n ){
            if(i == n ){
                return ans ;
            }

            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                ans = ans * 10 + (s.charAt(i) - '0');
                if (sign == 1 && ans > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (sign == -1 && -ans < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            } else {
               return ans ;
            }

            return fn(i+1 ,ans , sign , s , n );
    }
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

       ans = fn(i ,ans , sign , s , n );
        

        return (int) ans * sign;
    }
}
