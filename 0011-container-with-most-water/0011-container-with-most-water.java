class Solution {
    public int maxArea(int[] height) {
        int n= height.length;
        int ans = 0 ;
        int left = 0 ; int right = n-1;
        while(left < right){
            int curr = (right - left ) * Math.min(height[left] , height[right]);
            ans = Math.max(curr , ans);
            if(height[left] <= height[right]){
                left++;
            }else{
                right--;
            }
        }

        return ans;
    }
}