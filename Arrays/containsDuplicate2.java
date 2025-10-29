// MY APPROACH - USING 2 FOR LOOPS  -  O(n^2)
// OPTIMIZED APPROACH - HASHSET 
//                     HASHMAP - O(n^1)





class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int prevIndex = map.get(nums[i]);
                if(Math.abs(i-prevIndex)<=k)
                {
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}

