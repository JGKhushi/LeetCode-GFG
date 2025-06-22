class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        for(int i = 0 ; i<word.length() ; i++){
            freq[word.charAt(i) - 'a']++;
        }
        int ans = Integer.MAX_VALUE;

        for(int i = 0 ; i<26 ; i++){
            if(freq[i] == 0){
                continue;
            }

            int delete = 0 ;
            int curr = freq[i];

            for(int j = 0 ; j<26 ; j++){
                if(i== j || freq[j] == 0)
                continue;

                if(freq[j] < curr)
                delete += freq[j];

                else if(Math.abs(freq[j] - curr) > k)
                delete += Math.abs(freq[j] - curr) - k ;
            }

            ans = Math.min(ans,delete);
        }

        return ans;
    }
}