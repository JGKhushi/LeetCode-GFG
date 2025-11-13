class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character > hmap1 = new HashMap<>();
        HashMap<Character , Character > hmap2 = new HashMap<>();
        int sl = s.length() ; 
        int tl = t.length() ;
        if(sl != tl) return false;
        for(int i = 0 ; i< sl ; i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
           if(hmap1.containsKey(sc) ){
            if( hmap1.get(sc) != tc )return false ;
           }
           else{
            hmap1.put(sc , tc);
           }

            if(hmap2.containsKey(tc) ){
            if( hmap2.get(tc) != sc )return false ;
           }
           else{
            hmap2.put(tc , sc);
           }  
        }

        return true ;

    }
}