// LC 717
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        
        // Traverse until the second last bit
        while (i < bits.length - 1) {
            if (bits[i] == 1) {
                // two-bit character (10 or 11)
                i += 2;
            } else {
                // one-bit character (0)
                i += 1;
            }
        }
        
        // If we stop exactly at the last bit, it's a one-bit character
        return i == bits.length - 1;
    }
}


//WE DO NOT CHECK THE ALST CHARACTER FOR 0 AS IT WAS MANDATORY IN THE QUESTION THAT IT WOULD BE 0
