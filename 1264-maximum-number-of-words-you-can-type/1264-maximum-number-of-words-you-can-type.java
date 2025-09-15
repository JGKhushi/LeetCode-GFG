class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> hset = new HashSet<>();
        int n = text.length();
        int m = brokenLetters.length() ;
        for(int i = 0; i<m ; i++){
            hset.add(brokenLetters.charAt(i));
        }

        boolean flag = false;
        int ans = 0 , total = 0 ;
        for(char c : text.toCharArray()){
            if(hset.contains(c)){
                flag = true;
            }
            if(c == ' ' && flag == true){
                ans++;
                flag = false;
            }

            if(c == ' '){
                total++;
            }
        }

        if(flag == true){
            ans++;
        }

        total++;

        return total - ans ;
    }
}