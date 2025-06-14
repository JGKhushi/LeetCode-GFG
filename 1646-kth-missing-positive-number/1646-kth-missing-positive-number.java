class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length ;
        int count = 0;
        int idx = 0 ;
        for(int i = 1 ; i  <= arr[n-1] ; i++){
            if(i != arr[idx]){
                count++;
            }else{
                idx++;
            }
            if(count == k){
                return i;
            }
        }

        return arr[n-1]+ k - count;
    }
}