// PRINT HOSE ELEMTNS WHO HAVE OCCURRENCE GREATER THAN N/3
// THIS PROGRAMTELLS THE USAGE OF COLLECTIONS
// I STORED ALL THE VALUES IN A HASHMAP, AND WHILE CHECKING FOR THE CONDITION OF OCCURRENCES OF VALUES FOR N/3, I ADDED THE ELEMENT INTO THE ARRAYLIST

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue() > n/3.0)
            {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
