// TIME - O(n)
// SPACE - O(n)



import java.util.*;

class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count even numbers only
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        // Step 2: If no even number found
        if (map.isEmpty()) {
            return -1;
        }

        // Step 3: Find most frequent (and smallest if tie)
        int maxFreq = 0;
        int minKey = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();

            // If higher frequency found → update both
            if (freq > maxFreq) {
                maxFreq = freq;
                minKey = key;
            }
            // If tie → choose smaller key
            else if (freq == maxFreq && key < minKey) {
                minKey = key;
            }
        }

        return minKey;
    }
}
