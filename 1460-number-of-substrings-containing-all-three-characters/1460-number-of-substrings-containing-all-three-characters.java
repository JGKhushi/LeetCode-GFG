class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length() , count = 0;
        int[] ls = {-1 , -1 , -1};

        for(int i = 0 ; i<n ; i++){
           ls[s.charAt(i) - 'a'] = i;
            if(ls[0]>=0 && ls[1]>=0 && ls[2]>=0 ){
                count += 1 + Math.min(ls[0] , Math.min(ls[1] , ls[2])) ;
            }
        }

        return count;
    }
}