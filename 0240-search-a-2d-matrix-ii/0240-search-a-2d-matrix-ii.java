class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
         int row = matrix.length - 1 ;
        int col = matrix[0].length - 1;
        int i = 0 , j = col;
        while(i <= row && j >= 0 ){
            if(matrix[i][j] == target){
                return true;
            }
            else if(matrix[i][j] > target){
                 j--;
            }
            else{
                i++;
            }
        }

        return false;
    }
}