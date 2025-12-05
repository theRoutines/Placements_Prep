class Solution {
    public int countPartitions(int[] nums) {
        long sum = 0;                // use long to avoid overflow for large values
        for (int x : nums) {
            sum += x;
        }
        // If total sum is even → all n-1 splits valid, else 0
        return (sum % 2 == 0) ? (nums.length - 1) : 0;
    }
}
