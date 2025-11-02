// WE HAD TO FIND THE ELEMENTS THAT ARE NOT PRESENT IN THE ARRAY BETWEEN THE MAX AND THE MIN ELEMENT FO THE ARRAY
// MY APPROACH - BRUTE FORCE, USED TWO LOOPS AND CHECK FOR EACH ELEMENT
// OPTIMIZED - USE HASHSET, COPY THE ELEMETNS, THE USE INBUILT PROPERTY SET.CONTAINS

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int max = 0; int min = nums[0];

        for(int i=0;i<n;i++)
        {
            if(max<nums[i])
            {
                max = nums[i];
            }
            if(min>nums[i])
            {
                min = nums[i];
            }
        }
        int c = 0;int target = 0;
        for(int i=min;i<=max;i++)
        {
            c = 0;
            target = i;
            for(int j=0;j<n;j++)
            {
                if(nums[j] == target)
                {
                    c++;
                }
            }
            if(c==0)
            {
                list.add(i);
            }
        }
        return list;

    }
}



// OPTIMIZED APPROACH 
import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        int min = nums[0], max = nums[0];

        // Find min & max
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Store array elements in a HashSet
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Check which numbers between min & max are missing
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
