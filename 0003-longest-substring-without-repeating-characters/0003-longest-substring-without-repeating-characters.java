class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0 ;
        HashMap<Character,Integer> hmap = new HashMap<>();
        int maxlength = 0 ;

        for(int i = 0 ; i< s.length() ; i++){
            while(hmap.containsKey(s.charAt(i))){
                hmap.remove(s.charAt(start));
                start++;
            }
            hmap.put(s.charAt(i),i);
            maxlength = Math.max(maxlength , hmap.size());
        }

        return maxlength;
    }
}