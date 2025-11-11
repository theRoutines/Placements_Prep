class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If middle element is less than the next one, move right
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                // Otherwise, move left
                right = mid;
            }
        }

        // left and right will converge to a peak element
        return left;
    }
}
