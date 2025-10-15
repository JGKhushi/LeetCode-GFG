class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int start = 0 ;
        HashMap<Character,Integer> hmap = new HashMap<>();
        int ans = 0 ;
        for(int i = 0 ; i< n ; i++){
            char c = s.charAt(i);
            if(hmap.containsKey(c)){
                int idx  = hmap.get(c);
                start = Math.max(start , idx+1);
            }
            hmap.put(c , i  );
            ans = Math.max(ans , i - start +1);
        }

        return ans ;
    }
}