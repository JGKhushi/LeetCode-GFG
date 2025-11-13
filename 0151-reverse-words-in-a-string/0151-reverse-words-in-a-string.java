class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        int i = 0 ;
        while(i < n && s.charAt(i) == ' ' ){
            i++;
        }
        ArrayList<String> al = new ArrayList<>();
        for( ; i< n ; i++ ){
             while(i < n && s.charAt(i) == ' ' ){
            i++;
        }
            String wrd = "";
            while(i <n && s.charAt(i) != ' ' ){
                wrd += s.charAt(i);
                i++;
            }
           
           if(wrd.length() > 0)
            al.add(wrd);
            
        }

        String ans = "" ; 
        for(int j = al.size() - 1 ; j >= 1 ; j--){
            ans += al.get(j) + " ";
        }

         ans += al.get(0) ; 
        return ans ;
    }
}