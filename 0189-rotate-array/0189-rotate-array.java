class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k%n;
        int arr[] =  new int[k];
        int i = 0 ;
        int t = k ;
        while(k-- > 0){
            arr[i] = nums[n-i-1];
            System.out.println(arr[i] + "  " + nums[n-i-1]);
            i++;
        }
        k= t;
        int j = n - k - 1 ;
        i= 0 ;

        for(int a = 0 ; a <n ; a++){
            System.out.println(nums[a]);
        }
        while(j != -1 ){
             
            nums[n-i-1] = nums[j] ;
            System.out.println(nums[j] + "  " + nums[n-i-1]);
            j--;i++;
        }
        i = 0 ;
        while(i < k){
            nums[i] = arr[k - i - 1 ];
            i++;
        }
    }
}