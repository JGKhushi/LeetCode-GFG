class Solution {
    public int subarraySum(int[] nums, int k) {

    int n = nums.length;
    int[] pref = new int[n];
    pref[0] = nums[0];
     for(int i = 1; i< n ; i++ ){
        pref[i] = pref[i-1] + nums[i]; 
     }

    int ans = 0;
    for(int i = 0 ; i< n ; i++){
        for(int j = i ; j< n ; j++){
              int curr = (i == 0) ? pref[j] : pref[j] - pref[i - 1];
            if(curr == k){
                ans++;
            }
        }
    }

    return ans;

    }
}