class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int ans = 0;
        for(int i = 0 ; i<n-2  ; i++){
            for(int j = i+1 ; j<n-1 ; j++){
                for(int k = j+1 ; k<n ; k++){
                    if((Math.abs(arr[j] - arr[i]) <= a ) && (Math.abs(arr[k] - arr[j] )<= b) && (Math.abs(arr[i] -                   arr[k]) <= c)){
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[j]);
                        ans++;
                    } 
                }
            }
        }

        return ans;
    }
}