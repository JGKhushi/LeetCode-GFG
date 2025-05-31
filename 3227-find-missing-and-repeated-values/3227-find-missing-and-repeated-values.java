class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {
       HashMap<Integer,Integer> mp = new HashMap<>();
        int n= arr.length;
        int m = arr[0].length;
        int[] ans = new int[2];
       for(int i = 0 ; i< n  ; i++){
        for(int j = 0 ; j< m ; j++){
            mp.put(arr[i][j] , mp.getOrDefault(arr[i][j] , 0)+1);
            int val = mp.get(arr[i][j]);
            if(val == 2){
                ans[0] = arr[i][j];
            }
        }
       }

       for(int i = 1 ; i<= n*n ; i++){
        if(!mp.containsKey(i)){
            ans[1] = i;
            break;
        }
       } 

       return ans;
    }
}