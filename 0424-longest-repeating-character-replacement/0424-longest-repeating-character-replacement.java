class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int ans = 0 ; 
        int start = 0 ;
        int maxFreq =  0;
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int  i = 0 ; i<n ; i++){
             hmap.put(s.charAt(i) , hmap.getOrDefault(s.charAt(i) , 0) + 1);
          maxFreq = Math.max(  hmap.get(s.charAt(i)) , maxFreq) ;
            while(i-start+1 - maxFreq  > k ){
                char c =s.charAt(start);
                hmap.put(c , hmap.get(c) - 1);
                start++;
            }
            ans = Math.max(ans , i-start+1);
        }
        return ans ;
    }
}