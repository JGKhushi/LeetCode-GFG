class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hmap1 = new HashMap<>();
        HashMap<Character, Character> hmap2 = new HashMap<>();

       int n = s.length();
       int m = t.length();

       if(n != m){
        return false ;
       }

       for(int i = 0  ; i< n ; i++){

        char sc = s.charAt(i);
        char tc = t.charAt(i);
        //   s-> t 
         if(hmap1.containsKey(s.charAt(i))){
            if(hmap1.get(s.charAt(i)) != tc  ){
                return false;
            }
         }
         else{
            hmap1.put(sc ,tc);
         }

         //t->s 
         if(hmap2.containsKey(t.charAt(i))){
            if(hmap2.get(t.charAt(i)) != sc  ){
                return false;
            }
         }
         else{
            hmap2.put(tc,sc);
         }
       }

return true;
    }
}