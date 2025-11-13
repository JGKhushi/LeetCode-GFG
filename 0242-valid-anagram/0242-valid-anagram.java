import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> hmap1 = new HashMap<>();
        HashMap<Character, Integer> hmap2 = new HashMap<>();

        int n = s.length();

        for (int i = 0; i < n; i++) {
            hmap1.put(s.charAt(i), hmap1.getOrDefault(s.charAt(i), 0) + 1);
            hmap2.put(t.charAt(i), hmap2.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> e : hmap1.entrySet()) {
            char k = e.getKey();
            int v = e.getValue();

            if (!hmap2.containsKey(k) || hmap2.get(k) != v ) {
                return false;
            }
        }

        return true;
    }
}
