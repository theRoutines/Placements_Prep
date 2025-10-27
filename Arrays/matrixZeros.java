// FIRST OF ALL, I USED MY APPROACH, I THOUGHT OF CREATING A HASHMAP AND STORING THE INDEXES OF ALL ZEROS AS K,V, BUT I FORGOT
//THAT HASHMAP STORES UNIQUE KEYS, SO WHENEVER I WAS ADDING A K,V IT USED TO OVERWRITE THE BEFORE ONE
// SO THEN I USED HASHSET, TWO HASHSETS FOR ROWS AND COLS.  - o(mxn) , O(m+n)log(n) 
// THEN THERE IS ANOTHER APPROACH TO PROVIDE IN-PLACE TRAVERSAL.  O(mxn) , O(1)


import java.util.HashSet;

class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroCols = new HashSet<>();

        // Phase 1: identify rows and cols that should be zeroed
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        // Phase 2: set cells to zero if their row or column needs it
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeroRows.contains(i) || zeroCols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Optional: print result
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}



// OPTIMIZED SOLTUION : 
class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1: Check if first row has any zeros
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Step 2: Check if first column has any zeros
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Step 3: Use first row and column as markers
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // mark row
                    matrix[0][j] = 0; // mark column
                }
            }
        }

        // Step 4: Set matrix cells to zero using markers
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 5: Handle first row separately
        if (firstRowZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 6: Handle first column separately
        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
