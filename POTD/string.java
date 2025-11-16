class Solution {
    public int numSub(String s) {
        long MOD = 1_000_000_007;
        long count = 0; 
        long result = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++; // increase streak of 1's
            } else {
                // end of a block of 1's
                result = (result + (count * (count + 1) / 2)) % MOD;
                count = 0;
            }
        }

        // If string ends with 1's, add the last block
        result = (result + (count * (count + 1) / 2)) % MOD;

        return (int) result;
    }
}
