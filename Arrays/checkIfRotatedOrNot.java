// I WROTE CODE TO ROTATE 90 DEGREE, SO WE USE A LOOP 4 TIMES, FOR 360 DEGREE
// 


class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        // Try all 4 rotations
        for (int r = 0; r < 4; r++) {
            if (isSame(mat, target)) return true; // check if equal

            // Rotate mat 90° clockwise
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][n - 1 - j];
                    mat[i][n - 1 - j] = temp;
                }
            }
        }

        return false; // none of the 4 rotations matched
    }

    // Helper function to compare two matrices element by element
    private boolean isSame(int[][] a, int[][] b) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }
}
