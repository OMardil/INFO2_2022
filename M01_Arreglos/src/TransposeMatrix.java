class Solution {
    public int[][] transpose(int[][] A) {
        
        if (A == null)
            return null;
        
        int newRow = A.length;
        int newCol = A[0].length;
        
        int[][] newMatrix = new int[newCol][newRow];
        
        for(int row = 0; row<newRow; row++){
            for(int col = 0; col<newCol; col++){
                newMatrix[col][row] = A[row][col];
            }
        }
        
        return newMatrix;
        
    }
}