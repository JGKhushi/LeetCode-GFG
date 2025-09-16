import java.util.*;

class Solution {
    // gcd
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // lcm using long for safety, return int as problem expects integers
    private int lcm(int a, int b) {
        int g = gcd(a, b);
        long prod = (long) a * (long) b;
        return (int) (prod / g);
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int num : nums) {
            int current = num;

            // keep merging with the last element while gcd > 1
            while (!arr.isEmpty()) {
                int last = arr.get(arr.size() - 1);
                int g = gcd(last, current);
                if (g == 1) break;           // no more merges possible
                arr.remove(arr.size() - 1);  // merge with last
                current = lcm(last, current);
                // now current may merge with new last again -> loop continues
            }

            arr.add(current);
        }

        return arr;
    }
}
