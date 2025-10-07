class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        
        HashMap<Integer, Integer> full = new HashMap<>(); // lake -> last day filled
        TreeSet<Integer> dryDays = new TreeSet<>(); // indexes of 0s
        
        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);    // store dry day index
                ans[i] = 1;        // default
            } else {
                int lake = rains[i];
                ans[i] = -1;       // raining day
                
                if (full.containsKey(lake)) {
                    // Find next dry day after lake was last filled
                    Integer dry = dryDays.higher(full.get(lake));
                    if (dry == null) return new int[0]; // no dry day available → flood
                    
                    ans[dry] = lake;   // dry that lake on this dry day
                    dryDays.remove(dry);
                }
                full.put(lake, i); // update last filled day
            }
        }
        return ans;
    }
}
