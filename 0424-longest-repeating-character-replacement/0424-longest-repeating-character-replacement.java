class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int res = 0 ;
        int j = 0;
        HashMap<Character , Integer> hmap = new HashMap<>();
        int maxFreq = 0 ; 

        for(int i=0; i<n ; i++){
           hmap.put(s.charAt(i) , hmap.getOrDefault(s.charAt(i) , 0) + 1); 
            maxFreq = Math.max(maxFreq , hmap.get(s.charAt(i)));

            while((i - j + 1 ) - maxFreq > k ){
                hmap.put(s.charAt(j) , hmap.getOrDefault(s.charAt(j) , 0) - 1); 
                j++;
            }

            res = Math.max(res , i-j+1);
        }

    return res ; 

    }
}