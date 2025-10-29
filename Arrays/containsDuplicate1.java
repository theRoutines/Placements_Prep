import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // duplicate found
            }
            set.add(num);
        }
        return false; // no duplicates
    }
}


class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue()>1)
            {
                return true;
            }
        }
        return false;
    }
}