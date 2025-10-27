// THE LOGIC OVERHER WAS: 
// TAKE 1 ELEMENT, IF POS PLACE IT IN STARTING AND DO INDEX += 2
// TAKE NEGATIVE ELEMENT, PLACE IT AND DO INDEX += 2;


class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int posIndex =  0;
        int negIndex = 1;
        for(int i:nums)
        {
            if(i>0)
            {
                arr[posIndex] = i;
                posIndex += 2;
            }
            if(i<0)
            {
                arr[negIndex] = i;
                negIndex += 2;
            }
        }
        return arr;
    }
}