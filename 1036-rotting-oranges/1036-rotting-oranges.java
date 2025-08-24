class Solution {
    public int orangesRotting(int[][] grid) {
        int total  = 0 ;
        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j] != 0){
                    total++;
                }
            }
        }

        int dx[] = {0,1,0,-1};
        int dy[] = {1,0,-1,0};
        int ans = 0 ;
        int cnt = 0 ;
        while(!q.isEmpty()){
            int sz = q.size();
            cnt += sz;
            for(int i = 0 ; i< sz ; i++){
                int point[] = q.poll();
                for(int j =0 ; j< 4 ; j++){
                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j];
                    if(x >= row || y >= col || x< 0 || y < 0 || grid[x][y] == 2 || grid[x][y] == 0 ){
                        continue;
                    }
                    grid[x][y] = 2;
                    q.offer(new int[]{x,y});
                }
            }

            if(q.size() != 0){
                ans++;
            }
        }

    if(cnt == total){
        return ans;
    }

    return -1;


    }
}