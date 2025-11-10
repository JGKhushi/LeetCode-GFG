class Solution {
    public String longestString(String[] words) {
        Arrays.sort(words);
        Set<String> st = new HashSet<>();
        String res = "";
        for (String w : words) {
            if (w.length() == 1 || st.contains(w.substring(0, w.length() - 1))) {
                st.add(w);
                if (w.length() > res.length()) {
                    res = w;
                }
            }
        }
        return res;
    }
}