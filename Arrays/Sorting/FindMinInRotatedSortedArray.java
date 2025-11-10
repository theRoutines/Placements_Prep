// LC153
// [4,5,6,7,0,1,2,3] - THIS IS A ROTATED SORTED ARRAY.
// If i use brute foce i can O(n) complexity. 
//   To optimize, we can use Binary Seach to get o(log n)
// Logic is :- If arr[mid] > arr[roght] , then move left pointer to mid+1;
//    arr[mid] = 7, arr[right] = 3,  so, 7>3, then do left = mid+1,  arr[left] = 0;

class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(left<right)
        {
            int mid = left + (right-left)/2;
            if(nums[mid]>nums[right])
            {
                left = mid+1;
            }
            else
            {
                right = mid;
            }
        }
        return nums[left];
    }
}
