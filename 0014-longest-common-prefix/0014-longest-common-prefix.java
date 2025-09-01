class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = strs[0];
        int n = strs.length;
        for(int i  = 1 ; i< n ; i++){
            int m = strs[i].length();
            String word = strs[i];
            int a = 0 ;
            int till = Math.min(common.length() , word.length());
            while(a<till && common.charAt(a) == word.charAt(a)){
                a++;
            }
           common = common.substring(0 , a);
        }

return common;


     }
}