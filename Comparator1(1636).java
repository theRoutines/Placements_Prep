import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        // Count frequencies
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        // Convert array -> boxed list so we can sort with comparator
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        // Sort by:
        // 1. frequency ascending
        // 2. value descending
        Arrays.sort(arr, (a, b) -> {
            int freqA = freq.get(a);
            int freqB = freq.get(b);
            if (freqA == freqB) {
                return b - a; // same freq → larger value first
            }
            return freqA - freqB; // lower freq first
        });

        // convert back to primitive array
        return Arrays.stream(arr).mapToInt(i -> i).toArray();
    }
}
