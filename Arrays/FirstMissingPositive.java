class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Place each number in its right place if possible
        for (int i = 0; i < n; i++) {
            // while current number is in range and not at correct position,
            // and avoid infinite loop by checking equality.
            while (nums[i] >= 1 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int correctIdx = nums[i] - 1;
                // swap nums[i] and nums[correctIdx]
                int tmp = nums[correctIdx];
                nums[correctIdx] = nums[i];
                nums[i] = tmp;
            }
        }

        // Now find first index i such that nums[i] != i+1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) return i + 1;
        }

        // If all 1..n are present, answer is n+1
        return n + 1;
    }
}
