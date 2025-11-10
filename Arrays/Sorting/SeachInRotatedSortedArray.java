// INTUITION :- 
// In rotated sorted question, we often get to see that from the mid element, one half would be sorted and other hafl would not be sorted
// So, Binary seach does elemination approach, if rejects half based on its condition but in this question we have to reject based on different approach. 
// Identify the sorted half - arr[left] < arr[mid]  (condition always true for sorted array )
// Then check, do the sorted half contains the target, if not eliminate that half;

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
