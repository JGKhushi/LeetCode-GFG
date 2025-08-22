class Solution {
    public int minimumArea(int[][] arr) {
        int t = Integer.MAX_VALUE , b = Integer.MIN_VALUE , l = Integer.MAX_VALUE , r= Integer.MIN_VALUE;
        int n = arr.length;
        int m = arr[0].length ;
        int ans = 0 ;
        // check for the first row and last row
        for(int i= 0 ; i< n ; i++ ){
            for(int j =0 ; j<m ; j++){
                if(arr[i][j] == 1){
                    t = Math.min(i,t);
                    b = Math.max(i , b);
                    l = Math.min(j , l);
                    r = Math.max(r,j);
                }
                
         
            }


         }
            int length = r - l + 1;
            int breadth = b - t + 1;

            return length * breadth;

       
    }
}