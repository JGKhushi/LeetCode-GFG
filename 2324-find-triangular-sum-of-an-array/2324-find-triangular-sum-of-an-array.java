class Solution {
    public static int[] helper(int[] nums , int n){
        
        for(int i = 0  ;i< n ; i++){
            int sum  = nums[i] + nums[i+1];
            if(sum > 9){
                sum = sum %10 ;
            }
            nums[i] = sum ;
        }
        return nums;
    }
    public int triangularSum(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        int temp[] = new int[n];
        
        for(int i = 0 ; i<n ; i++){
           temp[i] = nums[i];        
        }
    
        for(int i = 1 ; i< n ; i++){
          temp = helper(temp , n-i);
        }

        return temp[0];
    }
}