//Now — when we’re searching for:

//Any occurrence: stop when you find the target.

//First occurrence: keep moving left when you find it.

//Last occurrence: keep moving right when you find it.

// Let’s see why.
//LC 34

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int first = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                first = mid;
                right = mid - 1; // keep going left
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                last = mid;
                left = mid + 1; // keep going right
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(s.searchRange(nums1, 8))); // [3, 4]

        int[] nums2 = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(s.searchRange(nums2, 6))); // [-1, -1]

        int[] nums3 = {};
        System.out.println(Arrays.toString(s.searchRange(nums3, 0))); // [-1, -1]
    }
}
