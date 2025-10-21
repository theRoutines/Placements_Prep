// the treeset approach is :- O(NLOGN)
// WE HAVE TO USE HASHSET APPROACH :- O(N)



//TREESET - take elements in treeset, chnage them to arraylist then perfrom your operations
import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        TreeSet<Integer> set = new TreeSet<>();
        for (int i : nums) set.add(i);

        ArrayList<Integer> list = new ArrayList<>(set);
        int n = list.size();
        int count = 1;
        int maxCount = 1;

        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) + 1 == list.get(i + 1)) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1; // reset to 1, not 0
            }
        }

        maxCount = Math.max(maxCount, count); // check at the end
        return maxCount;
    }
}


//HASHSET - 