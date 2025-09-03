class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();

        if(h<n){
            return -1;
        }
        for(int i = 0 ; i<= h-n ; i++  ){
            String s = haystack.substring(i,i+n);
            if(s.equals(needle)){
                return i;
            }
        }

        return -1;
    }
}