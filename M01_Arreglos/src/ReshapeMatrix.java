class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        if (nums == null)
            return null;
        
        if (nums[0].length * nums.length != r*c )
            return nums;        
        
        int[][] newMatrix = new int[r][c];
        int elementIndex = 0;
        
        for(int row=0; row<nums.length; row++){
            for(int column=0; column<nums[row].length; column++){
                newMatrix[elementIndex / c][elementIndex % c] = nums[row][column];    
                elementIndex++;
            }
        }
    
        return newMatrix;
    }
}