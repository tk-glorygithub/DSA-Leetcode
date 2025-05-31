class Solution {
    public int[][] transpose(int[][] matrix) {

        int [][] result =  new int[matrix[0].length][matrix.length];

       //   int[][] res = new int[matrix[0].length][matrix.length];
        for(int i =0 ;i < matrix.length;i++){
            for(int j = 0 ;j< matrix[0].length ;j++){
                // int temp = matrix[i][j];
                // matrix[i][j] = matrix[j][i];
                // matrix[j][i] = temp ;
                result[j][i] = matrix[i][j];
 
            }
        }
        return result;
                            
    }
}