// I FIRST OF ALL, THOUGHT TO COUNT THE ELEMENTS OCCURRENCES AND PLACE THEM IN HASHMAP 
// THEN I SIMPLY PRINTED THEM 







import java.util.*;

class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;

        // Count occurrences of 0, 1, and 2
        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        // Refill nums in sorted order (in-place)
        int index = 0;
        for (int i = 0; i <= 2; i++) {  // ✅ must include 2
            int count = mp.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                nums[index++] = i;  // ✅ write directly into nums
            }
        }

        // Print to check
        System.out.println(Arrays.toString(nums));
    }
}
