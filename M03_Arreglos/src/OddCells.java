class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        
        int[][] out = new int[n][m]; 
        
        for(int[]index: indices){

            //increase on single row
            for(int row=0; row<out.length; row++){
                out[row][index[1]]++;
            }
            
            //increase on column
            for(int col=0; col<out[0].length; col++){
                out[index[0]][col]++;
            }    
        }
        
        
        int odd = 0;
        for(int row=0; row<out.length; row++) {
            for(int col=0; col<out[row].length; col++) {
                if (out[row][col] % 2 == 1)
                    odd++;
            }  
        }
        
        return odd;
                
    }
}