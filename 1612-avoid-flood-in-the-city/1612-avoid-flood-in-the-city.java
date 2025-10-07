import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int n = rains.length;
        int ans[] = new int[n];
        ArrayList<Integer> zi = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (rains[i] == 0) {
                // store index of zero day
                zi.add(i);
                continue;  // move to next day
            }

            // if lake already full -> need to dry before
            if (hmap.containsKey(rains[i])) {
                // find a zero day before current i
                boolean dried = false;

                for (int j = 0; j < zi.size(); j++) {
                    int idx = zi.get(j);
                    if (idx > hmap.get(rains[i])) {
                        ans[idx] = rains[i]; // dry that lake
                        zi.remove(j);         // remove that dry day
                        dried = true;
                        break;
                    }
                }

                if (!dried) {
                    return new int[] {}; // no valid dry day
                }
            }

            // mark lake full on this day
            hmap.put(rains[i], i);
            ans[i] = -1;
        }

        // fill remaining zero days with any lake (say 1)
        for (int i : zi) {
            ans[i] = 1;
        }

        return ans;
    }
}
