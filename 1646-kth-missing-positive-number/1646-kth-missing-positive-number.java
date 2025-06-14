class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length ;
       
        int idx = 0 ;
        for(int i = 1 ; i  <= arr[n-1] ; i++){
            if(i != arr[idx]){
                k--;
            }else{
                idx++;
            }
            if(k == 0){
                return i;
            }
        }

        return arr[n-1]+ k ;
    }
}