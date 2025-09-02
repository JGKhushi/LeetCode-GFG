class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> hmap = new HashMap<>();

        int n= s.length();

        for(int i = 0 ; i< n ; i++){
            hmap.put(s.charAt(i) , hmap.getOrDefault(s.charAt(i) , 0)+ 1);
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(hmap.entrySet());
        list.sort((a,b)->b.getValue() - a.getValue());
 
        String ans = "";
        for(Map.Entry<Character, Integer> e :list){
            int v = e.getValue();
            char k = e.getKey();

            while(v-- > 0){
                ans+=k ;
            }
        }

        return ans;
    }
}