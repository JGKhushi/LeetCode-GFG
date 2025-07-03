class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int startRow = 0  , endRow = mat.length - 1;

        while(startRow <= endRow){
            int maxCol = 0   , midRow = startRow + (endRow - startRow)/2;

            for(int col = 0 ;  col < mat[0].length ; col++){
                maxCol = mat[midRow][col] >= mat[midRow][maxCol] ? col : maxCol;
            }

            boolean topIsBig = midRow - 1 >= startRow && mat[midRow][maxCol] <  mat[midRow - 1][maxCol];
            boolean downIsBig = midRow + 1 <= endRow && mat[midRow][maxCol] <  mat[midRow + 1][maxCol];

            if(!topIsBig && !downIsBig){
                return new int[]{midRow , maxCol};
            }
            else if(topIsBig){
                endRow = midRow - 1;
            }
            else{
                startRow = midRow + 1;
            }
        }

        return null;
    }
}