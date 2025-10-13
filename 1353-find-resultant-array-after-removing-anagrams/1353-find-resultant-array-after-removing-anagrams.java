class Solution {
    public static boolean checkAnagram(String a , String b){
        int n = a.length();
        int m = b.length();
        if(n!=m)return false;
        HashMap<Character,Integer> hmap1 = new HashMap<>();
        HashMap<Character,Integer> hmap2 = new HashMap<>();
        for(int i = 0 ; i< n ; i++){
            hmap1.put(a.charAt(i) , hmap1.getOrDefault(a.charAt(i) , 0) + 1);
            hmap2.put(b.charAt(i) , hmap2.getOrDefault(b.charAt(i) , 0) + 1);
        }
        
        for(Map.Entry<Character,Integer>e : hmap1.entrySet()){
            int aval = e.getValue();
            char achar = e.getKey();
            int bval = 0;
            if(hmap2.containsKey(achar)){
                bval = hmap2.get(achar);
                if(aval != bval)return false;
            }else{
                return false;
            }
        }
        return true;
    }
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
       
        for(int i = n-2 ; i>= 0 ; i--){
            String a = words[i+1];
            String b = words[i];
            boolean flag = checkAnagram(a,b);
            if(flag){
                words[i+1] = "";
            }
        }

       
        ArrayList<String> str = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            if(!words[i].equals("")){
            str.add(words[i]);
            }
        }

        return str;
    }
}