// TIME COMPLEXITY - O(n)
// SPACE COMPLEXITY - O(1)

MOST OPTIMIZED




class Solution {
    public static int largest(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int i = 0;
        while(n-->0)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            i++;
        }
        return max;
        
    }
}