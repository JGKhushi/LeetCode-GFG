class Solution {
    public int trap(int[] height) {
        int ans = 0 ;
        int n = height.length;
        int maxLeft = 0 , maxRight = 0 , left = 0 , right = n-1 ;
        while(left <= right ){
            if(height[left] <= height[right]){
                if(height[left] >= maxLeft){
                    maxLeft = height[left];
                }else{
                    ans  += maxLeft - height[left];
                }
                left++;
            }
            else{
                if(maxRight <= height[right]){
                    maxRight = height[right];
                }else{
                    ans += maxRight - height[right];
                }
                right--;
            }
        }

        return ans;
    }
}