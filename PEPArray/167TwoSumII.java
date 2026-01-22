class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n-1;
        int res[] = new int[2];
        
        while(left<right){
            int sum = 0;
            sum = numbers[left] + numbers[right];

            if(sum<target){
                left ++;
            }
            if(sum>target){
                right --;
            }
            if(sum==target){
                res[0] = left+1;
                res[1] = right+1;
                break;
            }
        }
        return res;
    }
}

// -------------------------------------------------------------------------------------------------------------- 
//USING HASHING 
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int complement = target - numbers[i];

            if (map.containsKey(complement)) {
                return new int[]{
                    map.get(complement) + 1,
                    i + 1
                };
            }

            map.put(numbers[i], i);
        }
        return new int[]{-1, -1};
    }
}
