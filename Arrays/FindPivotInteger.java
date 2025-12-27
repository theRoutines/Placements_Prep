// THIS IS THE BRUTE FORCE APPROACH 
class Solution {
    public int calculateSum(int start, int end){
        int sum = 0;
        for(int i=start;i<=end;i++)
        {
            sum = sum+i;
        }
        return sum;
    }
    int leftSum,rightSum = 0;
    public int pivotInteger(int n) {
        int pivot = -1;
        for(int i=1;i<=n;i++)
        {
            leftSum = calculateSum(0,i);
            rightSum = calculateSum(i,n);
            if(leftSum == rightSum)
            {
                pivot = i;
            }
        }
        return pivot;
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

//

