class Solution {
    public int possibleStringCount(String word) {
        int n= word.length();
        char prev = word.charAt(0);
        int ans = 1 ;
      
        for(int i = 1 ; i< n ; i++){
            char curr = word.charAt(i);
            if(curr == prev){
                ans++;
            }else{
            prev = curr;
            }            
        }

       

        return ans ;
    }
}