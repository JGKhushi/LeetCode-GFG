class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        int n = s.length();
        int j = 0;
        int ans = 0 ;
        int i =0 ;
       while(i< n){
            hmap.put(s.charAt(i) , hmap.getOrDefault(s.charAt(i) , 0) + 1);
            if(hmap.size() >= 3 ){

            while(hmap.size() >= 3){
                ans += n - i ;
                hmap.put(s.charAt(j),hmap.getOrDefault(s.charAt(j) , 0) - 1);
                
                if(hmap.get(s.charAt(j)) == 0){
                    hmap.remove(s.charAt(j));
                }
                j++;
               
            }}
            i++;
        }
        
        return ans;
    }
}