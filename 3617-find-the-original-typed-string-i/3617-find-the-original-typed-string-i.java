class Solution {
    public int possibleStringCount(String word) {
        int n= word.length();
        
        int ans = 0 ;
        int cnt = 1;
        for(int i = 1 ; i< n ; i++){
            if(word.charAt(i) == word.charAt(i-1)){
                cnt++;
            }
            else{
                if(cnt > 1){
                    ans = ans + cnt - 1;
                }
                
                cnt = 1;
            }

            if(i == n-1){
                if(cnt > 1){
                    ans = ans + cnt - 1;
                }
                
            }
        }

       

        return ans+1 ;
    }
}