class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int res = 0 , maxLeft = 0 ,  maxRight = 0 , left = 0 , right = n-1;
        while(left <= right){
            if(height[left] <= height[right]){
                if(height[left] >= maxLeft){
                    maxLeft = height[left];
                }
                else{
                    res += maxLeft - height[left];
                }
                left++;
            }
            else{
                if(height[right] >= maxRight){
                    maxRight = height[right];
                }
                else{
                    res += maxRight - height[right];
                }
                right--;
            }
        }

        return res;
    }
}