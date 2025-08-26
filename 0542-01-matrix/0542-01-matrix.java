class Solution {
    public int[][] updateMatrix(int[][] mat) {
       Queue<int[]> q = new LinkedList<>();

       int row = mat.length;
       int col = mat[0].length;
       int steps = 0 ; 
       int vis[][] = new int[row][col];
       int ans[][] = new int[row][col];

       for(int i = 0;  i< row ; i++){
        for(int j=0  ; j< col  ; j++){
            if(mat[i][j] == 0){
                q.add(new int[]{i , j , 0});
                vis[i][j] = 1;
            }else{
                vis[i][j] = 0;
            }
        }
       } 

       int[] delrow = {-1,0 , +1 , 0};
       int[] delcol = {0 , +1 , 0 , -1};

       while(!q.isEmpty()){
         int arr[] = q.poll();
         int r = arr[0];
         int c = arr[1];
         int s = arr[2];

         vis[r][c] = 1;
         ans[r][c] = s;
         
         for(int i =0;  i< 4 ; i++){
            for(int j = 0 ; j< 4 ; j++){
                int drow = delrow[i]+r;
                int dcol = delcol[i]+c;
                if( drow<row && drow>=0 && dcol<col && dcol>= 0 && vis[drow][dcol] == 0 ){
                q.add(new int[]{drow , dcol , s+1});
                vis[drow][dcol] = 1;
                }
            }
         }
       }


       return ans;    
    }
}