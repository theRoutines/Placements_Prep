// BRUTE FORCE - O( n log n) and O(n)
class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] sorted = new int[n];
        for(int i=0;i<n;i++)
        {
            sorted[i] = heights[i];
        }
        Arrays.sort(sorted);
        int count = 0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i] != sorted[i])
            {
                count++;
            }
        }
        return count;
    }
}



// AS SOON AS WE SEE, OPERATION BASED ON SORTED ORDER OR COMPARISON BASED ON SORTED ORDER, THINK OF COUNTING SORT AS IT HAS COMPLEXITY OF O(n) BUT ONLY FOR SMALL RANGES
class Solution {
    public int heightChecker(int[] heights) {

        int[] count = new int[101];

        // count frequencies
        for (int h : heights) {
            count[h]++;
        }

        int index = 0;
        int result = 0;

        // rebuild sorted order on the fly
        for (int height = 1; height <= 100; height++) {
            while (count[height]-- > 0) {

                if (heights[index] != height) {
                    result++;
                }
                index++;
            }
        }

        return result;
    }
}
