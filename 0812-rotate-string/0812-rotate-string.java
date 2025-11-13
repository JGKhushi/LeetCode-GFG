class Solution {
    public boolean rotateString(String s, String g) {
        if (s == null || g == null) return false;
        if (s.length() != g.length()) return false;

        // Core trick: all rotations of s exist in (s+s)
        return (s + s).contains(g);
    }
}
