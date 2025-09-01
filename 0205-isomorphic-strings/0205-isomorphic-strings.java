class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();

HashMap<Character,Character> map = new HashMap<>();

    for(int i = 0 ;i  < n ; i++){
        if(map.containsKey(s.charAt(i))){
            if(map.get(s.charAt(i)) == t.charAt(i)){
                continue;
            }
            else{
            return false;
        }}
        else{
         map.put(s.charAt(i) , t.charAt(i));
        }
       
    }
HashMap<Character,Character> map2 = new HashMap<>();
     for(int i = 0 ;i  < n ; i++){
        if(map2.containsKey(t.charAt(i))){
            if(map2.get(t.charAt(i)) == s.charAt(i)){
                continue;
            }
            else{
            return false;
        }}
        else{
         map2.put(t.charAt(i) , s.charAt(i));
        }
       
    }

    return true ;

    }
}