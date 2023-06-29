class Solution {
    public void rotate(int[][] matrix) {
        int mat[][] = new int[matrix.length][matrix[0].length];
        int n = matrix.length;
        for(int i = 0;i < n;i++){
            for(int j = n - 1;j >= 0;j--){
              mat[i][n-1-j]  = matrix[j][i];
            }
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                matrix[i][j]  = mat[i][j];
            }
        }
    }
}
