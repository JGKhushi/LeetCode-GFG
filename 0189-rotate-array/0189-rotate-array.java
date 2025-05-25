class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        if(n==1){
            return;
        }
        int temp[] = new int[n];
    k = k%n ;
        for(int i = 0 ; i<k ; i++){
           temp[i] = arr[n-k+i]; 
        }
        for(int j=0 ; j < n-k ; j++){
           arr[n-1-j] = arr[n-k-1-j];
        }
        for(int i = 0 ; i<k ; i++){
            arr[i] =  temp[i];
        }

        return;
    }
}