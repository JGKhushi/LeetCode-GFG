class Solution {
   
    public static void sort(int[] nums , int right ,int  left){
        while(right>left){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            right--;
            left++;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
       int i = n-1;
            while(i>0){
                if(nums[i] > nums[i-1]){
                break;
                }
            i--;
            }
        if(i==0){
            Arrays.sort(nums);
            return;
        }
       sort(nums,n-1,i);

        for(int j=i ; j<n ; j++){
            if(nums[i-1] < nums[j]){
                int temp = nums[j];
       nums[j] = nums[i-1];
       nums[i-1] = temp;
       break;
            }
        }
       
        
        return;
           
        
    }
}