class Solution {
    public void swap(int[] arr ,int left , int right){
            while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        }
    public void rotate(int[] arr, int k) {
        int n = arr.length;        
        k = k%n;
        swap(arr , 0 , n-k-1);
        swap(arr , n-k, n-1);
        swap(arr , 0 , n-1);


        
    }
}