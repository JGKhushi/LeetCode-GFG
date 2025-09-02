class Solution {
    public boolean rotateString(String s, String g) {
        if(s.length() != g.length()){
            return false;
        }
        int n = s.length();

        for(int i = 0; i < n; i++) {
            String rotated = s.substring(i, n) + s.substring(0, i);
            if(rotated.equals(g)) {
                return true;
            }
        }
        return false;
    }
}
