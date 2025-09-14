class Solution {

    HashSet<String> hset = new HashSet<>();
    HashMap<String,String> lc = new HashMap<>();
    HashMap<String, String> dv = new HashMap<>();

    public String[] spellchecker(String[] wordlist, String[] queries) {
        
        int n = queries.length;

        for(String q : wordlist){
            hset.add(q);
            String sl = q.toLowerCase();
            lc.putIfAbsent(sl,q);
            String wv = dvf(sl);
            dv.putIfAbsent(wv , q);
        }

        String[] ans = new String[n];

        for(int i = 0 ; i< n  ; i++){
            ans[i] = solve(queries[i]);
        }

        return ans ;
    }


    public String solve(String query){
        if(hset.contains(query))
         return query ;

         String qL = query.toLowerCase();
         if(lc.containsKey(qL))
         return lc.get(qL);

         String wv = dvf(qL);
         if(dv.containsKey(wv))
         return dv.get(wv);


         return "";

    }

    public static String dvf(String q){
        String wv = "";
        for(char c : q.toCharArray()){
            if(isVowel(c)){
                wv += '*';
            }else{
                wv += c;
            }
        }
        return wv;
    }

    public static boolean isVowel(char c ){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c == 'u' ){
            return true ;
        }
        return false;
    }
}

