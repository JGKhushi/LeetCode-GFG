class Solution {
    public String reverseWords(String s) {
        String ans = "";
        int n =s.length();
         int idx = n;
        for(int i =  n-1 ; i>=0 ; i--){
           if(i==n-1 && s.charAt(i) == ' '){
                while(i>=0 && s.charAt(i) == ' '){
                    i--;
                }
                    idx = i+1;
           }
          
         if(i>=0 && s.charAt(i) == ' '){
    
            if(i+1 < idx){
                if (!ans.isEmpty()) ans += " ";
                ans += s.substring(i+1 , idx );
                
            }
               
                idx = i;
            }
            
            if(i==0 && s.charAt(i) != ' '){
                if (!ans.isEmpty()) ans += " ";
                 ans += s.substring(i , idx );
                 break;
            }

           
           
        }

        return ans;
    }
}