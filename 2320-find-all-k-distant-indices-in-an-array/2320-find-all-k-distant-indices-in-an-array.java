class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
    List<Integer> idx = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    int n = nums.length;
    
    for(int i=0 ; i < n ; i++){
        if(nums[i] == key){
            idx.add(i);
        }
   }


   for(int i = 0 ; i< n ; i++){
    int cnt = 0 ;
    for(int j = 0 ; j<idx.size() ; j++){
        if(Math.abs( i- (idx.get(j))) <= k){
            cnt++;
        }
    }
    if(cnt > 0){
        ans.add(i);
    }
   }

   return ans;
    }
}