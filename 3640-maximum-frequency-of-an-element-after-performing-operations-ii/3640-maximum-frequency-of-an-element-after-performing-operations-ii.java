class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
       int mx = Arrays.stream(nums).max().getAsInt() + k;
       TreeMap<Integer,Integer> tmap = new TreeMap<>();
       HashMap<Integer,Integer>freq = new HashMap<>();

        for(int num : nums){
           freq.put(num , freq.getOrDefault(num , 0) + 1);
           int l = Math.max(num - k , 0);
           int r = Math.min(num + k , mx);

           tmap.put(l , tmap.getOrDefault(l,0)+1);  
           tmap.put(r+1 , tmap.getOrDefault(r+1,0)-1);  

           tmap.putIfAbsent(num , tmap.getOrDefault(num , 0));  
        }
        int result = 1 ;
        int cumSum = 0 ;

        for(Map.Entry<Integer,Integer> e : tmap.entrySet() ){
            int target = e.getKey();
            int val = e.getValue();
            
            cumSum += val;
            
            int targetFreq = freq.getOrDefault(target , 0);
            int needConversion = cumSum - targetFreq ;

            int maxPossibleFreq = Math.min(needConversion , numOperations);
            result = Math.max(result , targetFreq + maxPossibleFreq);
        }

        return result ;
    }
}