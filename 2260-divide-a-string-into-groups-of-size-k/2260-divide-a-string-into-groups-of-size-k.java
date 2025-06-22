class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int totalParts = (int) Math.ceil((double) n / k);
        String[] result = new String[totalParts];

        for (int i = 0; i < totalParts; i++) {
            int start = i * k;
            int end = Math.min(start + k, n);
            StringBuilder chunk = new StringBuilder(s.substring(start, end));

            while (chunk.length() < k) {
                chunk.append(fill);
            }

            result[i] = chunk.toString();
        }

        return result;
    }
}
