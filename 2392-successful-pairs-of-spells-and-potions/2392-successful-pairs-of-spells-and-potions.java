class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int n = spells.length ;
        int m = potions.length;
        int ans[] = new int[n];
 
       Arrays.sort(potions);

      
       for(int i = 0 ;i< n ;i++){
        int l = 0 , r = m-1 , idx = m;
        while(l <= r){
            int mid = (l+r)/2 ;
            if((long)spells[i] * potions[mid] >= success ){
                r = mid - 1;
                idx = mid ;
            }else{
                l = mid + 1;
            }
        }
        ans[i] = m - idx;
       }

        return ans ;
    }
}