class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n= mat.length;
        int m = mat[0].length;
        int[] ans = new int[n*m];
        int k = 0 ;

        for(int i = 0 ; i< n+m-1 ; i++ ){
            int a , b ;
            if(i%2 == 0){
                a = (i<n)?i:n-1;
                b = i-a ;
                while( a>= 0 && b < m){
                    ans[k++] = mat[a][b];
                    a--;
                    b++;
                }
            }
            else{
                b =  (i<m)?i : m-1;
                a = i-b;
               while (a < n && b >= 0) {
                    ans[k++] = mat[a][b];
                    a++;
                    b--;
                }
            }
        }

        return ans;
    }
}