class Solution {
    int ug = 0 ;
    int g = 1 ;
    int gu = 2 ;
    int wa = 3 ;

    public void markguarded(int row , int col , int[][] grid , int m , int n ){
        for(int i = row-1 ; i>= 0 ; i--){
            if(grid[i][col] == g || grid[i][col] == wa){
                break ;
            }
            grid[i][col] = gu ;
        }

        for(int i = row + 1 ;i<m ; i++){
            if(grid[i][col] == g || grid[i][col] == wa){
                break ;
            }
            grid[i][col] = gu ;
        }

        for(int j = col-1 ; j>=0 ; j--){
            if(grid[row][j] == g || grid[row][j] == wa){
                break;
            }
            grid[row][j] = gu ;
        }

        for(int j = col + 1 ; j< n  ; j++){
            if(grid[row][j] == g || grid[row][j] == wa){
                break;
            }
            grid[row][j] = gu ;
        }
    }
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];

        for(int[] guard : guards){
            grid[guard[0]][guard[1]] = g ;
        }

        for(int[] wall : walls ){
            grid[wall[0]][wall[1]] = wa ;
        }

        //mark guarded 
        for(int[] guard : guards){
            markguarded(guard[0] , guard[1] , grid , m , n);
        }

        int count = 0 ; 

        for(int[] row  : grid){
            for(int cell : row){
                if(cell == ug){
                    count++;
                }
            }
        }

        return count;

    }
}