class Solution {
    public boolean rotateString(String s, String g) {
        if(s.length() != g.length()){
            return false ;
        }
        String ns = s + s;
        if(ns.contains(g)){
            return true ;
        }

        return false;
    }
}