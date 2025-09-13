import java.util.*;

class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        int vf = 0, cf = 0; // vf = vowel frequency, cf = consonant frequency

        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            char k = entry.getKey();
            int v = entry.getValue();

            if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u') {
                vf = Math.max(vf, v);
            } else {
                cf = Math.max(cf, v);
            }
        }

        return vf + cf;
    }
}
