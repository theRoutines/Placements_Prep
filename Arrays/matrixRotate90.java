// BASICALLY WE HAVE TWO APPROACHES TO SOLVE THIS QUESTIONS :- 
// BRUTE FORCE = O(n^2) , O(n^2)
// OPTIMIZED = O(n^2) , O(1)
//THIS IS THE OPTIMIZED APPROACH WHERE WE FIRST TRANPOSE THEN REVERSE THE MATRIX


class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //matrix[i][n-1-j]  =  fetches the right most element. 
    
        for(int i=0;i<n;i++)
        {
            for(int j = 0;j<n/2;j++)     //loop will run only for n/2 as it would reduce complexity 
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];  
                matrix[i][n-1-j] = temp;
            }
        }
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
        
    }
}