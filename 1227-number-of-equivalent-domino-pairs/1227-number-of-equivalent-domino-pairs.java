class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String, Integer> hmap = new HashMap<>();
        int n = dominoes.length;
        int count = 0;

        for(int i = 0 ; i < n ; i++) {
            int a = dominoes[i][0];
            int b = dominoes[i][1];

            // Sort each domino to ensure [a, b] and [b, a] are treated the same
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            String key = a + "," + b;

            // If the key already exists, it forms pairs with all its previous occurrences
            count += hmap.getOrDefault(key, 0);
            hmap.put(key, hmap.getOrDefault(key, 0) + 1);
        }

        return count;
    }
}
